/*
Input:
Apple
Output:
3
Explanation:
In the string Apple, the substrings without vowels and having the length greater than 1 are pp, pl, ppl.
Here the count is 3, which is printed as the output.
*/
import java.util.*;
public class Hello {
    public static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
        int count=0;
        for(int i=1;i<s.length;i++)
        {
            for(int j=0;j<s.length-i;j++)
            {
                int flag=0;
                for(int k=j;k<=i+j;k++)
                {
                    if(isVowel(s[k]))
                    {
                        flag=1;
                    }
                }
                if(flag==0)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
	}
}
