/*
Example Input/Output 1:
Input:
15897635
Output:
30
Example Input/Output 2:
Input:
84085246
Output:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		int digit[]=new int[10];
		while(n>0)
		{
		    if((n%10)%2!=0)
		    {
		        digit[(int)(n%10)]++;
		    }
		    n/=10;
		}
		int sum=0;
		for(int i=1;i<=9;i+=2)
		{
		    if(digit[i]==0)
		    {
		        System.out.print("-1");
		        System.exit(1);
		    }
		    else
		    {
		        sum+=digit[i]*i;
		    }
		}
		System.out.print(sum);

	}
}
