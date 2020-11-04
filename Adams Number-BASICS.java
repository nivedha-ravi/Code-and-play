/*
INPUT:
12
OUTPUT:
Adams Number
Explanation:
12*12=144
reverse of 144=441
reverse of 12=21
21*21=441
reverse of square of 12=reverse of square of 21(reverse of 12)
If so, It is an Adams Number
*/
import java.util.*;
public class Hello {
    public static int palindrome(int n)
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
		if(palindrome(n*n)==palindrome(n)*palindrome(n))
		{
		    System.out.print("Adams Number");
		}
		else
		{
		    System.out.print("Not an Adams Number");
		}


	}
}
