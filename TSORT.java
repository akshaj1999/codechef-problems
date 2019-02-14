
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {

 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
         int t = cin.nextInt();
         int arr[] = new int[t];
         for(int i=0;i<t;i++)
         {
            arr[i] = cin.nextInt();
         }
         Arrays.sort(arr);
         for(int i=0;i<t;i++)
         {
            System.out.println(arr[i]);
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