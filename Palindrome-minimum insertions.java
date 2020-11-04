/*
Example Input/Output 1:
Input:
RoaR
Output:
1
Explanation:
Here S = RoaR.
If the character a or o is added to the string, the palindrome can be formed as given below.
RaoaR or RoaoR So the count 1 is printed as the output.
Example Input/Output 2:
Input:
aabcd
Output:
2
Explanation:
Here S = aabcd.
The minimum number of characters to be added in the string S is 2.
One of the possible palindromes is given below. abcdcba So the count 2 is printed as the output.
Example Input/Output 3:
Input:
Abc#12cba
Output:
4
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int i,j,k=0,n,a[256]={0};
    char s[10000];
    scanf("%s",s);n=strlen(s);
    for(i=0;i<n;i++)
    a[s[i]]++;
    for(i=0;i<256;i++)
    {
        if(a[i]%2==1)
        k++;
    }
    if(k>0)
    k--;
    printf("%d",k);
}



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		if(sb.reverse().toString().equals(s))
		{
		    System.out.print(0);
		    return;
		}
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:s.toCharArray())
		{
		    hm.put(c,hm.getOrDefault(c,0)+1);
		}
		int t=0;
		for(Map.Entry<Character,Integer> e:hm.entrySet())
		{
		    if(e.getValue()%2!=0)
		    t++;
		}
		System.out.print(Math.max(0,t-1));

	}
}
