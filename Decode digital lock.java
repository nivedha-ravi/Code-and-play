/*
The program must accept an integer X representing the encoded key of a digital lock.
There are two ways to decode the key of the digital lock.
- If X is an armstrong number, then the key is the sum of even digits in the encoded key.
- If X is not an armstrong number, then the key is the sum of odd digits in the encoded key.
An armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits in the number.
The program must decode the key X and print it as the output
Input:
1634
Output:
10
Explanation:
The given integer 1634 (14 + 64 + 34 + 44) is an armstrong number. 
The sum of even digits in 1634 is 10 (6 + 4). So 10 is printed.
*/
import java.util.*;
public class Hello {
    public static boolean armstrong(int n,int count)
    {
        int temp=n,sum=0;
        while(n>0)
        {
            sum+=(int)(Math.pow((int)(n%10),count));
            n/=10;
        }
        return (temp==sum)?true:false;
    }
    public static int evenorodd(int n,int flag)
    {
        int sum=0;
        while(n>0)
        {
            if((n%10)%2==flag)
            {
                sum+=n%10;
            }
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=Integer.toString(n).length();
		if(armstrong(n,count))
		{
		    System.out.print(evenorodd(n,0));
		}
		else
		{
		    System.out.print(evenorodd(n,1));
		}


	}
}
