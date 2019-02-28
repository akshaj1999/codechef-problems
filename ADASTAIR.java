
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {


    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
         long num = cin.nextLong();
         long k = cin.nextLong();
         long height = 0;
         long number_of_steps =0;
         for(int i=0;i<num;i++)
         {
            long temp = cin.nextLong();
            if(temp-height>k)
            {
              long diff = temp - height;
              number_of_steps+=(long)diff/k;
              if(diff%k==0)
              {
                number_of_steps--;
              }
            }
            height = temp;
         }
         System.out.println(number_of_steps);
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