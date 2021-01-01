/*
Input:
7 6
s C G o f a
w j o t F i
b j f g k t
k G p j E p
f y w r r G
B m h h g m
e y w b m k
3 3
Output:
fpwhw
Explanation:
The position of the given cell is (3, 3).
S1 = foG. S2 = fgkt. S3 = fpwhw. S4 = fjb.
The string fpwhw is the longest string.
So it is printed as the output.
*/
import java.util.*;
public class Hello {
    public static String maximum(String str,String strmax)
    {
        if(str.length()>strmax.length())
        {
            return str;
        }
        return strmax;
    }

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
		    }
		}
		int x=in.nextInt()-1;
		int y=in.nextInt()-1;
        String strmax="",str="";
        for(int i=x;i>=0;i--)//top
        {
            str+=a[i][y];
        }
        strmax=maximum(str,strmax);
        str="";
        for(int i=y;i<c;i++)//right
        {
            str+=a[x][i];
        }
        strmax=maximum(str,strmax);
        str="";
        for(int i=x;i<r;i++)//bottom
        {
            str+=a[i][y];
        }
        strmax=maximum(str,strmax);
        str="";
        for(int i=y;i>=0;i--)//left
        {
            str+=a[x][i];
        }
        strmax=maximum(str,strmax);
        System.out.print(strmax);
	}
}
