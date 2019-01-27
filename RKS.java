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
         StringBuffer str = new StringBuffer();
          int n =  cin.nextInt();
          int k = cin.nextInt();
          int row[] = new int[n];
          int col[] = new int[n];
          str.append(n-k+" ");
          for(int i=0;i<k;i++)
          {
            int ro = cin.nextInt();
            int co = cin.nextInt();
            row[ro-1] = 1;
            col[co-1] = 1;
          }
          int start = 0;
          for(int i=0;i<n;i++)
          {
            if(col[i]==0)
            {
              start = i;
              break;
            }
          }
          for(int i=0;i<n;i++)
          {
            if(row[i]==0)
            {
              row[i]=1;
              do
              {
                if(col[start]==0)
                  {
                    str.append((i+1)+" ");
                    str.append((start+1)+" ");
                    start++;
                    break;
                  }
                    
                    else
                      start++;
              }while(start<n);
            }
          }
          str.append("\n"); 
          System.out.print(str);
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