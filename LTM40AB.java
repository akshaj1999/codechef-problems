
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
          int a = cin.nextInt();
          int b = cin.nextInt();
          int c = cin.nextInt();
          int d = cin.nextInt();
          
          int arr_a_b[] = new int[b-a+1];
          int arr_c_d[] = new int[d-c+1];

          long total =0;
          for(int i=0;i<arr_a_b.length;i++,a++)
          {
            arr_a_b[i] = a;
          }
         for(int i=0;i<arr_a_b.length;i++)
         {
             if(arr_a_b[i]>=c && arr_a_b[i]<d)
              total+=d-arr_a_b[i];
            else if(arr_a_b[i]<c && arr_a_b[i]<d)
              total+=d-c+1;

          }
           System.out.println(total);
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