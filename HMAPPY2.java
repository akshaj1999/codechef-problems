
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {
    
    static long countDivisibles(long A, long B, long M) 
    { 
        if (A % M == 0) 
            return (B / M) - (A / M) + 1; 
  
        return (B / M) - (A / M); 
    } 
  
 static  long gcd(long a, long b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
           long n = cin.nextLong();
           long a =cin.nextLong();
           long b = cin.nextLong();
           long k = cin.nextLong();
           long lcm  = (a*b)/Demo.gcd(a,b);
           
           
           long div_a = Demo.countDivisibles(1,n,a);
           
           
           long div_b = Demo.countDivisibles(1,n,b);
           
           
           long div_lcm = Demo.countDivisibles(1,n,lcm);
           
           
           long sum = div_a +div_b - (2*div_lcm);
           if(sum>=k)
           {
               ans.append("Win"+"\n");
           }
           else
           {
               ans.append("Lose"+"\n");
           }
                
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