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
            int n = cin.nextInt();
            int m = cin.nextInt();
            int k = cin.nextInt();
            HashMap<String,Integer> hash = new HashMap<String,Integer>();
            for(int i=0;i<k;i++)
            {
                hash.put(cin.nextInt()+" "+cin.nextInt(),1);
            }
            long res = 0 ;
            
       Collection<String> keyss = hash.keySet();
    String[] keys = keyss.toArray(new String[keyss.size()]);
   
      for(int i=0;i<k;i++)
      {
        String str = keys[i];
       
        String strs[] = str.trim().split("\\s+");
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);
      
        int temp = 4;
       
        if(hash.get((x-1)+" "+y)!=null)
          temp= temp -1;
     // System.out.println(temp);
        
        if(hash.get((x+1)+" "+y)!=null)
          temp= temp -1;
      // System.out.println(temp);
        
        if(hash.get(x+" "+(y+1))!=null)
          temp= temp -1;
       // System.out.println(temp);
        
        if(hash.get(x+" "+(y-1))!=null)
          temp= temp -1;
      // System.out.println(temp);
        res+=temp;
      }
    System.out.println(res);

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