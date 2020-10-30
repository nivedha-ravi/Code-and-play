/*
Input:
58
Output:
CG
Explanation: Here N = 58. Iteration 1: R = 58 % 26 = 6. So the 7th upper case alphabet is G. Now N becomes 2 (58 / 26). Iteration 2: R = 2 % 26 = 2. So the 3rd upper case alphabet is C. Now N becomes 0 (2 / 26).
The string S becomes GC. So the reverse of S is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s="";
		while(n>0)
		{
		    s+=(char)((n%26)+65);
		    n=n/26;
		}
        System.out.print((new StringBuffer(s).reverse()).toString());
	}
}
