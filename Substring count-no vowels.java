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




import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int c=0;
		String p="[^aeiouAEIOU]+";
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+2;j<=s.length();j++)
		    {
		        String t=s.substring(i,j);
		        if(t.matches(p))
		        {
		           // System.out.println(t);
		        c++;
		        }
		    }
		}
		System.out.print(c);

	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length-1;i++)
		{
		    int j=i;
		    if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='A' && ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && ch[i]!='U')
		    {
		      //  int l = 0;
		        for(j=i+1;j<ch.length;j++)
		        {
		            if(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u' && ch[j]!='A' && ch[j]!='E' && ch[j]!='I' && ch[j]!='O' && ch[j]!='U')
		                count++;
		            else
		                break;
		        }
		    }
		}
		System.out.println(count);
	}
}
