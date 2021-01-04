/*
 Input:
 12 13
 Output:
 0
 Explanation:
 Here N = 12 and K = 13.
 The binary representation of 12 is 1100. So the string S = 1100.
 After concatenating its reverse, the string becomes 11000011.
 After inserting the character '1' at the middle, the string becomes 110010011.
 Similarly, the string S is expanded as 1100100111110010011. The 13th character in S is 0 which is printed as the output.
*/

 import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		while(bin.length()<=k)
		{
		    String temp = bin;
		    bin += "1";
		    StringBuilder sb = new StringBuilder(temp);
		    bin += sb.reverse().toString();
		}
		System.out.print(bin.charAt(k-1));
	}
}
