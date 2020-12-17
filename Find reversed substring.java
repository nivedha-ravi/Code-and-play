/*
Input:
SkaRllick
SkillRack
Output:
illRa
Explanation:
Here S1 = "SkaRllick" and S2 = "SkillRack".
The substring illRa in S2 is reversed in S1. So illRa is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s1=in.next().toCharArray();
		char[] s2=in.next().toCharArray();
		for(int i=0;i<s1.length;i++)
		{
		    if(s1[i]==s2[i])
		    {
		        s2[i]='-';
		    }
		    else
		    {
		        for(int j=s2.length-1;j>i;j--)
		        {
		            if(s1[j]==s2[j])
		            {
		                s2[j]='-';
		            }
		            else
		            {
		                break;
		            }
		        }
		        break;
		    }
		}
		for(int i=0;i<s2.length;i++)
		{
		    if(s2[i]!='-')
		    {
		    System.out.print(s2[i]);
		    }
		}

	}
}
