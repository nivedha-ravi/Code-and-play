/*
Input:
6 6
a b c d e f
g h i j k l
m n o p q r
s t u v w x
y z a b c d
e f g h i j
Output:
a
kl
mno
uvwx
yzabc
efghij
Explanation: The first character in the 1st row is a. The last 2 characters in the 2nd row are k and l. The first 3 characters in the 3rd row are m, n and o. The last 4 characters in the 4th row are u, v, w and x. The first 5 characters in the 5th row are y, z, a, b and c.
The last 6 characters in the 6th row are e, f, g, h, i and j. Hence the output is a kl mno uvwx yzabc efghij
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
		for(int i=0;i<r;i++,System.out.println())
		{
		   if(i%2==0)
		   {
		       for(int j=0;j<=i && j<c;j++)
		       {
		           System.out.print(a[i][j]);
		       }
		   }
		   else
		   {
		       int count=(c-i-1<0)?0:c-i-1;
		       for(int j=count;j<c;j++)
		       {
		           System.out.print(a[i][j]);
		       }
		   }
		}

	}
}
