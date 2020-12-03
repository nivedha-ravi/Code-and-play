/*
Example Input/Output 1:
Input:
5 8
71 22 16 30 28 31 40 51
32 88 78 58 33 10 90 89
34 38 41 62 12 49 72 18
45 63 91 54 76 21 56 28
16 25 67 69 31 83 73 13
2 7
Output:
1606 616 1368 630 200
Explanation:
The integers in the 2nd column (from 1st row to 5th row) are 22, 88, 38, 63 and 25.
The integers in the 7th column (from 5th row to 1st row) are 73, 56, 72, 90 and 40.
The LCM of 22 and 73 is 1606.
The LCM of 88 and 56 is 616.
The LCM of 38 and 72 is 1368.
The LCM of 63 and 90 is 630.
The LCM of 25 and 40 is 200.
Hence the output is 1606 616 1368 630 200.
Example Input/Output 2:
Input:
4 4
58 82 52 52
25 44 36 89
13 62 88 37
90 65 13 30
3 2
Output:
260 1116 88 1066
*/

import java.util.*;
public class Hello {
    public static int HCF(int a,int b)
    {
        return (b==0)?a:HCF(b,a%b);
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
		int x=in.nextInt();
		int y=in.nextInt();
		for(int i=0;i<r;i++)
		{
		    int lcm=(a[i][x-1]*a[r-i-1][y-1])/HCF(a[i][x-1],a[r-i-1][y-1]);
		    System.out.print(lcm+" ");
		}

	}
}
