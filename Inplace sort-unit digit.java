/*
Input:
12
32 78 95 62 42 65 35 95 15 76 46 66
Output:
32 78 15 42 62 35 65 95 95 46 66 76
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
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]%10==a[j]%10)
		        {
		            if(a[j]<a[i])
		            {
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
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
