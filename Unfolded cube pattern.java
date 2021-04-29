/*
Input:
a b c d e f
3
Output:
* * * f f f * * * * * *
* * * f f f * * * * * *
* * * f f f * * * * * *
d d d a a a b b b c c c
d d d a a a b b b c c c
d d d a a a b b b c c c
* * * e e e * * * * * *
* * * e e e * * * * * *
* * * e e e * * * * * *
Explanation:
Here N = 3, so the size of each face in the cube is 3*3.
The face 1 grid contains the character 'a'.
The face 2 grid contains the character 'b'.
The face 3 grid contains the character 'c'.
The face 4 grid contains the character 'd'.
The face 5 grid contains the character 'e'.
The face 6 grid contains the character 'f'.
The empty spaces are replaced with the asterisks.
Hence the output is
* * * f f f * * * * * *
* * * f f f * * * * * *
* * * f f f * * * * * *
d d d a a a b b b c c c
d d d a a a b b b c c c
d d d a a a b b b c c c
* * * e e e * * * * * *
* * * e e e * * * * * *
* * * e e e * * * * * *
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] a=new char[6];
		for(int i=0;i<6;i++)
		{
		    a[i]=in.next().charAt(0);
		}
		int n=in.nextInt();
		for(int i=1;i<=n*3;i++,System.out.println())
		{
		    int k=0;
		    for(int j=1;j<=4;j++)
		    {
		        if(i<=n)
		        {
		            System.out.print((j==2)?(a[5]+" ").repeat(n):("* ").repeat(n));
		        }
		        else if(i<=n*2)
		        {
		            System.out.print((j==1)?(a[3]+" ").repeat(n):(a[k++]+" ").repeat(n));
		        }
		        else
		        {
		            System.out.print((j==2)?(a[4]+" ").repeat(n):"* ".repeat(n));
		        }
		    }

		}

	}
}
