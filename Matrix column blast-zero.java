/*
Input:
3 4
841 535 297 203
978 881 700 815
290 927 615 280
Output:
842 535 298 203
979 881 700 815
290 927 616 280
Explanation:
In the 1st column, the only integer 290 has the digit 0. So all the integers in the 1st column are incremented by 1 except 290.
In the 2nd column, there is no integer having the digit 0. So the 2nd column remains the same.
In the 3rd column, the only integer 700 has two 0s. So all the integers in the 3rd column are incremented by 1 except 700.
In the 4th column, there are two integers (203 and 280) having the digit 0. So the 4th column remains the same.
Hence the output is
842 535 298 203
979 881 700 815
290 927 616 280
*/
import java.util.*;
public class Hello {
    public static boolean zero(int n)
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

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<c;i++)
		{
		    int flag=0,indrow=0;
		    for(int j=0;j<r;j++)
		    {
		        if(zero(a[j][i]))
		        {
		            flag++;
		            indrow=j;
		        }
		    }
		    if(flag==1)
		    {

		      for(int l=0;l<r;l++)
		      {
		            if(l!=indrow)
		            {
		                  a[l][i]++;
		            }

		        }
		    }
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
