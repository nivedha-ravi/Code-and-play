/*
 Input:
 enVIronMENT
 Output:
 6
Explanation:
Here S = enVIronMENT. There are 6 substrings where the first alphabet and the last alphabet are adjacent to each other in the English alphabet set.
 nVIro nVIronM on onMEN nM MEN So 6 is printed as the output.
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+2;j<=s.length();j++)
		    {
		        String str=s.substring(i,j).toLowerCase();
		        if((str.charAt(0)=='a' && str.charAt(str.length()-1)=='z') || (str.charAt(0)=='z' && str.charAt(str.length()-1)=='a') || (str.charAt(0)+1==str.charAt(str.length()-1)) ||(str.charAt(0)-1==str.charAt(str.length()-1)))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);

	}
}
