/*
The program must accept N string values as the input. The program must print the length of the longest palindrome that can be formed by the N string values as the output.
Boundary Condition(s):
1 <= N, Length of each string <= 100
Input Format:
The first line contains N. The next N lines, each contains a string.
Output Format:
The first line contains the length of the longest palindrome that can be formed by the N string values.
Example Input/Output 1:
Input:
3
LEMON
APPLE
CAT
Output: 9
Explanation:
One of the longest palindrome that can be formed by the given 3 string values is AELPNPLEA.
Here the length is 9. So 9 is printed as the output.
Example Input/Output 2:
Input:
3
engine
energy
deer
Output: 13
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[128];
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    for(int j=0;j<s.length();j++)
		    {
		        a[s.charAt(j)]++;
		    }
		}
		int longestLen=0,isoddlen=0;
		for(int i='A';i<='z';i++)
		{
		    if(a[i]%2!=0)
		    {
		        isoddlen=1;
		    }
		    longestLen+=(a[i]/2)*2;

		}
        System.out.print((isoddlen==1)?longestLen+1:longestLen);
	}
}
