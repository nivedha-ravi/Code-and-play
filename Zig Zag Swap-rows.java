/*
Input:
6 8
83 27 59 55 25 13 38 80
40 33 13 69 72 31 39 13
11 13 40 51 14 27 33 50
54 49 31 45 10 22 75 59
75 47 18 60 33 20 61 68
73 38 14 19 28 70 76 55
Output:
28 70 76 55 25 13 38 80
40 33 13 69 75 47 18 60
10 22 75 59 14 27 33 50
54 49 31 45 11 13 40 51
72 31 39 13 33 20 61 68
73 38 14 19 83 27 59 55
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
        for(int i=0;i<r/2;i++)
        {
                for(int k=c/2,j=0;k<c;k++,j++)
                {
                    if(i%2==0)//first and second half
                    {
                    int num=a[i][j];
                    a[i][j]=a[r-i-1][k];
                    a[r-i-1][k]=num;
                    }
                    else//second and first half
                    {
                        int num=a[i][k];
                        a[i][k]=a[r-i-1][j];
                        a[r-i-1][j]=num;
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
