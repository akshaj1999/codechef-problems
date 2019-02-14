
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
         
           int count =0;
           int n = cin.nextInt();
           String arr[] = new String[n];
           for(int i=0;i<n;i++)
           {
             arr[i] = cin.nextLine();
           }
           int length_of_first = arr[0].length();
           String temp ="";
           for(int i=0;i<length_of_first;i++)
           {
             char c = arr[0].charAt(i);
             if(temp.indexOf(c)<0)
              temp+=c;
           }
           arr[0] = temp;
           length_of_first = arr[0].length();
           for(int i=0;i<length_of_first;i++)
           {
               char c = arr[0].charAt(i);
               boolean check = true;
               for(int j=1;j<n;j++)
               {
                  if(arr[j].indexOf(c)<0)
                  {
                    check = false;
                    break;
                  }
               }
              if(check)
                count++;
           }
       ans.append(count+"\n");
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