/*
Input:
6
93 91 -80 68 -39 24
Output:
91 93 -39 24 -80 68
Explanation:
Here N = 6 and the given 6 integers are 93 91 -80 68 -39 24. The 1st positive integer 93 and the 2nd positive integer 91 are swapped. The 1st negative integer -80 and the 2nd negative integer -39 are swapped.
The 3rd positive integer 68 and the 4th positive integer 24 are swapped. Hence the output is 91 93 -39 24 -80 68
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int lastpos=-1,lastneg=-1;
		for(int i=0;i<n;i++)
		{
		    if(i!=lastpos && a[i]>0)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(a[i]>0 && a[j]>0)
		            {
		                lastpos=j;
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		                break;
		            }
		        }
		    }
		    else if(i!=lastneg && a[i]<0)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(a[i]<0 && a[j]<0)
		            {
		                lastneg=j;
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		                break;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
