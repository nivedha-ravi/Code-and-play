/*
Input:
6
5 9 3 6 4 8
Output:
2
Explanation: The 6 integers are 5 9 3 6 4 8. After sorting the integers, the integers become 3, 4, 5, 6 and 8. The difference between 3 and 4 is 1. The difference between 4 and 5 is 1. The difference between 5 and 6 is 1. The difference between 6 and 8 is 2.
The difference between 8 and 9 is 1. So the maximum difference between the subsequent integers is 2, which is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
		    max=Math.max(a[i+1]-a[i],max);
		}
		System.out.print(max);

	}
}
