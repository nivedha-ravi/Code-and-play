/*
Input:
skillrack
k
Output:
skcarllik
Explanation:
The first occurrence and the last occurrence of the character k in the given string are highlighed below.
skillrack After reversing the characters between them, the string becomes skcarllik.
So skcarllik is printed as the output
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch=in.next().charAt(0);
		int first=s.indexOf(ch);
		int last=s.lastIndexOf(ch);
		char[] c=s.toCharArray();
		for(int i=first+1,j=last-1;i<j;i++,j--)
		{
		    char ci=c[i];
		    c[i]=c[j];
		    c[j]=ci;
		}
		System.out.print(new String(c));


	}
}
