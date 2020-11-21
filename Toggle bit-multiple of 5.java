/*
Input:
1101
Output:
Yes
Explanation:
The given binary representation is 1101. The decimal equivalent of 1101 is N = 13.
All possible binary representations of 13 by toggling exactly one bit are given below. 0101 - 5 1001 - 9 1111 - 15 1100 - 12 The integers 5 and 15 are the multiples of 5. So Yes is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
		for(int i=0;i<s.length;i++)
		{
		    s[i]=(s[i]=='0')?'1':'0';
		    if(Integer.parseInt(new String(s),2)%5==0)
		    {
		        System.out.print("Yes");
		        System.exit(1);
		    }
		    s[i]=(s[i]=='0')?'1':'0';
		}
		System.out.print("No");

	}
}
