/*
Input:
9 2
0 1 0 0 1 0 0 0 0
Output:
6
Explanation:
Here N = 9 and X = 2.
For every 2 seconds, the glowing candles illuminates the candles near them (i.e., the left and right adjacent candles of each glowing candle).
It takes 6 seconds to light all 9 candles.
At t = 1, 0 1 0 0 1 0 0 0 0
At t = 2, 1 1 1 1 1 1 0 0 0
At t = 3, 1 1 1 1 1 1 0 0 0
At t = 4, 1 1 1 1 1 1 1 0 1
At t = 5, 1 1 1 1 1 1 1 0 1
At t = 6, 1 1 1 1 1 1 1 1 1 So 6 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		int a[]=new int[n];
		int t[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    t[i]=a[i];
		}
		int count=0;
		while(true)
		{
		    for(int i=0;i<n;i++)
		    {
		        int prev=(i==0)?n-1:i-1;
		        int next=(i==n-1)?0:i+1;
		        if(a[i]==1)
		        {
		            t[prev]=1;
		            t[next]=1;
		        }
		    }

		    int flag=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=t[i];
		        if(a[i]==0)
		        {
		            flag=1;
		        }
		    }
		    count+=x;
		    if(flag==0)
		    {
		        break;
		    }

		}
		System.out.print(count);

	}
}
