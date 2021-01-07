*/
Example Input/Output 1:
Input:
SkillRack
Output:
Skil
lRack
Explanation:
The string S is SkillRack.
The character l is repeated 2 times continuously in S. So the substrings of S are Skil and lRack.

Example Input/Output 2:
Input:
aabbbbccc
Output:
a
abb
bbccc
Explanation:
The string S is aabbbbccc.
The character a is repeated 2 times continuously in S.
The character b is repeated 4 times continuously in S.
So the substrings of S are a, abb and bbccc.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length,b[]=new int[l],p=0;
        for(int i=0;i<l;i++)a.add(s[i]);
        for(int i=0;i<l;i++)
        {
            int c=1,j;
            for(j=i+1;j<l;j++)
            {
               if(s[i]==s[j]) c++;
               else break;
            }
            if(c%2==0)
            {
                String w="";
                for(int e=i;e<j;e++)
                    w+=s[e];
                b[p++]=i+w.length()/2;
            }
            i=j-1;
        }
        b[p++]=s.length;int j=0;
        for(int i=0;i<p;i++,System.out.println())
        {
            for(;j<b[i];j++)
            {
                System.out.print(s[j]);
            }
            j=b[i];
        }
	  }
}
