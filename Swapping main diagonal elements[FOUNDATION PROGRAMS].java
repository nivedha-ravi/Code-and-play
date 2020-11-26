/*
Input:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
Output:
5 2 3 4 1
6 9 8 7 10
11 12 13 14 15
16 19 18 17 20
25 22 23 24 21
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<n;i++)
		{
		    int temp=a[i][i];
		    a[i][i]=a[i][n-i-1];
		    a[i][n-i-1]=temp;
		}
		for(int i=0;i<n;i++,System.out.println())
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		}

	}
}
