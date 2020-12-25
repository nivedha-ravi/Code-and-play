/*
Input:
skillrack
Output:
skill
rack*
Explanation:
Here S = "skillrack".
The character l is the continuously repeated character.
So Skill is printed in the first line.
Then the remaining characters are printed in the second line.
The maximum number of characters printed on the lines is 5.
Hence an asterisk is padded to the second line to make the length as 5.
So rack* is printed in the second line
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		String[] s=new String[ch.length];
		int k=0,maxlen=0,flag=0;
		String str="";
		for(int i=0;i<ch.length-1;i++)
		{
		    if(ch[i]==ch[i+1])
		    {
		        flag=1;
		        str+=ch[i];
		    }
		    else if(ch[i]!=ch[i+1])
		    {
		        str+=ch[i];
		        if(flag==1)
		        {
		            s[k++]=str;
		            if(maxlen<str.length())
		            {
		                maxlen=str.length();
		            }
		            str="";
		            flag=0;
		        }
		    }
		}
    s[k++]=str+ch[ch.length-1];
		if(s[k-1].length()>maxlen)
		{
		    maxlen=s[k-1].length();
		}
		for(int i=0;i<k;i++)
		{
		    if(s[i].length()<maxlen)
		    {
		        System.out.println(s[i]+""+"*".repeat(maxlen-s[i].length()));
		    }
		    else
		    {
		        System.out.println(s[i]);
		    }
		}
	}

}
