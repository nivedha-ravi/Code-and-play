/*
Example Input/Output 1:
Input:
SkilllLRack
Output:
SkillRack
Explanation:
The given string is SkilllLRack.
The continuous alphabets l and L are same but different in case.
So they are removed from the string SkilllLRack.
Now, no more such continuous alphabets present in the string.
So SkillRack is printed as the output.
Example Input/Output 2:
Input:
CoOcDOOoodjing
Output:
jing
Example Input/Output 3:
Input:
OOOooopPSs
Output: -1
*/

import java.util.*;
public class Hello {

    static int p=0;
    static String d="";

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        dup(s);
        System.out.print((d.length()==0) ? "-1" : d);
	}
	public static void dup(char a[])
  {
	    int c=0;
	    for(int i=0;i<a.length-1;i++)
      {
	        char x=Character.toLowerCase(a[i]),y=Character.toLowerCase(a[i+1]);
	        if(Character.isLowerCase(a[i]) && Character.isUpperCase(a[i+1]) && x==y)
          {
	            a[i]='`';a[i+1]='`';c=1;
	        }
          else if(Character.isUpperCase(a[i]) && Character.isLowerCase(a[i+1]) && x==y)
          {
	            a[i]='`';a[i+1]='`';c=1;
	        }
	    }
	    String s="";
	    for(int i=0;i<a.length;i++)
      {
	        if(a[i]!='`') s+=a[i];
	    }
	    if(c>0) dup(s.toCharArray());
	    else d=s;
	 }
}
