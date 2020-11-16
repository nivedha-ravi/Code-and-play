/*
Example Input/Output 1:
Input:
#ProGramming#
mango#
-
Output:
PrGrmi#
Explanation:
S1 = #ProGramming# S2 = mango# CH = -
So the characters of S2 must be removed in the string S1 (from left to right).
After removing the characters of S2 in S1, the string S1 becomes PrGrmi#.
Hence the output is PrGrmi#
Example Input/Output 2:
Input:
Skill
Rack
+
Output:
SkillRack
Example Input/Output 3:
Input:
C@rtOOn
Spider10
*
Output:
CS@pritdOeOrn10
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder s1=new StringBuilder(in.next());
		StringBuilder s2=new StringBuilder(in.next());
		char ch=in.next().charAt(0);
		if(ch=='+')
		{
		    System.out.print(s1.toString()+s2.toString());
		}
		else if(ch=='-')
		{
		    for(int i=0;i<s2.length();i++)
		    {
		        for(int j=0;j<s1.length();j++)
		        {
		            if(s1.charAt(j)==s2.charAt(i))
		            {
		                s1.deleteCharAt(j);
		                break;
		            }
		        }
		    }
		    System.out.print((s1.length()==0)?"-1":s1.toString());

		}
        else
        {
            int maxLen=(s1.length()>s2.length())?s1.length():s2.length();
            for(int i=0;i<maxLen;i++)
            {
                if(i<s1.length())
                {
                    System.out.print(s1.charAt(i));
                }
                if(i<s2.length())
                {
                    System.out.print(s2.charAt(i));
                }
            }

        }
	}
}
