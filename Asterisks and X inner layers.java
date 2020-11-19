/*
Input:
8
b z r p h u w f
c p g b p u a j
n h f a l b i g
j k x n n y k p
k v j f u b l r
z x m a t z x j
s o c u r q d j
x n t v a g y h
2
Output:
b z r p h u w f
c p g b p u a j
n h * * * * i g
j k * * * * k p
k v * * * * l r
z x * * * * x j
s o c u r q d j
x n t v a g y h
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char[][] ch=new char[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        ch[i][j]=in.next().charAt(0);
		    }
		}
		int x=in.nextInt();
		int start=(n%2==0)?((n/2)-x):((n/2)-x+1);
		int end=n-start;
		for(int i=0;i<n;i++,System.out.println())
		{
		    for(int j=0;j<n;j++)
		    {
		       if(i>=start && j>=start && i<end && j<end)
		       {
		           System.out.print("* ");
		       }
		       else
		       {
		           System.out.print(ch[i][j]+" ");
		       }
		    }
		}


	}
}
