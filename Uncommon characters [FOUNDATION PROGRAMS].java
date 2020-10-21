/*
The program must accept two string values S1 and S2 as the input. The program must print the uncommon characters in both S1 and S2. The uncommon characters must be printed in sorted order based on their ASCII value. If there is no uncommon character, the program must print -1 as the output.
Input:
skillrack
codingskill
Output:
adgnor
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s1=in.next().toCharArray();
		char[] s2=in.next().toCharArray();
		int ascii1[]=new int[128];
		int ascii2[]=new int[128];
		for(int i=0;i<s1.length;i++)
		{
		    ascii1[s1[i]]++;
		}
		for(int i=0;i<s2.length;i++)
		{
		    ascii2[s2[i]]++;
		}
		int printed=0;
		for(int i=1;i<128;i++)
		{
		    if((ascii1[i]>0 && ascii2[i]==0)||(ascii1[i]==0 && ascii2[i]>0))
		    {
		        System.out.print((char)(i));
		        printed=1;
		    }
		}
		if(printed==0)
		{
		    System.out.print("-1");
		}

	}
}
