/*
INPUT:
6
OUTPUT:
Perfect number
Explanation:
sum of the factors==Number
1+2+3==6
Thus,Perfect number
*/
import java.util.*;
public class Hello {


    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    int sum=0;
	    for(int i=1;i<=n/2;i++)
	    {
	        if(n%i==0)
	        {
	            sum+=i;
	        }
	    }
	    System.out.print((sum==n)?"Perfect Number":"Not a Perfect Number");

	}
}
