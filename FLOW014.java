
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {

 static long gcd(long a, long b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 
static long lcm(long a, long b,long gcd)  
 {  
    return (a*b)/gcd;  
 }  
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
          String str = cin.nextLine();
          String strs[] = str.trim().split("\\s+");
          int hardness = Integer.parseInt(strs[0]);
          double carbon = Double.parseDouble(strs[1]);
          int strength = Integer.parseInt(strs[2]);
          if(hardness>50 && carbon<0.7 && strength>5600)
          {
            ans.append("10"+"\n");
          }
          else if(hardness>50 && carbon<0.7)
          {
            ans.append("9"+"\n");
          }
          else if(carbon<0.7 && strength>5600)
          {
            ans.append("8"+"\n");
          }
          else if(hardness>50 && strength>5600)
          {
            ans.append("7"+"\n");
          }
          else if(hardness>50 || carbon<0.7 || strength>5600)
          {
            ans.append("6"+"\n");
          }
          else
          {
            ans.append("5"+"\n");
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