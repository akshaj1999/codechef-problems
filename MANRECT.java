
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {

 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
         int t = cin.nextInt();
         StringBuffer ans= new StringBuffer();
         while(t-->0)
         {
             long i=0,j=0;           
            
            System.out.println("Q " +i+" "+j);
            System.out.flush();
            long x1_y1 = cin.nextLong();
            
            i = 1000000000 ; j = 0;
            
             System.out.println("Q " +i+" "+j);
            System.out.flush();
            long x2_y1 = cin.nextLong();
            
            i=0; j=1000000000;
            
            System.out.println("Q " +i+" "+j);
            System.out.flush();
            long x1_y2 = cin.nextLong();
            
            i=1000000000; j=1000000000;
            
            System.out.println("Q " +i+" "+j);
            System.out.flush();
            long x2_y2 = cin.nextLong();
            
            long x1_y1_x2_y1 = 1000000000+(x1_y1 - x2_y1);

            i = (long)x1_y1_x2_y1/2; j=0;
            
            System.out.println("Q " +i+" "+j);
            System.out.flush();
            long y1 = cin.nextLong();
            long x1 = x1_y1 - y1;

            ans.append("A "+x1+" " + y1+ " ");
            i = 1000000000; j=y1;
            
             System.out.println("Q " +i+" "+j);
            System.out.flush();
            i = 1000000000-cin.nextLong();
            ans.append(i+" ");
            j = 1000000000;
            
            System.out.println("Q " +i+" "+j);
            System.out.flush();
            j = 1000000000 - cin.nextLong();
            ans.append(j + "\n");


           System.out.print(ans);
           System.out.flush();
           long check_ans = cin.nextLong();
           if(check_ans == 1)
            {ans.delete(0, ans.length());
            continue;}
        else
            break;
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