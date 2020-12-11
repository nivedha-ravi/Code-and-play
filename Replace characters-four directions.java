/*
Input:
6 8
U X C S R N Z L
D U O T V G C N
J Q X Z S W B L
I R R P H X U U
L Q L J T G A A
V C D L X Z C E
Output:
* * * * R * * L
D U O T * G C N
* * * * * * B L
I R R * * * * *
L * L J T G * A
* * * L X Z * E
*/
import java.util.*;
public class Hello {
    public static boolean isfourdirections(char ch)
    {
        return (ch=='L'||ch=='R'||ch=='B'||ch=='T')?true:false;

    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char[][] a=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		    }
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(a[i][j]=='L')//left
		        {
		            for(int k=j-1;k>=0;k--)
		            {
		                if(isfourdirections(a[i][k]))
		                {
		                    continue;
		                }
		                else
		                {
		                    a[i][k]='*';
		                }
		            }
		        }
		        else if(a[i][j]=='R')//right
		        {
		            for(int k=j+1;k<c;k++)
		            {
		                if(isfourdirections(a[i][k]))
		                {
		                    continue;
		                }
		                else
		                {
		                    a[i][k]='*';
		                }
		            }
		        }
		        else if(a[i][j]=='T')//top
		        {
		            for(int k=i-1;k>=0;k--)
		            {
		                if(isfourdirections(a[k][j]))
		                {
		                    continue;
		                }
		                else
		                {
		                    a[k][j]='*';
		                }
		            }
		        }
		        else if(a[i][j]=='B')//bottom
		        {
		            for(int k=i+1;k<r;k++)
		            {
		                if(isfourdirections(a[k][j]))
		                {
		                    continue;
		                }
		                else
		                {
		                    a[k][j]='*';
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
