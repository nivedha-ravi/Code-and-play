/*
Input:
4 6
7 2 1 7 3 0
8 9 6 4 0 3
2 0 0 8 2 8
8 6 9 5 9 9 4
Output:
2 8
9 9
Explanation:
Here K = 4. The last 4 2x2 non-overlapping submatrices in the given 4x6 matrix are given below.
3 0
0 3

2 0
8 6

0 8
9 5

2 8
9 9
The last 2x2 submatrix has the maximum sum 28 (2+8+9+9). Hence the output is
2 8
9 9
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		int k=in.nextInt();
		int rowstart=r-2,colstart=c;
		while(k>=1)
		{
		    if(colstart==0)
		    {
		        rowstart-=2;
		        colstart=c;
		    }
		    colstart-=2;
		    k--;
		}
		int maxrow=0,maxcol=0,maximum=0;
		for(int i=rowstart;i<r;i+=2)
		{
		    for(int j=colstart;j<c;j+=2)
		    {
		        int sum=0;
		        for(int l=i;l<i+2;l++)
		        {
		            for(int m=j;m<j+2;m++)
		            {
		                sum+=a[l][m];
		            }
		        }
		        colstart=0;
		        if(sum>maximum)
		        {
		            maximum=sum;
		            maxrow=i;
		            maxcol=j;
		        }
		    }
		}
		for(int i=maxrow;i<maxrow+2;i++,System.out.println())
		{
		    for(int j=maxcol;j<maxcol+2;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		}

	}
}
