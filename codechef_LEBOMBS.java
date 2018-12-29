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