/*
Input:
4
skill
Robot
boy
TALL
Output:
sRbTkooAibyLloLlt
Explanation:
The given 4 strings are skill, Robot, boy and TALL. The first character of the 4 string values are s, R, b and T.
The second character of the 4 string values are k, o, o and A.
Similarly, the remaining characters are printed.
So sRbTkooAibyLloLlt is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] s=new String[n];
		int maxlen=0;
		for(int i=0;i<n;i++)
		{
		    s[i]=in.next();
		    if(s[i].length()>maxlen)
		    {
		        maxlen=s[i].length();
		    }
		}
		for(int i=0;i<maxlen;i++)
		{
		    for(int j=0;j<s.length;j++)
		    {
		        if(i<s[j].length())
		        {
		            System.out.print(s[j].charAt(i));
		        }
		    }
		}


	}
}
