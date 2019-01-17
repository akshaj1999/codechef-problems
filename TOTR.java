import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        String str = cin.nextLine();
         StringBuffer ans = new StringBuffer();
         String strs[] = str.trim().split("\\s+");
         int t = Integer.parseInt(strs[0]);
         char arr[] = new char[26];
         for(int i=0;i<26;i++)
         {
          arr[i] = strs[1].charAt(i);
         }
         System.out.println();
         while(t-->0)
         {
          str = cin.nextLine();
          StringBuffer q = new StringBuffer();
          int length = str.length();
          for(int i=0;i<length;i++)
          { 
            char c = str.charAt(i);
            char app='0';
    
            if((c>=65 && c<=90))
            {   c = Character.toLowerCase(c);
                app = (char)(arr[c-97]);
                app = Character.toUpperCase(app);
            }

            else if((c>=97 && c<=122))
              app = arr[c-97];
      
            if(c == '_')
            {
              q.append(" ");
              continue;
            }
           else if((c>=97 && c<=122) || (c>=65 && c<=90))
           {
            q.append(app+"");
           }
           else
           {
            q.append(c+"");
           }
          }
          q.append("\n");
           ans.append(q.toString());
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
