import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int N = cin.nextInt();
        int K = cin.nextInt();
        int count = 0;
        String str = "";
        HashSet<Integer> h1 = new HashSet<Integer>();
        StringBuffer ans = new StringBuffer();
        while(K-->0)
        {
           str = cin.nextLine();
           String strs[] = str.trim().split("\\s+");
           if(strs[0].equals("CLICK"))
           {
              int temp = Integer.parseInt(strs[1]);
              if(h1.add(temp))
              {
                count++;
              }
              else
              {
                h1.remove(temp);
                count--;
              }
           }
           else
           {
              count = 0;
              h1.clear();
           }
       ans.append(count+"\n");
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