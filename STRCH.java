import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo{
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
            int length = cin.nextInt();
            String str = cin.nextLine();
            String strs[] = str.trim().split("\\s+");
            char ch = strs[1].charAt(0);
            char char_array[] = strs[0].toCharArray();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<char_array.length;i++)
            {
                if(char_array[i]==ch)
                    arr.add(i);
            }
            long count = 0;
            boolean check = true;
            int size = arr.size();
            for(int i =0;i<size;i++)
            {
                if(check)
                {
                    int temp = arr.get(i) + 1 ;
                     // System.out.println(temp);
                    count+= (temp*(char_array.length-arr.get(i)));
                    check=false;
                }
                else
                {
                   int temp = arr.get(i) - arr.get(i-1);
                   //  System.out.println(temp);

                   count+=(temp*(char_array.length-arr.get(i)));
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