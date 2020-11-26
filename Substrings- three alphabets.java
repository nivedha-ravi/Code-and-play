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
    public static boolean contain(String s)
    {
        int f1=0,f2=0,f3=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                f1=1;
            }
            else if(s.charAt(i)=='b')
            {
                f2=1;
            }
            else if(s.charAt(i)=='c')
            {
                f3=1;
            }
        }
        return (f1==1 && f2==1 && f3==1)?true:false;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int count=0;
		for(int i=0;i<=s.length()-3;i++)
		{
		    for(int j=i+3;j<=s.length();j++)
		    {
		        if(contain(s.substring(i,j)))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);


	}
}
