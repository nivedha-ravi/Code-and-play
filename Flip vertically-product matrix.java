/*
Input:
3 3
1 3 5
8 26 7
25 36 2
5 6 31
6 47 40
3 10 7
Output:
3 30 35
48 1222 280
125 216 62
Explanation:
After flipping the matrix M2 vertically, the matrix becomes
3 10 7
6 47 40
5 6 31
The product of the two matrices M1 and M2 is given below.
3 30 35
48 1222 280
125 216 62
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        b[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<r;i++,System.out.println())
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print((a[i][j]*b[r-i-1][j])+" ");
		    }
		}

	}
}
