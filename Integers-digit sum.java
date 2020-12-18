/*
Input:
5
53 23 57 123 457
12 16 8 21 17
Output:
53 57 457
Explanation:
The sum of digits in 53, 23, 57, 123 and 457 are 8, 5, 12, 6 and 16 respectively.
The integers 8, 12 and 16 are present in the second line. 
So their corresponding integer values 53, 57 and 457 are printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    b.add(in.nextInt());
		}
		for(int i=0;i<n;i++)
		{
		    int sum=0,num=a[i];
		    while(a[i]>0)
		    {
		        sum+=a[i]%10;
		        a[i]/=10;
		    }
		    if(b.contains(sum))
		    {
		        System.out.print(num+" ");
		        flag=1;
		    }
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}

	}
}
