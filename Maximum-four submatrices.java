/*
Input:
5 6
27 39 26 36 12 30
25 84 77 52 97 34
99 87 62 28 19 21
22 72 70 47 90 73
82 68 59 33 38 96
3 4
Output:
84 97 82 96
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
		int x=in.nextInt()-1;
		int y=in.nextInt()-1;
		int max=0;
		for(int i=0;i<x;i++)//top-left
		{
		    for(int j=0;j<y;j++)
		    {
		        if(a[i][j]>max)
		        {
		            max=a[i][j];
		        }
		    }
		}
		System.out.print(max+" ");
		max=0;
		for(int i=0;i<x;i++)//top-right
		{
		    for(int j=y+1;j<c;j++)
		    {
		        if(a[i][j]>max)
		        {
		            max=a[i][j];
		        }
		    }
		}
		System.out.print(max+" ");
		max=0;
		for(int i=x+1;i<r;i++)//bottom left
		{
		    for(int j=0;j<y;j++)
		    {
		        if(a[i][j]>max)
		        {
		            max=a[i][j];
		        }
		    }
		}
		System.out.print(max+" ");
		max=0;
		for(int i=x+1;i<r;i++)//bottom right
		{
		    for(int j=y+1;j<c;j++)
		    {
		        if(a[i][j]>max)
		        {
		            max=a[i][j];
		        }
		    }
		}
		System.out.print(max);


	}
}
