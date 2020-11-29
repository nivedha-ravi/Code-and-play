/*
The program must accept a list of mobile numbers (in separate lines) as the input. The character q or Q represents the end of the input. The program must print the number of invalid mobile numbers among the given list of mobile numbers as the output. A valid mobile number contains exactly 10 digits.
Input:
9854653221
997878A1576
9992224578
999225789900
986578989B
817524990
Q
Output:
4
*/
import java.util.*;
public class Hello {
    public static boolean alpha(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int count=0;
		while(in.hasNext())
		{
		    String s=in.next();
		    if(s.equalsIgnoreCase("Q"))
		    {
		        break;
		    }
		    if(s.length()>10 || s.length()<10)
		    {
		        count++;
		    }
		    else if(alpha(s))
		    {
		        count++;
		    }
		}
		System.out.print(count);

	}
}
