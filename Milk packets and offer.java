
/*
Example Input/Output 1:
Input:
14 3
Output:
20
Explanation:
Here N = 14 and X = 3.
The one of the possible ways to get the maximum number of full milk packets is given below.
Initially, he has 14 full milk packets.
After using the 14 full milk packets, he has 14 empty milk packets.
If he returns 12 empty milk packets, he will get 4 full milk packets.
After using the 4 full milk packets, he has 6 (2 + 4) empty milk packets.
If he returns 6 empty milk packets, he will get 2 full milk packets.
After using the 2 full milk packets, he has 2 empty milk packets.
Now he cannot get any full milk packets with these 2 empty milk packets.
So the maximum number of full milk packets that the customer can get is 20 (14 + 4 + 2).
Example Input/Output 2:
Input:
26 6
Output:
31
Example Input/Output 3:
Input:
4 5
Output:
4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int initial=in.nextInt();
		int x=in.nextInt();
		int full=initial;
		while(initial>=x)
		{
		    full+=initial/x;
		    initial=(initial/x)+(initial%x);

		}
		System.out.print(full);

	}
}
