/*
The program must accept two string values S1 and S2 and print the characters that occur K or more times in both S1 and S2. The program must also print the characters that occur just once in both S1 and S2. The characters must be printed in the same order as they appear in S2.
Input:
bookkeeper
repeated
3
Output:
repee
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    char[] s1=in.next().toCharArray();
	    char[] s2=in.next().toCharArray();
	    int ascii1[]=new int[128];
	    int ascii2[]=new int[128];
	    int k=in.nextInt();
	    for(int i=0;i<s1.length;i++)
	    {
	        ascii1[s1[i]]++;
	    }
	    for(int i=0;i<s2.length;i++)
	    {
	        ascii2[s2[i]]++;
	    }
        for(int i=0;i<s2.length;i++)
        {
            if((ascii1[s2[i]]==1 && ascii2[s2[i]]==1)||(ascii2[s2[i]]>=k && ascii1[s2[i]]>=k))
            {
                System.out.print(s2[i]);
            }
        }
	}
}
