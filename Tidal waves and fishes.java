/*
Input:
7 4
15 16 13 19
19 13 20 11
12 13 12 13
10 14 13 18
14 18 19 19
13 19 12 17
20 14 19 14
5
1 3 2 1 6
Output:
15 16 13 19
18 12 19 10
11 12 11 12
9 13 12 17
12 16 17 17
10 16 9 14
15 9 14 9
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		int w=in.nextInt();
		for(int p=1;p<=w;p++)
		{
		    int x=in.nextInt();
		    for(int i=r-x;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            if(a[i][j]>=1)
		            {
		                a[i][j]--;
		            }

		        }
		    }
		}
		for(int i=0;i<r;i++,System.out.println())
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		}

	}
}
