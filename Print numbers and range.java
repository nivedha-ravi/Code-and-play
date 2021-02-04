/*
Input:
10
1 0 25 24 3 45 2 15 4 6
Output:
0-4,6,15,24-25,45
Explanation: Here N = 10 and the 10 integers are 1 0 25 24 3 45 2 15 4 6. The integers in the range 0-4 are present in the given 10 integers. The integer 6 is present in the given 10 integers. The integer 15 is present in the given 10 integers. The integers in the range 24-25 are present in the given 10 integers. The integer 45 is present in the given 10 integers.
So they are printed in ascending order as the output. 0-4,6,15,24-25,45
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
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]);
		    int flag=0,j=0;
		    for(j=i;j<n-1;j++)
		    {
		        if(a[j]+1==a[j+1])
		        {
		            flag=1;
		        }
		        else
		        {
		            if(flag==1)
		            {
		                System.out.print("-"+a[j]+",");
		            }
		            else
		            {
		                System.out.print(",");
		            }
		            i=j;
		            break;
		        }
		    }
		    if(flag==1 && j==n-1)
		    {
		        System.out.print("-"+a[j]);
		        i=j;
		    }

		}


	}
}
