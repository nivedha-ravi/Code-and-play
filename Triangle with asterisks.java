/*
Example Input/Output 1:
Input:
8 6
w p H p x u
a G i D x w
C t B m x v
m b g A n B
w g o G t b
n s r G f i
t u w g y z
z u G C z r
4 6
1 3
7 3
Output:
w p * p x u
a G * * x w
C t * m * v
m b * A n *
w g * G * b
n s * * f i
t u * g y z
z u G C z r
Explanation:
The three corners of the triangle in the matrix is highlighted below.
w p H p x u
a G i D x w
C t B m x v
m b g A n B
w g o G t b
n s r G f i
t u w g y z
z u G C z r
After replacing the characters in the border of the triangle with asterisks, the matrix becomes
w p * p x u
a G * * x w
C t * m * v
m b * A n *
w g * G * b
n s * * f i
t u * g y z
z u G C z r
Example Input/Output 2:
Input:
9 10
a k B y j d x k q u
b u C y s z A E B j
x G g z f x x l t D
E t h j D m A A z k
j C E u t x j g j C
E v j i t x s t r w
r p o a m B g o w C
i g h y G s G v t B
f s h w z k b z o E
7 6
4 3
4 6
Output:
a k B y j d x k q u
b u C y s z A E B j
x G g z f x x l t D
E t * * * * A A z k
j C E * t * j g j C
E v j i * * s t r w
r p o a m * g o w C
i g h y G s G v t B
f s h w z k b z o E
*/

import java.util.*;
public class Hello {
    public static void traverse(char mat[][],int A1,int B1,int A2,int B2){
        while(A1!=A2 || B1!=B2){
            mat[A1][B1]='*';
            if(B1!=B2){
                if(B1>B2){
                    B1--;
                }
                else
                {
                    B1++;
                }
            }
            if(A1!=A2){
                if(A1>A2){
                    A1--;
                }
                else
                {
                    A1++;
                }
            }
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt(),C=sc.nextInt();
		char[][] matrix=new char[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=sc.next().charAt(0);
		    }
		}
		int X1=sc.nextInt()-1,Y1=sc.nextInt()-1;
		int X2=sc.nextInt()-1,Y2=sc.nextInt()-1;
		int X3=sc.nextInt()-1,Y3=sc.nextInt()-1;
		traverse(matrix,X1,Y1,X2,Y2);
		traverse(matrix,X2,Y2,X3,Y3);
		traverse(matrix,X3,Y3,X1,Y1);
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        System.out.print(matrix[row][col]+" ");
		    }
		    System.out.print("\n");
		}
	}
}

import java.util.*;
public class Hello {
    static Scanner sc=new Scanner(System.in);
    static int row,col;
    static char ch[][]=new char[50][50];

    public static void main(String[] args)
    {
        row=sc.nextInt();
        col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        ch[i][j]=sc.next().charAt(0);
		    }
		}
		int a=sc.nextInt()-1,b=sc.nextInt()-1,c=sc.nextInt()-1,d=sc.nextInt()-1,e=sc.nextInt()-1,f=sc.nextInt()-1;
        connect(a,b,c,d);
        connect(c,d,e,f);
        connect(a,b,e,f);
   	for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		    System.out.print(ch[i][j]+" ");
		    }
		    System.out.println();
		}

	}
	public static void connect(int startx,int starty,int endx,int endy)
	{
	    int row1=startx;
	    int col1=starty;

	    while(true)
	    {   ch[row1][col1]='*';
	        if(row1==endx && col1==endy)
	        {
	            break;
	        }
	        if(startx>endx)
	        {
	            row1--;
	        }
	        else if(startx<endx)
	        {
	            row1++;
	        }
	        if(starty>endy)
	        {
	            col1--;
	        }
	        else if(starty<endy)
	        {
	            col1++;
	        }
	    }
	}

}
