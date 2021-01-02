/*
Input:
4 3
1 0 0
0 1 0
0 0 1
0 1 0
Output: only 1 in row and column
2
Explanation:
The lonely 1s in the given matrix are highlighted below.
1 0 0
0 1 0
0 0 1
0 1 0
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
	    int count=0;
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            if(a[i][j]==1)
	            {
	                int flag=0;
	                for(int l=0;l<r;l++)
	                {
	                    if(l==i)
	                    {
	                        continue;
	                    }
	                    else if(a[l][j]==1)
	                    {
	                        flag=1;
	                        break;
	                    }
	                }
	                for(int l=0;l<c;l++)
	                {
	                    if(l==j)
	                    {
	                        continue;
	                    }
	                    else if(a[i][l]==1)
	                    {
	                        flag=1;
	                        break;
	                    }
	                }
	                if(flag==0)
	                {
	                    count++;
	                }
	            }
	        }
	    }
	    System.out.print(count);

	}
}
