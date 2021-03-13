/*
Input:
SkillRack
Do
Output:
Sk
Ra
Explanation: Here the given pattern is Do. The case of each alphabet in the pattern Do matches the substrings Sk and Ra. Hence the output is Sk Ra
*/
import java.util.*;
public class Hello {
    public static boolean caseCheck(String s,String p)
    {
        for(int i=0;i<p.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=p.charAt(i);
            if((Character.isUpperCase(ch1) && Character.isLowerCase(ch2))||(Character.isLowerCase(ch1) && Character.isUpperCase(ch2)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String p=in.next();
		int flag=0;
		for(int i=0;i<=s.length()-p.length();i++)
		{
		    String sub=s.substring(i,i+p.length());
		    if(caseCheck(sub,p))
		    {
		        System.out.println(sub);
		        flag=1;
		    }
		}
		if(flag==0)
            System.out.println("-1");
	}
}
