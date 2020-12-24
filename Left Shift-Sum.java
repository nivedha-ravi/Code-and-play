/*
The program must accept N integers and an integer K as the input. The program must shift the N integers to the left by K positions. Then the program must print the sum of every three integers among the N modified integers. If there are no three integers to find the sum, then print the sum of the existing integers.
Input:
5
2 3 4 7 1
2
Output:
12 5
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
		int k=in.nextInt();
		k=k%n;
		int index=k,sum=0;
		for(int i=1;i<=n;i++)
		{
		    sum+=a[index];
		    index++;
		    if(index==n)
		    {
		        index=0;
		    }
		    if(i%3==0)
		    {
		        System.out.print(sum+" ");
		        sum=0;
		    }
		}
		if(n%3!=0)
		{
		    System.out.print(sum);
		}

	}
}
