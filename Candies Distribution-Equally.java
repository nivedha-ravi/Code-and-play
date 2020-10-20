/*
Example Input/Output 1:
Input:
Aacddb 3
Output:
YES
Explanation:
Here the length of the string Aacddb is 6, so the boy is having 6 candies. Type a: 2 candies (case insensitive) Type c: 1 candy Type d: 2 candies Type b: 1 candy The value of N is 3, so the boy has 3 friends. One of the possible ways for the candies distribution is given below. Friend 1: ac Friend 2: Ad Friend 3: db So YES is printed as the output.
Example Input/Output 2:
Input:
FgaGrgwrgrEg 4
Output:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int a[]=new int[26];
		for(int i=0;i<ch.length;i++)
		{
		    a[Character.toLowerCase(ch[i])-'a']++;
		}
		int n=in.nextInt();
		for(int i=0;i<26;i++)
		{
		    if(a[i]>n)
		    {
		        System.out.print("NO");
		        System.exit(0);
		    }
		}
		System.out.print("YES");

	}
}
