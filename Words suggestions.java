
/*
Input:
8
monsoon
moonlight
mute
monday
make
monks
monochrome
monster
mono
Output:
make monday monks monochrome monsoon monster moonlight mute
monday monks monochrome monsoon monster moonlight
monday monks monochrome monsoon monster
monochrome
Explanation:
Here S = mono.
After typing the 1st character m, the suggested words are make, monday, monks, monochrome, monsoon, monster, moonlight and mute. After typing the 2nd character o, the suggested words are monday, monks, monochrome, monsoon, monster and moonlight. After typing the 3rd character n, the suggested words are monday, monks, monochrome, monsoon and monster. After typing the 4th character o, the suggested word is monochrome. Hence the output is make monday monks monochrome monsoon monster moonlight mute monday monks monochrome monsoon monster moonlight monday monks monochrome monsoon monster monochrome
*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    s[i]=in.next();
		}
		Arrays.sort(s);
		String str=in.next();
		for(int i=0;i<str.length();i++,System.out.println())
		{
		    int flag=0;
		    for(int j=0;j<s.length;j++)
		    {
		        if(s[j].length()>=str.substring(0,i+1).length())
		        {
		        if(s[j].substring(0,i+1).equals(str.substring(0,i+1)))
		        {
		            System.out.print(s[j]+" ");
		            flag=1;
		        }
		        }

		    }
		    if(flag==0)
		    {
		        System.out.print("-1");
		    }
		}

	}
}
