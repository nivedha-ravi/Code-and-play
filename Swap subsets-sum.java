/*
Input:
12
2 7 4 15 5 9 11 10 6 12 14 1
Output:
20 11 11 26 12 16
Explanation:
The given 12 integers are 2 7 4 15 5 9 11 10 6 12 14 1. After swapping every two subsets of size 3, the integers become 15 5 9 2 7 4 12 14 1 11 10 6. The sum of 15 and 5 is 20. The sum of 9 and 2 is 11. The sum of 7 and 4 is 11.
The sum of 12 and 14 is 26. The sum of 1 and 11 is 12. The sum of 10 and 6 is 16. Hence the output is 20 11 11 26 12 16
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
		for(int i=0;i<n;i+=6)
		{
		    for(int j=i;j<i+3;j++)
		    {
		        int temp=a[j];
		        a[j]=a[j+3];
		        a[j+3]=temp;
		    }
		}
		for(int i=0;i<=n-2;i+=2)
		{
		    System.out.print(a[i]+a[i+1]+" ");
		}

	}
}
