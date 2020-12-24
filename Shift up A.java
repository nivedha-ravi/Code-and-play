/*
Input:
3 4
A A B A
B B A A
A B A A
Output:
A A A A
A - A A
- - - A
Explanation:
After removing all the occurrences of B, the empty cells are replaced with the hyphens.
A A - A
- - A A
A - A A
After shifting the occurrences of A to the top, the matrix becomes
A A A A
A - A A
- - - A
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char a[][]=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		        if(a[i][j]=='B')
		        {
		            a[i][j]='-';
		        }
		    }
		}
		for(int i=0;i<c;i++)
		{
		    int count=0;
		    for(int j=0;j<r;j++)
		    {
		        if(a[j][i]=='A')
		        {
		            count++;
		        }
		    }
		    for(int k=0;k<count;k++)
		    {
		        a[k][i]='A';
		    }
		    for(int k=count;k<r;k++)
		    {
		        a[k][i]='-';
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
