
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 


class BalanceString {
    private final char minChar;
    private final char maxChar;
    private final int distinctChars; // total distinct char count,

    public static final BalanceString EN_UPPER_INSTANCE = new BalanceString('A', 'Z');

    public BalanceString(char minChar, char maxChar) {
        this.minChar = minChar;
        this.maxChar = maxChar;
        this.distinctChars = maxChar - minChar + 1;

        if (distinctChars <= 0)
            throw new IllegalArgumentException("invalid range of chars: [" + minChar + ", " + maxChar + "]");
    }

    /**
     * Check minimal moves needed to make string balanced.
     *
     * @param str
     * @return count of moves
     */
    public int balanceCount(String str) {
        // System.out.printf("string to balance:\t%s\n", str);
        int len = str.length(); // get length,
        if (len <= 2) return 0; // corner cases,

        Map<Character, Integer> coMap = figureOccurs(str); // figure occurrences,
        Integer[] occurs = sortOccursReversely(coMap); // reversely order occurrences,

        int m = coMap.size(); // distinct char count,
        int maxN = (len < distinctChars ? len : distinctChars); // get max possible distinct char count, included,

        int smallestMoves = Integer.MAX_VALUE; // smallest moves, among all possible n,

        // check each possible n, and get its moves,
        for (int n = 1; n <= maxN; n++) {
            if (len % n == 0) {
                int moves = figureMoves(len, coMap, occurs, m, n);
                if (moves < smallestMoves) smallestMoves = moves;
            }
        }

        return smallestMoves;
    }

    /**
     * Figure occurs for each char.
     *
     * @param str
     * @return
     */
    protected Map<Character, Integer> figureOccurs(String str) {
        Map<Character, Integer> coMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c < minChar || c > maxChar)
                throw new IllegalArgumentException(c + " is not within range 'A-Z'");

            if (!coMap.containsKey(c)) coMap.put(c, 1);
            else coMap.put(c, coMap.get(c) + 1);
        }

        return coMap;
    }

    /**
     * Get reverse sorted occurrences.
     *
     * @param coMap
     * @return
     */
    protected Integer[] sortOccursReversely(Map<Character, Integer> coMap) {
        Integer[] occurs = new Integer[coMap.size()];

        coMap.values().toArray(occurs);
        Arrays.sort(occurs, Collections.reverseOrder());

        return occurs;
    }

    /**
     * Figure moves needed to balance.
     *
     * @param len   length of string,
     * @param coMap
     * @param m     original distinct elements count,
     * @param n     new distinct elements count,
     * @return count of moves,
     */
    protected int figureMoves(int len, Map<Character, Integer> coMap, Integer[] occurs, int m, int n) {
        int avgOccur = len / n; // average occurrence,
        int moves = 0;

        if (n == m) { // distinct chars don't change,
            for (Integer occur : occurs) {
                if (occur <= avgOccur) break;
                moves += (occur - avgOccur);
            }
        } else if (n < m) { // distinct chars decrease,
            for (int i = 0; i < n; i++) moves += Math.abs(occurs[i] - avgOccur); // for elements kept,
            for (int i = n; i < m; i++) moves += occurs[i]; // for elements to replace,
            moves >>= 1;
        } else { // distinct chars increase,
            for (int i = 0; i < occurs.length; i++) moves += Math.abs(occurs[i] - avgOccur); // for existing elements,
            moves += ((n - m) * avgOccur); // for new elements,
            moves >>= 1;
        }

        return moves;
    }

    public char getMinChar() {
        return minChar;
    }

    public char getMaxChar() {
        return maxChar;
    }

    public int getDistinctChars() {
        return distinctChars;
    }
}
















class Demo {

 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
          String str = cin.nextLine();
          BalanceString bs = new BalanceString('A','Z');
          int min = bs.balanceCount(str);
          ans.append(min+"\n");
        }
        System.out.print(ans);
   }

        
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  }