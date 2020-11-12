/*
Example Input/Output 1:
Input:
2 2
3 2
3 4
1 4
1 2
Output:
1 3
Explanation : The sum of integers in the first 2x2 matrix is 12.
The sum of integers in the second 2x2 matrix is 8.
There are 3 possible ways to equalize the sum of the integers in M1 and M2.
Swapping integers at (0, 0).
Swapping integers at (1, 0).
Swapping integers at (1, 1).
The integers swapped in the first occurring swap are 3 and 1. After swapping the integers in M1 and M2, the integers 1 and 3 are printed as the output.
Example Input/Output 2:
Input:
3 4
18 45 49 11
48 56 31 12
63 21 18 36
35 14 95 10
70 16 36 11
73 30 70 12
Output:
-1
*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum1=0,sum2=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
                sum1+=a[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=in.nextInt();
                sum2+=b[i][j];
            }
        }
        if(sum1==sum2)
        {
            System.out.print("-1");
        }
        else
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if((sum1-a[i][j]+b[i][j])==(sum2-b[i][j]+a[i][j]))
                    {
                        System.out.printf("%d %d",b[i][j],a[i][j]);
                        System.exit(1);
                    }
                }
            }
            System.out.print("-1");

        }

	}
}
