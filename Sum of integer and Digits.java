/*
Example Input/Output 1:
Input:
4
32 25 16 71
Output:
40 37 20 80
Explanation:
The 4 integers are 32 25 16 71.
The first integer 32 is an even integer, so the sum is 40 (32 + 2 + 6).
The second integer 25 is an odd integer, so the sum is 37 (25 + 3 + 1 + 7 + 1).
The third integer 16 is an even integer, so the sum is 20 (16 + 2 + 2).
The fourth integer 71 is an odd integer, so the sum is 80 (71 + 3 + 5 + 1).
*/
import java.util.*;
public class Hello {
    public static int evendigits(int num)
    {
        int sum=0;
         while(num>0)
        {
                if((num%10)%2==0)
                {
                    sum+=num%10;
                }
                num/=10;
        }
        return sum;
    }
    public static int odddigits(int num)
    {
            int sum=0;
            while(num>0)
            {
                if((num%10)%2!=0)
                {
                    sum+=num%10;
                }
                num/=10;
            }

        return sum;
    }

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int a[]=new int[n];
	    int sumofodd=0,sumofeven=0;
	    for(int i=0;i<n;i++)
	    {
	       a[i]=in.nextInt();
	       sumofeven+=evendigits(a[i]);
	       sumofodd+=odddigits(a[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]%2==0)
	        {
	            System.out.print((a[i]+sumofeven-evendigits(a[i]))+" ");
	        }
	        else
	        {
	            System.out.print((a[i]+sumofodd-odddigits(a[i]))+" ");
	        }
	    }

	}
}
