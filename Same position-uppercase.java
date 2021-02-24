/*
Input: SkillRack EduCaTION Output: SlRackET Explanation: Here S1 = SkillRack and S2 = EduCaTION. In S2, the upper case alphabets are present in the positions 1, 4, 6, 7, 8 and 9. So the characters present in these 6 positions in S1 are printed. SlRack In S1, the upper case alphabets are present in the positions 1 and 6. So the characters present in these 2 positions in S2 are printed. ET
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		for(int i=0;i<s1.length();i++)
		{
		    if(Character.isUpperCase(s1.charAt(i)))
		    {
		        System.out.print(s.charAt(i));
		    }
		}
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isUpperCase(s.charAt(i)))
		    {
		        System.out.print(s1.charAt(i));
		    }
		}

	}
}
