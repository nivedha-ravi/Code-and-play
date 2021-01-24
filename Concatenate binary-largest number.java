/*
Input: 7 10 Output: 122 Explanation: The binary representation of 7 is 111. The binary representation of 10 is 1010. The largest possible integer formed is 122 and its binary representation is 1111010. So 122 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=Integer.toBinaryString(in.nextInt());
		String b=Integer.toBinaryString(in.nextInt());
		System.out.print(Math.max(Integer.parseInt(a+b,2),Integer.parseInt(b+a,2)));

	}
}
