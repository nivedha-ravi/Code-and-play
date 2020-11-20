/*
Input:
Cream
JAM
Output:
4
Explanation:
After removing the first 3 characters from the string Cream, the string becomes am.
After removing the first character from the string JAM, the string becomes AM.
The revised string values am and AM are equal by ignoring the case.
The minimum number of characters to be removed from the left side of the given string values is 4 (3 + 1).
So 4 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch1=in.next().toLowerCase().toCharArray();
		char[] ch2=in.next().toLowerCase().toCharArray();
		int len=ch1.length+ch2.length,len1=ch1.length,len2=ch2.length,count=0;
		for(int i=len1-1,j=len2-1;i>=0 && j>=0;i--,j--)
		{
		    if(ch1[i]==ch2[j])
		    {
		        count+=2;
		    }
		    else
		    {
		        break;
		    }
		}
		System.out.print((count!=0)?len-count:"-1");

	}
}
