/*
Input:
ant
antantantanantantant
Output:
t
Explanation: Here S1 = ant and S2 = antantantanantantant.
The missing character in S2 is t. So t is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ch1=in.next();
		String ch2=in.next()+" ";
		int rep=(ch2.length())/ch1.length();
		for(int i=0;i<rep;i++)
		{
		    ch1+=ch1;
		}
		for(int i=0;i<ch1.length();i++)
		{
		    if(ch1.charAt(i)!=ch2.charAt(i))
		    {
		        System.out.print(ch1.charAt(i));
		        break;
		    }
		}


	}
}
