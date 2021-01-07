/*
Input:
3 6
2 4 6 8 16 14
5 6 8 9 15 16
5 6 7 14 21 30
Output:
-1
5 6 8 9 15 16
5 6 7
Explanation:
In the 1st row, there are no adjacent co-prime integers. So -1 is printed.
In the 2nd row, every two integers are co-prime integers (5, 6), (8, 9) and (15, 16). So the integers 5, 6, 8, 9, 15 and 16 are printed.
In the 3rd row, the integers 5, 6 and 7 are co-prime integers. So the integers 5, 6 and 7 are printed.
*/
import java.util.*;
public class Hello {
    public static int coprime(int a,int b)
    {
        return (b==0)?a:coprime(b,a%b);
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
		for(int i=0;i<r;i++,System.out.println())
		{
            int flag=0;
            int col[]=new int[c];
		    for(int j=0;j<c-1;j++)
		    {
		        if(coprime(a[i][j],a[i][j+1])==1)
		        {
		            flag=1;
		            col[j]=1;
		            col[j+1]=1;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.print("-1");
		    }
		    else
		    {
		        for(int j=0;j<c;j++)
		        {
		            if(col[j]==1)
		            {
		                System.out.print(a[i][j]+" ");
		            }
		        }
		    }

		}
	}
}
