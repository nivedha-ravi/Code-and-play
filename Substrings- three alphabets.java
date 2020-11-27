/*
Input:
abcbca
Output:
7
Explanation:
Here S = "abcbca".
There are 7 substrings containing at least one occurrence of all three alphabets a, b and c.
abc
abcb
abcbc
abcbca
bcbca
cbca
bca
So 7 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int count=0;
		for(int i=0;i<=s.length()-3;i++)
		{
		    for(int j=i+3;j<=s.length();j++)
		    {
          String str=s.substring(i,j);
		        if(str.contains("a") && str.contains("b") && str.contains("c"))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);


	}
}
