/*
A shop has M sales each day for N days. Each day different types of items were sold and had different profits associated with them, but the number of items sold on each day was the same. The program must accept the values of M, N and the profits earned from the M sales for N days as the input. The program must print the minimum profit earned on each day as the output.
Input:
5 3
5 7 10
2 14 6
1 8 11
3 9 15
12 4 7
Output:
1 4 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<n;i++)
		{
		    int min=Integer.MAX_VALUE;
		    for(int j=0;j<m;j++)
		    {
		        min=Math.min(min,a[j][i]);
		    }
		    System.out.print(min+" ");
		}

	}
}
