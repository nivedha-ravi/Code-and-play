/*
Boundary Condition(s):
2 <= R, C <= 50
1 <= X <= R
1 <= Y <= C
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space.
The (R+2)nd line contains X and Y separated by a space.
Output Format:
The first line contains the longest string among the four string values.
Example Input/Output 1:
Input:
6 8
D y j w h r y t
s a r A v g t y
l E b v m B y F
F p z w E j n s
m f p D j d r y
D v w r s e m D
4 5
Output: Evry
Explanation:
The position of the given cell is (4, 5).
S1 = Evry.
S2 = EBtt.
S3 = Edm.
S4 = EDw.
There are two string values having the same maximum length Evry and EBtt.
The string Evry is the first occurring string.
So it is printed as the output.
Example Input/Output 2:
Input:
10 7
E x e k e B h
e c j D b y e
j b l b t b d
h h C C h s d
D q j h d s d
n z s k D n h
l p i x k E D
b e a n b d v
b y d j y d d
t r y F u n u
8 2
Output: eikdsd
*/

import java.util.*;
public class Hello {

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
		int x=in.nextInt()-1;
		int y=in.nextInt()-1;
		String[] diag=new String[4];
	    String diag1="",diag2="",diag3="",diag4="";
		int xl=x,yl=y;
		while(xl>=0 && yl>=0)
		{
		    diag1+=a[xl--][yl--];
		}
		int xr=x,yr=y;
		while(xr>=0 && yr<=c-1)
		{
		    diag2+=a[xr--][yr++];
		}
		int blx=x,bly=y;
		while(blx<=r-1 && bly>=0)
		{
		    diag3+=a[blx++][bly--];
		}
		int bxl=x,byl=y;
		while(bxl<=r-1 && byl<=c-1)
		{
		    diag4+=a[bxl++][byl++];
		}
		diag[0]=diag1;
		diag[1]=diag2;
		diag[2]=diag4;
		diag[3]=diag3;
		int maxlen=0;
		String maxStr="";
		for(int i=0;i<4;i++)
		{
		    if(diag[i].length()>maxlen)
		    {
		        maxlen=diag[i].length();
		        maxStr=diag[i];
		    }
		}
		System.out.print(maxStr);
	}
}
