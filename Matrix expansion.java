/*
Input:
3 3
6 3 1
3 4 7
3 6 8
2 2
Output:
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8
Explanation:
Here R = 3, C = 3, M = 2 and N = 2. So the size of the big matrix is 6x6 (3*2 x 3*2) and it is given below.
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int R=scanner.nextInt(),C=scanner.nextInt();
	int[][] arr=new int[R][C];
	for(int row=0;row<R;row++)
	{
	    for(int col=0;col<C;col++)
	    {
	        arr[row][col]=scanner.nextInt();
	    }
	}
	int M=scanner.nextInt(),N=scanner.nextInt();
	for(int row=0;row<R*M;row++)
	{
	    for(int col=0;col<C*N;col++)
	    {
	        System.out.print(arr[row%R][col%C]+" ");
	    }
	    System.out.println();
	}
	}
}

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
        int m=in.nextInt();
        int n=in.nextInt();
        int k=0;
        for(int i=0;i<r*m;i++,System.out.println())
        {
            for(int j=0;j<n;j++)
            {
                for(int l=0;l<c;l++)
                {
                    System.out.print(a[k][l]+" ");
                }
            }
            k++;
            if(k==r)
            {
                k=0;
            }
        }
	}
}
