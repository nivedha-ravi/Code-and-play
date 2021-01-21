/*
Input:
30 4
Output:
6
Explanation:
Here N = 30 and K = 4. There are 6 integers from 1 to 30 having the sum of digits divisible by 4. 4 8 13 17 22 26 So 6 is printed as the output.
*/
import java.util.*;
public class Hello {
    public static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
		    if(sum(i)%k==0)
		    {
		        count++;
		    }
		}
		System.out.print(count);

	}
}
