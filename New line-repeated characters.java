/*
 Input:
 skillrack
 Output:
 skil
 lrac
 k
 Explanation:
 Here S = skillrack.
 The string S can be divided into three substrings as given below.
 skil lrac k
 The 5th character l is a repeated character.
 The 9th character k is a repeated character.
 Hence the output is skil lrac k
 Input:
 ENvironment
 Output:
 ENvironme
 nt
 Example Input/Output 3:
 Input:
 abcdabcdefge
 Output:
 abcd
 a
 b
 c
 defg
 e
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int a[]=new int[128];
		for(int i=0;i<ch.length;i++)
		{
		    if(a[ch[i]]!=0)
		    {
		        System.out.println();
		    }
		    System.out.print(ch[i]);
		    a[ch[i]]++;

		}

	}
}
