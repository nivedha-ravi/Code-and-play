/*
Input:
4 3
748 416 10
435 341 552
900 98 533
80 124 805
Output:
749 417 10
435 341 552
900 99 534
80 124 805
Explanation:
In the 1st row, the only integer 10 has the digit 0.
So all the integers in the 1st row are incremented by 1 except 10.
In the 2nd row, there is no integer having the digit 0. So the 2nd row remains the same.
 In the 3rd row, the only integer 900 has two 0s. So all the integers in the 3rd row are incremented by 1 except 900.
 In the 4th row, there are two integers (80 and 805) having the digit 0. So the 4th row remains the same.
 Hence the output is
 749 417 10
 435 341 552
 900 99 534
 80 124 805
*/
import java.util.*;
public class Hello {

    public static boolean isZero(int n)
    {
        while(n>0)
        {
            if(n%10==0)
            {
                return true;
            }
            n/=10;
        }
        return false;
    }
    public static void printer(int a[][],int add,int c,int r,int num)
    {
        for(int i=0;i<c;i++)
        {
            if(a[r][i]!=num)
            {
            System.out.print(a[r][i]+add+" ");
            }
            else
            {
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    int count=0,number=0;
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		        if(isZero(a[i][j]))
		        {
		            count++;
		            if(count==1)
		            {
		                number=a[i][j];
		            }
		        }
		    }
		    if(count==1)
		    {
		        printer(a,1,c,i,number);
		    }
		    else
		    {
		        printer(a,0,c,i,number);
		    }

		}

	}
}
