/*
Input:
011011000
Output:
1100
Explanation:
The given string is 011011000.
The longest substring with equal 1s and 0s where all the 1s present in the first half is 1100.
So 1100 is printed as the output.
Example Input/Output 2:
Input:
000111001100111000
Output:
000111
Example Input/Output 3:
Input:
1111111
Output:
-1
*/
import java.util.*;
public class Hello {
    public static int noofones(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
    public static int onesorzeros(String s)
    {
        Set<String> a=new HashSet<String>();
        for(int i=0;i<s.length();i++)
        {
            a.add(s.charAt(i)+" ");
        }
        return a.size();
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int longer=0;
		String str="";
		for(int i=0;i<ch.length;i++)
		{
		    String s=ch[i]+"";
		    for(int j=i+1;j<ch.length;j++)
		    {
		        s+=ch[j];
		        String firsthalf=s.substring(0,s.length()/2);
		        String secondhalf=s.substring(s.length()/2,s.length());
		        if((s.length()-noofones(s))==noofones(s))
		        {
		            if((onesorzeros(firsthalf)==1 && onesorzeros(secondhalf)==1)||(onesorzeros(secondhalf)==1 && onesorzeros(firsthalf)==1))
		            {
		                if(s.length()>longer)
		                {
		                    longer=s.length();
		                    str=s;
		                }
		            }
		        }


		    }

		}
		System.out.print((longer==0)?"-1":str);

	}
}
