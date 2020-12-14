/*
Input:
theskillrackonlinecodingplatform
4
skill
code
in
eskill
Output:
3 7
-1
15 16
2 7
*/
import java.util.*;
public class Hello {
    public static boolean getSubstring(String s,String str)
    {
        int len=str.length();
        for(int i=0;i<=s.length()-len;i++)
        {
            String st=s.substring(i,i+len);
            if(st.equals(str))
            {
                System.out.println(i+" "+(i+len-1));
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str=in.next();
		    if(getSubstring(s,str))
		    {
		        System.out.println("-1");
		    }
		}

	}
}
