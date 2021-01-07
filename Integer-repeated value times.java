/*
Input:
10
2 3 4 5 3 3 5 4 2 4
Output:
2 3 4 5 3 3
Explanation:
The 10 integers are 2 3 4 5 3 3 5 4 2 4.
When we traverse till 2 3 4 5 3 3, the value 3 has occurred three times. So the program stops printing further.
Hence the output is 2 3 4 5 3 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int freq[]=new int[101];
		int limit=n-1,flag=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    freq[a[i]]++;
		    for(int j=1;j<=100;j++)
		    {
		        if(freq[j]==j)
		        {
		            limit=i;
		            flag=1;
		            break;
		        }
		    }
		    if(flag==1)
		    {
		        break;
		    }
		}
		for(int i=0;i<=limit;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
