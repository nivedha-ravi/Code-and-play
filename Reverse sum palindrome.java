/*
Example Input/Output 1:
Input:
12
Output:
33
Explanation:
Here N = 12. The sum of 12 and its reverse 21 is 33 which is a palindromic integer.
So 33 is printed as the output.
Example Input/Output 2:
Input:
8
Output:
22
Explanation:
Here N = 8. The sum of 8 and its reverse 8 is 16 which is NOT a palindromic integer. 
So the next largest palindromic integer 16 is 22, which is printed as the output.
*/
import java.util.*;
public class Hello {
    public static int reverse(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n+reverse(n)==reverse(n+reverse(n)))
		{
		    System.out.print(n+reverse(n));

		}
		else
		{
		    for(int i=(n+reverse(n))+1;;i++)
		    {
		        if(i==reverse(i))
		        {
		            System.out.print(i);
		            break;
		        }
		    }
		}


	}
}
