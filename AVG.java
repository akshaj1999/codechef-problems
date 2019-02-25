import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        StringBuffer ans = new StringBuffer();
        int t = cin.nextInt();
        while(t-->0)
        {
          int n = cin.nextInt();
          int k = cin.nextInt();
          int v = cin.nextInt();
          long sum = 0;
          for(int i=0;i<n;i++)
            sum+=cin.nextInt();
          long avg = (n+k)*v;
          avg = avg - sum;
          if(avg<=0)
            ans.append("-1 \n");
          else if(avg%k !=0)
            ans.append("-1 \n");
          else
            ans.append((avg/k)+"\n");
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
