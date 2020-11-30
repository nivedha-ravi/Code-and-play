/*
Example Input/Output 1:
Input:
5
Output:
2
Explanation:
The 5th term in the above sequence is 2. So 2 is printed as the output.
Example Input/Output 2:
Input:
28
Output:
13
*/

//Series:  0 to 2^1-1,0 to 2^2-1,0 to 2^3-1,and so on..
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long num=scanner.nextLong();
		Long ctr=2L;
		while(ctr<num)
		{
		    num-=ctr;
		    ctr*=2;
		}
		System.out.println(num-1);
	}
}
