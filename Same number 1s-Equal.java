/*
Input:
5
1 2 3 4 5
Output
4
Explanation:
All pairs formed using the 5 integers are given below. (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5) and (4, 5). The pairs which are having an equal number of 1s in their binary representations are given below. (1, 2), (1, 4), (2, 4) and (3, 5). So the count 4 is printed as the output.
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
		int count=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(Integer.bitCount(a[i])==Integer.bitCount(a[j]))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);

	}
}
