/*
The program must accept a space separated string S as the input.
The program must print the output based on the following conditions.
- The program must print the string value "a: " followed by the number of occurrences of a and A in the string S.
- The program must print the string value "e: " followed by the number of occurrences of e and E in the string S.
- The program must print the string value "i: " followed by the number of occurrences of i and I in the string S.
- The program must print the string value "o: " followed by the number of occurrences of o and O in the string S.
- The program must print the string value "u: " followed by the number of occurrences of u and U in the string S.
- Finally, the program must print the string S after removing the vowels.
If the string S becomes empty after removing the vowels, the program must print -1 as the output.
Input:
Hello! Welcome to SkillRack
Output:
a: 1
e: 3
i: 1
o: 3
u: 0
Hll! Wlcm t SkllRck
*/
import java.util.*;
public class Hello {
    public static boolean isVowel(char ch)
    {
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?true:false;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int a[]=new int[26];
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch=Character.toLowerCase(str.charAt(i));
		    if(isVowel(ch))
		    {
		        a[ch-97]++;
		    }
		}
		for(int i=0;i<26;i++)
		{
		    if(i==0 || i==4 || i==8 || i==14 || i==20)
		    {
		        System.out.println((char)(i+97)+": "+a[i]);
		    }
		}
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
		    int printed=0;
		    for(int j=0;j<s[i].length();j+=1)
		    {
		        if(!isVowel(Character.toLowerCase(s[i].charAt(j))))
		        {
		            System.out.print(s[i].charAt(j));
		            printed=1;
		            flag=1;
		        }
		    }
		    if(printed==1)
		    {
		        System.out.print(" ");
		    }
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}

	}
}
