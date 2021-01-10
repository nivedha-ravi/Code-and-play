/*
Input:
5 5
2 1 3 1 4
Output:
11
Explanation:
Here K = 5, so the string S is formed with 5 zeroes 00000. The 1st integer is 2, so the characters from the 2nd position are toggled. Now the string S becomes 01111. The 2nd integer is 1, so the characters from the 1st position are toggled. Now the string S becomes 10000. The 3rd integer is 3, so the characters from the 3rd position are toggled. Now the string S becomes 10111. The 4th integer is 1, so the characters from the 1st position are toggled. Now the string S becomes 01000. The 5th integer is 4, so the characters from the 4th position are toggled. Now the string S becomes 01011. The decimal equivalent of 01011 is 11. So 11 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char[] s="0".repeat(in.nextInt()).toCharArray();
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    for(int j=num-1;j<s.length;j++)
		    {
		        s[j]=(s[j]=='0')?'1':'0';
		    }

		}
		System.out.print(Integer.parseInt(new String(s),2));
	}
}
