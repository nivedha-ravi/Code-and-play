/*
Input:
528
Output:
baeiocuaei
Explanation:
Here N=528, the binary representation of 528 is 1000010000.
After replacing 0s with the lower case vowels circularly in alphabetical order, the string becomes 1aeio1uaei.
After replacing 1s with the lower case consonants circularly in alphabetical order, the string becomes baeiocuaei.
So baeiocuaei is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder bin=new StringBuilder(Integer.toBinaryString(in.nextInt()));
		String vowels="aeiou";
		String conso="bcdfghjklmnpqrstvwxyz";
		int k=0,j=0;
		for(int i=0;i<bin.length();i++)
		{
		    if(bin.charAt(i)=='0')
		    {
		        bin.setCharAt(i,vowels.charAt(j));
		        j++;
		        if(j==vowels.length())
		        {
		            j=0;
		        }

		    }
		    else
		    {
		        bin.setCharAt(i,conso.charAt(k));
		        k++;
		        if(k==conso.length())
		        {
		            k=0;
		        }

		    }
		}
		System.out.print(bin.toString());

	}
}
