/*
Input:
6 6
8 8 4 1 8 5
4 9 7 9 7 2
5 3 3 6 3 4
1 7 2 6 2 3
8 6 3 7 6 4
5 9 4 3 5 1
Output:
8 8 4 1 2 3
4 9 7 4 5 6
5 3 3 7 8 9
1 2 3 6 2 3
4 5 6 7 6 4
7 8 9 3 5 1
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
		for(int i=0;i<=r-3;i+=3)
		{
		    for(int j=0;j<=c-3;j+=3)
		    {
		        int d[]=new int[9];
		        int flag=0,count=0;
		        for(int k=i;k<i+3;k++)
		        {
		            for(int l=j;l<j+3;l++)
		            {
		                d[count++]=a[k][l];
		            }
		        }
		        Arrays.sort(d);
		        for(int k=1;k<=9;k++)
		        {
		            if(k!=d[k-1])
		            {
		                flag=1;
		                break;
		            }
		        }
		        count=0;
		        if(flag==0)
		        {
		            for(int k=i;k<i+3;k++)
		            {
		                for(int l=j;l<j+3;l++)
		                {
		                    a[k][l]=d[count++];
		                }
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
