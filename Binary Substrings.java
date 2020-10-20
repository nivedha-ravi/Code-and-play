/*
Input:
110
3
Output:
YES
Explanation:
Here S = 110 and N = 3.
The binary representation of 1 is 1.
The binary representation of 2 is 10.
The binary representation of 3 is 11.
Here the string S contains the binary representation of each integer from 1 to 3 as a substring.
So YES is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		HashSet<String> a=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i;j<s.length();j++)
		    {
		        a.add(s.substring(i,j+1));
		    }
		}
		for(int i=1;i<=n;i++)
		{
		    String bin=Integer.toBinaryString(i);
		    if(!(a.contains(bin)))
		    {
		        System.out.print("NO");
		        System.exit(1);
		    }
		}
		System.out.print("YES");

	}
}
