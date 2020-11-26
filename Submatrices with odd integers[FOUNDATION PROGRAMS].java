/*
The program must accept an integer matrix of size RxC as the input. The program must print the number of 3x3 submatrices having only odd integers as the output. Note: The values of R and C are always divisible by 3.
Input:
6 9
21 88 72 85 47 21 79 51 13
24 31 70 37 35 41 89 29 51
31 62 36 25 33 87 23 83 59
53 93 49 16 61 41 71 73 15
35 21 83 84 71 13 23 67 79
77 43 75 81 60 79 39 69 57
Output:
4
*/
import java.util.*;
public class Hello {
    public static boolean onlyoddvalues(int a[][],int startrow,int startcol)
    {
        for(int i=startrow;i<startrow+3;i++)
        {
            for(int j=startcol;j<startcol+3;j++)
            {
                if(a[i][j]%2==0)
                {
                    return false;
                }
            }
        }
        return true;
    }

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
		int count=0;
		for(int i=0;i<=r-3;i+=3)
		{
		    for(int j=0;j<=c-3;j+=3)
		    {
		        if(onlyoddvalues(a,i,j))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);

	}
}
