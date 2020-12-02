/*
Input:
4
158 270 100 310
Output:
720
Explanation:
The unit digit of the 1st integer 158 is NOT equal to 0. So it remains the same.
The unit digit of the 2nd integer 270 is equal to 0. So 1 is borrowed from its tenth digit and added to the unit digit.
Hence the integer becomes 261. The unit digit of the 3rd integer 100 is equal to 0.
Here it is not possible to borrow 1 from its tenth digit(as it is already 0). So it is replaced with 0.
The unit digit of the 4th integer 310 is equal to 0. So 1 is borrowed from its tenth digit and added to the unit digit.
Hence the integer becomes 301.
The sum of 158, 261, 0 and 301 is 720.
So 720 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    if(num%10==0)
		    {
		        if(num/10%10==0)
		        {
		            continue;
		        }
		        else
		        {
		           num=((num/100)*100)+(((num/10%10)-1)*10)+1;
		           sum+=num;

		        }
		    }
		    else
		    {
		        sum+=num;
		    }
		}
		System.out.print(sum);

	}
}
