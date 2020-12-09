/*
Input:
9 7
w h g E C g E
h y b g G w A
D j s z p r r
o z q l v g y
t C s w s h y
d m g d k D f
x o C i B v z
F G F C A d m
n t u q B i z
1 3
5 7
7 5
3 1
Output:
w h * E C g E
h * b * G w A
* j s z * r r
o * q l v * y
t C * w s h *
d m g * k * f
x o C i * v z
F G F C A d m
n t u q B i z
Explanation:
The four corners of the tilted rectangle are given below.
Top corner: 1 3
Right Corner: 5 7
Bottom Corner: 7 5
Left corner: 3 1
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
		int topx=in.nextInt()-1;
		int topy=in.nextInt()-1;
		int rightx=in.nextInt()-1;
		int righty=in.nextInt()-1;
		int bottomx=in.nextInt()-1;
		int bottomy=in.nextInt()-1;
		int leftx=in.nextInt()-1;
		int lefty=in.nextInt()-1;
	    for(int i=topx,j=topy;i<=leftx && j>=lefty;i++,j--)
	    {
	        a[i][j]='*';
	    }
	    for(int i=topx,j=topy;i<=rightx && j<=righty;i++,j++)
	    {
	        a[i][j]='*';
	    }
	    for(int i=leftx,j=lefty;i<=bottomx && j<=bottomy;i++,j++)
	    {
	        a[i][j]='*';
	    }
	    for(int i=bottomx,j=bottomy;i>=rightx && j<=righty;i--,j++)
	    {
	        a[i][j]='*';
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
