/*
Input:
shopKeeper
3
p e K
Output:
pKe
Explanation:
The substring pKe is the shortest substring containing all the 3 characters p, e and K.
Hence the output is pKe.
*/
import java.util.*;
public class Hello {
    public static boolean find(String str,char[] ch)
    {
        for(int i=0;i<ch.length;i++)
        {
            if(str.indexOf(ch[i])==-1)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		char[] ch=new char[n];
		for(int i=0;i<n;i++)
		{
		    ch[i]=in.next().charAt(0);
		}
		int minLen=Integer.MAX_VALUE;
		String minString="";
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+n;j<=s.length();j++)
		    {
		        String str=s.substring(i,j);
		        if(find(str,ch))
		        {
		            if(minLen>str.length())
		            {
		                minLen=str.length();
		                minString=str;
		            }
		        }

		    }

		}
		System.out.print((minLen==s.length())?"-1":minString);

	}
}
