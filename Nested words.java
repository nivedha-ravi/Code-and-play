/*
Input:
seven sesevesevennven
Output:
YES
Explanation:
W = seven S = sesevesevennven Here the string S is formed by inserting the word W inside the word W two times.
seven se(seven)ven => sesevenven seseve(seven)nven => sesevesevennven
Example Input/Output 2:
Input:
laptop llllaptoplaptopaptopaptopaptop
Output:
YES
Example Input/Output 3:
Input:
two twttwtwowooo
Output:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String st=in.next();
		for(int i=0;i<st.length();i++)
		{
		    int k=0,flag=0;
		    for(int j=i;j<st.length() && k<s.length();j++,k++)
		    {
		        if(st.charAt(j)!=s.charAt(k))
		        {
		            flag=1;
		        }
		    }
		    if(flag==0)
		    {
		        int limit=i+s.length();
		        int c=s.indexOf(st.charAt(limit));
		        int count=0;
		        k=c-1;
		        for(int l=i-1;k>=0;l--,k--)
		        {
		            if(s.charAt(k)==st.charAt(l))
		            {
		                count++;
		            }
		        }
		        k=c;
		        for(int l=limit;k<s.length();l++,k++)
		        {
		            if(s.charAt(k)==st.charAt(l))
		            {
		                count++;
		            }
		        }
		        if(count==s.length())
		        {
		            System.out.print("YES");
		            System.exit(1);
		        }
		    }

		}
		System.out.print("NO");

	}
}
