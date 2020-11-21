/*
Input:
4 5
3
1 2
4 3
1 5
Output:
0 0 1 0 1
0 1 1 0 1
0 1 1 0 1
1 0 1 1 0
Explanation:
Initially, the status of 4x5 grid of lamps is given below.
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
In the first query, (1, 2) represents the position of the lamp to be turned ON.
After processing the first query, the grid becomes
1 1 1 1 1
0 1 0 0 0
0 1 0 0 0
0 1 0 0 0
In the second query, (4, 3) represents the position of the lamp to be turned ON.
After processing the second query, the grid becomes
1 1 0 1 1
0 1 1 0 0
0 1 1 0 0
1 0 1 1 1
In the third query, (1, 5) represents the position of the lamp to be turned ON.
After processing the third query, the grid becomes
0 0 1 0 1
0 1 1 0 1
0 1 1 0 1
1 0 1 1 0
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int q=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=0;
		    }
		}
		for(int i=0;i<q;i++)
		{
		    int row=in.nextInt();
		    int col=in.nextInt();
		    a[row-1][col-1]=1;
		    for(int cl=0;cl<c;cl++)
		    {
		        if(cl!=col-1)
		        {
		            a[row-1][cl]=(a[row-1][cl]==1)?0:1;
		        }
		    }
		    for(int rw=0;rw<r;rw++)
		    {
		        if(rw!=row-1)
		        {
		            a[rw][col-1]=(a[rw][col-1]==1)?0:1;
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


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R=scanner.nextInt();
		int C=scanner.nextInt();
		int Q=scanner.nextInt();
		int[][] arr=new int[R][C];
		int currRow=0,currCol=0;
		for(int query=0;query<Q;query++)
		{
		    currRow=scanner.nextInt();
		    currCol=scanner.nextInt();
		    for(int row=0;row<R;row++)
		    {
		        arr[row][currCol-1]^=1;
		    }
		    for(int col=0;col<C;col++)
		    {
		        arr[currRow-1][col]^=1;
		    }
		    arr[currRow-1][currCol-1]=1;
		}
		for(int row=0;row<R;row++)
		{
		for(int col=0;col<C;col++)
		{
		System.out.print(arr[row][col]+" ");
		}
		System.out.println();
    }
	}
}
