/*
Example Input/Output 1:
Input:
note
ball
Output:
nabotlle
Explanation:
S1 = note S2 = ball
The characters from both S1 and S2 are printed as per the given order. Hence the output is nabotlle
Example Input/Output 2:
Input:
abc123
456@xy
Output:
a54bc@612yx3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		for(int i=0;i<s1.length();i+=2)
		{
		    System.out.print(s1.charAt(i)+""+s2.charAt(i+1)+""+s2.charAt(i)+""+s1.charAt(i+1));
		}

	}
}
