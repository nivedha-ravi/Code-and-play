/*
Input:
7 8
C M S u P g V C
t f F S z X R w
H M s Q y K w v
I P W G o F m e
d g a k H I U d
e K J a o p N I
H I d e F V a H
HIde
Output:
Right
*/
import java.util.*;
public class Hello {
    public static boolean topOrBottom(char a[][],char s[],int c,int start)
    {
        for(int i=0;i<c;i++)
        {
            if(s[0]==a[start][i])
            {
                String t="";
                for(int j=0;j<s.length && i<c;j++,i++)
                {
                    if(s[j]!=a[start][i])
                    {
                        break;
                    }
                    else
                    {
                        t+=s[j];
                    }
                }
                if(t.equals(new String(s)))
                {
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean topOrBottomRev(char a[][],char s[],int c,int start)
    {
        for(int i=c-1;i>=0;i--)
        {
            if(s[0]==a[start][i])
            {
                String t="";
                for(int j=0;j<s.length && i>=0;j++,i--)
                {
                    if(s[j]!=a[start][i])
                    {
                        break;
                    }
                    else
                    {
                        t+=s[j];
                    }
                }
                if(t.equals(new String(s)))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean rightOrLeft(char[][] a,char[] s,int r,int start)
    {
        for(int i=0;i<r;i++)
        {
            if(s[0]==a[i][start])
            {
                String t="";
                for(int j=0;j<s.length && i<r;j++,i++)
                {
                    if(s[j]!=a[i][start])
                    {
                        break;
                    }
                    else
                    {
                        t+=s[j];
                    }
                }
                if(t.equals(new String(s)))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean rightOrLeftRev(char[][] a,char[] s,int r,int start)
    {
        for(int i=r-1;i>=0;i--)
        {
            if(s[0]==a[i][start])
            {
                String t="";
                for(int j=0;j<s.length && i>=0;j++,i--)
                {
                    if(s[j]!=a[i][start])
                    {
                        break;
                    }
                    else
                    {
                        t+=s[j];
                    }
                }
                if(t.equals(new String(s)))
                {
                    return true;
                }
            }
        }
        return false;
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
		char[] s=in.next().toCharArray();
		if(topOrBottom(a,s,c,0) || topOrBottomRev(a,s,c,0))
		{
		    System.out.print("Top");
		}
		else if(rightOrLeft(a,s,r,c-1)|| rightOrLeftRev(a,s,r,c-1))
		{
		    System.out.print("Right");
		}
		else if(topOrBottom(a,s,c,r-1) || topOrBottomRev(a,s,c,r-1))
		{
		    System.out.print("Bottom");
		}
		else if(rightOrLeft(a,s,r,0)||rightOrLeftRev(a,s,r,0))
		{
		    System.out.print("Left");
		}
		else
		{
		    System.out.print("-1");
		}

	}
}
