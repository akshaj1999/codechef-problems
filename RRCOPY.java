
  import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
         int t = cin.nextInt();
         StringBuffer str = new StringBuffer();
         while(t-->0)
          {
            int N = cin.nextInt();
            HashSet<Integer> h1 = new HashSet<Integer>();
            for(int i=0;i<N;i++)
            {
              int temp = cin.nextInt();
              h1.add(temp);
            }
            str.append(h1.size()+"\n");
          }
          System.out.print(str);
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
