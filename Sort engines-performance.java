/*
Input:
5
1 7 2 9 3
7 5 5 8 1
Output:
9 7 2 1 3
8 5 5 7 1
Explanation:
The performance of the 1st engine is 7 (1 * 7).
The performance of the 2nd engine is 35 (7 * 5).
The performance of the 3rd engine is 10 (2 * 5).
The performance of the 4th engine is 72 (9 * 8).
The performance of the 5th engine is 3 (3 * 1).
So the engines are sorted in descending order based on the performance.
Hence the output is
9 7 2 1 3
8 5 5 7 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int speed[]=new int[n];
		int efficiency[]=new int[n];
		int performance[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    speed[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    efficiency[i]=in.nextInt();
		    performance[i]=speed[i]*efficiency[i];
		}
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n-1;j++)
	        {
	            if(performance[j]<performance[j+1])
	            {
	                int temp=performance[j];
	                performance[j]=performance[j+1];
	                performance[j+1]=temp;
	                int temp1=efficiency[j];
	                efficiency[j]=efficiency[j+1];
	                efficiency[j+1]=temp1;
	                int temp3=speed[j];
	                speed[j]=speed[j+1];
	                speed[j+1]=temp3;
	            }
	            else if(performance[j]==performance[j+1])
	            {
	                if(speed[j]<speed[j+1])
	                {
	                    int temp=speed[j];
	                    speed[j]=speed[j+1];
	                    speed[j+1]=temp;
	                    int effi=efficiency[j];
	                    efficiency[j]=efficiency[j+1];
	                    efficiency[j+1]=effi;
	                }

	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(speed[i]+" ");
	    }
	    System.out.println();
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(efficiency[i]+" ");
	    }
	}
}
