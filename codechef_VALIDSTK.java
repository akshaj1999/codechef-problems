

// Working program using Reader Class 
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

class Demo 
{ 
	static class Reader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 

		public Reader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public Reader(String file_name) throws IOException 
		{ 
			din = new DataInputStream(new FileInputStream(file_name)); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public String readLine() throws IOException 
		{ 
			byte[] buf = new byte[64]; // line length 
			int cnt = 0, c; 
			while ((c = read()) != -1) 
			{ 
				if (c == '\n') 
					break; 
				buf[cnt++] = (byte) c; 
			} 
			return new String(buf, 0, cnt); 
		} 

		public int nextInt() throws IOException 
		{ 
			int ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do
			{ 
				ret = ret * 10 + c - '0'; 
			} while ((c = read()) >= '0' && c <= '9'); 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		public long nextLong() throws IOException 
		{ 
			long ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 
			if (neg) 
				return -ret; 
			return ret; 
		} 

		public double nextDouble() throws IOException 
		{ 
			double ret = 0, div = 1; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 

			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 

			if (c == '.') 
			{ 
				while ((c = read()) >= '0' && c <= '9') 
				{ 
					ret += (c - '0') / (div *= 10); 
				} 
			} 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		private void fillBuffer() throws IOException 
		{ 
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
			if (bytesRead == -1) 
				buffer[0] = -1; 
		} 

		private byte read() throws IOException 
		{ 
			if (bufferPointer == bytesRead) 
				fillBuffer(); 
			return buffer[bufferPointer++]; 
		} 

		public void close() throws IOException 
		{ 
			if (din == null) 
				return; 
			din.close(); 
		} 
	} 

	public static void main(String[] args) throws IOException 
	{ 
		Reader cin =new Reader();
		int t = cin.nextInt();
		while(t-->0)
		{
          int  n = cin.nextInt();
          int arr[] = new int[n];
          stack st = new stack(n);
          for(int i=0;i<n;i++)
          {
          	arr[i] = cin.nextInt();
          }
          boolean check = true;
         for(int i=0;i<n;i++)
         {
            if(arr[i]==1)
            {

            	if(st.push(arr[i]))
            		check = true;
            	else
            		{check = false;
            			break;}
            }  
            else
            {
               	 if(st.pop())
               	 	check = true;
               	 else
               	 	{check = false;
               	 		break;}

            }
         }
         if(check)
         {
         	System.out.println("Valid");
         }	
         else
         {
         	System.out.println("Invalid");
         }
		
	    } 
		
	}
} 

class stack
{
	int top;
	int array[];
	public stack(int x)
	{
      top = -1;
      array = new int[x];
	}

	public boolean isFull()
	{
		if(top==array.length-1)
			return true;
		else
			return false;
	}

    public boolean push(int x)
    {
        if(!isFull())
    	{
    	   this.array[++top] = x;
           return true;
       }
        else
        	return false;
    }

    public boolean pop()
    {
    	if(!isEmpty())
    	 {  int temp= this.array[top--];
    	 	return true;}
        
        else
        {
        	return false;
        }
    }

    public boolean isEmpty()
    {
    	if(top == -1)
    		return true;
    	else
    		return false;
    }

}
