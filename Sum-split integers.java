/*
Input:
4
45 4578 4005 90
Output:
186
Explanation:
Here N = 4.
After dividing each integer into two equal halves, the integers become 4 5 45 78 40 5 9 0.
The sum of the 8 resulting integers is 186. So 186 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    long sum=0L;
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    long first=Long.parseLong(s.substring(0,s.length()/2));
		    long second=Long.parseLong(s.substring(s.length()/2,s.length()));
		    sum=sum+first+second;
		}
		System.out.print(sum);

	}
}
