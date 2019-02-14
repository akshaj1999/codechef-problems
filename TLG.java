
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {

 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
         int t = cin.nextInt();
         int winner = 0;
         int lead = -1;
         int sum_player1 =0;
         int sum_player2 =0;
         for(int i=0;i<t;i++)
         {
            int player1 = cin.nextInt();
            int player2 = cin.nextInt();
            sum_player1+=player1;
            sum_player2+=player2;
            if(sum_player1 > sum_player2)
            {
                if((sum_player1-sum_player2)>lead)
                {
                    lead = sum_player1-sum_player2;
                    winner = 1;
                }

            }
            else
            {
                if((sum_player2 - sum_player1) > lead)
                {
                    lead = sum_player2 - sum_player1;
                    winner =2;
                }
            }

         }
         System.out.println(winner +" "+lead);
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