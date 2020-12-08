/*
Example Input/Output 1:
Input:
skillrack
2 3 4
Output:
YES
Explanation:
Here X = 2, M = 3 and N = 4.
The substrings ill and llr contain 2 unique characters.
The length of ill is 3 (M <= 3 <= N).
The length of llr is 3 (M <= 3 <= N).
So YES is printed as the output.
Example Input/Output 2:
Input:
BaseBall
6 2 6
Output:
NO
Example Input/Output 3:
Input:
Abc#123
2 1 2
Output:
YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int x=in.nextInt();
		int m=in.nextInt();
		int n=in.nextInt();
		for(int i=0;i<s.length();i++)
		{
		    for(int k=i;k<=s.length();k++)
		    {
		        String str=s.substring(i,k);
		        if(str.length()>=m && str.length()<=n)
		        {
		        Set<String> a=new HashSet<String>();
		        for(int j=0;j<str.length();j++)
		        {
		            a.add(str.charAt(j)+"");
		        }
		        if(a.size()==x)
		        {
		            System.out.print("YES");
		            System.exit(1);
		        }
		        }
		    }

		}
        System.out.print("NO");
	}
}
