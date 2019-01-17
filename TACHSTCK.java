import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int N = cin.nextInt();
        int D = cin.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
          arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int i=0;
        while(i<=N-1)
        {
            if(((i+1)<=(N-1)))
            if((arr[i+1]-arr[i])<=D)
            {
              count++;
              i+=2;
            }
            else
            {
              i++;
            }
            else
              break;
            
        }
        System.out.println(count);
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
