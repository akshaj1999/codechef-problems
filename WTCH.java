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
          int n = cin.nextInt();
          String str = cin.nextLine();
          char arr[] = str.toCharArray();
          int count =0;
          int length = str.length();
          for(int i=0;i<length;i++)
          {
            if(arr[i]=='0')
            {
            if(i==0)
            {
              if(i+1<length)
             {
              if(arr[i+1]=='0')
                {
                  arr[i]='1';
                  count++;    
                }
              }
                else
                { count++; }
            }
            else if(i==length-1)
            {
              if(arr[i-1]=='0')
                {count++;
                  arr[i]='1';
                }
            }
            else
            {
              if(arr[i-1]=='0'&& arr[i+1]=='0')
                {count++;
                  arr[i] = '1';
                  }
            }
           
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