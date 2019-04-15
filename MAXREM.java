import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo{
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int n = cin.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i = n-1;i>0;i--)
        {
           int temp = arr[i-1]%arr[i];
           if(max<temp)
            max = temp;
        }
        System.out.println(max);
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