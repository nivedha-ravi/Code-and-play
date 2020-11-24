/*
 Input:
 8 5
 x 9 D l c
 0 k F m 6
 E q n 9 z
 w d B k w
 l n 1 B C
 q 7 r G m
 F p w 5 m
 s 6 l w 0
 3 4
 6 3
 Output:
 9nqEwdBkwCB1nlq7r
 Explanation:
 In the given 8x5 character matrix, the characters from the cell (3, 4) to the cell (6, 3) in horizontal zig-zag direction are highlighted below. x 9 D l c 0 k F m 6 E q n 9 z w d B k w l n 1 B C q 7 r G m F p w 5 m s 6 l w 0
 So 9nqEwdBkwCB1nlq7r is printed as the output.
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
		    }
		}
		int c1x=in.nextInt();
		int c1y=in.nextInt();
		int c2x=in.nextInt();
		int c2y=in.nextInt();
		for(int j=c1y-1;j>=0;j--)
		{
		    System.out.print(a[c1x-1][j]);
		    if(j==c2y-1 && c2x-1==c1x-1)
		    {
		        System.exit(1);
		    }
		}
		int k=1,flag=0;
		for(int i=c1x;;i++)
		{
		    if(k%2==1)
		    {
		        for(int j=0;j<c;j++)
		        {
		            System.out.print(a[i][j]);
		            if(i==c2x-1 && j==c2y-1)
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    else
		    {
		        for(int j=c-1;j>=0;j--)
		        {
		            System.out.print(a[i][j]);
		            if(i==c2x-1 && j==c2y-1)
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        break;
		    }
		    k++;
		}


	}
}
