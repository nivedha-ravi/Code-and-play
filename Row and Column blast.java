/*
Input:
6 6
77 99 22 92 41 65
96 94 83 46 45 71
86 67 58 20 28 23
34 42 87 47 13 26
52 21 75 90 14 66
37 18 43 11 79 82
3
2 2
4 6
1 3
Output:
73 89 10 87 37 59
91 82 73 42 42 65
86 62 54 20 28 18
33 36 81 43 8 14
52 18 73 90 14 61
37 16 42 11 79 78
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
		int n=in.nextInt();
		for(int j=0;j<n;j++)
		{
		    int x=in.nextInt()-1;
		    int y=in.nextInt()-1;
		    int k=1;
		    for(int i=x+1;i<r;i++)//bottom
		    {
		        a[i][y]=a[i][y]-(r-k);
		        k++;
		    }
		    k=1;
		    for(int i=x-1;i>=0;i--)//top
		    {
		        a[i][y]=a[i][y]-(r-k);
		        k++;
		    }
		    k=1;
		    for(int i=y+1;i<c;i++)//right
		    {
		        a[x][i]=a[x][i]-(c-k);
		        k++;
		    }
		    k=1;
		    for(int i=y-1;i>=0;i--)//left
		    {
		        a[x][i]=a[x][i]-(c-k);
		        k++;
		    }
		    a[x][y]=a[x][y]-(r+c);//current cell
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
