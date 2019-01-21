import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
 
class Demo {

  
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        while(t-->0)
        {
         int R = cin.nextInt();
         int C = cin.nextInt();
         R--;
         C--;
         int K = cin.nextInt();
         int count =0;
         for(int i=0;i<8;i++)
         {
            for(int j=0;j<8;j++)
            {
               int k1 = Math.abs(i-R);
               int k2 = Math.abs(j-C);
               int max = Math.max(k1,k2);
               if(max<=K)
                count++;
            }
         }
         System.out.println(count);
        }
    
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