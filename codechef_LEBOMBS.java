import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
			while(t-->0)
		{
			int count = 0;
		    int temp = cin.nextInt();
		    //System.out.println(temp);
		    int arr[] = new int[temp];
            cin.nextLine();
		    String str = cin.nextLine();
		    //System.out.println(str);
		    for(int i=0;i<temp;i++)
		    {
		    	if(str.charAt(i)=='1')
		    	{
                    	arr[i]=1;

                        if((i-1)<temp && (i-1)>=0)
                    	arr[i-1]=1;

                        if((i+1)<temp && (i+1)>=0)
                    	arr[i+1]=1;
                   
		    	}
		    }


		     for(int i=0;i<arr.length;i++)
		    {
		    	if(arr[i]==0)
		    		count++;
		    }

		    System.out.println(count);
           
		}
	}
}

// or
/*
import java.io.*;
import java.util.StringTokenizer;
 

class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
            while(t-->0)
        {
            int count = 0;
            int temp = cin.nextInt();
            //System.out.println(temp);
            int arr[] = new int[temp];
            String str = cin.nextLine();
            //System.out.println(str);
            for(int i=0;i<temp;i++)
            {
                if(str.charAt(i)=='1')
                {
                        arr[i]=1;

                        if((i-1)<temp && (i-1)>=0)
                        arr[i-1]=1;

                        if((i+1)<temp && (i+1)>=0)
                        arr[i+1]=1;
                   
                }
            }


             for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0)
                    count++;
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
*/
