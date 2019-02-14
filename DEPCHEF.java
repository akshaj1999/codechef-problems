
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
         int n = cin.nextInt();
         int attack[] = new int[n];
         int defense[] = new int[n];
         for(int i=0;i<n;i++)
         {
           attack[i] = cin.nextInt();
         }
         for(int i=0;i<n;i++)
         {
           defense[i] = cin.nextInt();
         }
        
         int defense_of_king = -1;
        for(int i=0;i<n;i++)
        {
          int left,right;
          if(i==0)
          {
            left = n-1;
            right = 1;
          }
          else if(i==n-1)
          {
            left = n-2;
            right = 0;
          }
          else
          {
            left = i-1;
            right = i+1;
          }

          int both = attack[left]+attack[right];
          if(both<defense[i])
          {
            if(defense_of_king<defense[i])
              defense_of_king = defense[i];

          }
        }
  ans.append(defense_of_king+"\n");
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