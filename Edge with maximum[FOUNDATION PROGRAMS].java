/*
The program must accept an integer matrix of size RxC containing unique integers as the input.
The program must find the maximum integer M among the integers in the border of the matrix.
Then the program must print the output based on the following conditions.
- If M is present in the top edge of the matrix, the program must print "TOP".
- If M is present in the right edge of the matrix, the program must print "RIGHT".
- If M is present in the bottom edge of the matrix, the program must print "BOTTOM".
- If M is present in the left edge of the matrix, the program must print "LEFT".
- If M is present in the one of the four corners of the matrix, the program must print "CORNER".

*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		int maxi=0,max=0,maxj=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		        if(i==0||j==0||i==r-1||j==c-1)
		        {
		            if(a[i][j]>max)
		            {
		                max=a[i][j];
		                maxi=i;
		                maxj=j;
		            }
		        }
		    }
		}
		if((maxi==0 || maxi==r-1) && (maxj==0 || maxj==c-1))
		{
		    System.out.print("CORNER");
		}
		else if(maxi==0)
		{
		    System.out.print("TOP");
		}
		else if(maxi==r-1)
		{
		    System.out.print("BOTTOM");
		}
		else if(maxj==0)
		{
		    System.out.print("LEFT");
		}
		else if(maxj==c-1)
		{
		    System.out.print("RIGHT");
		}
	}
}
