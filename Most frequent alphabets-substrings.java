/*
The program must accept a string S containing only lower case alphabets and Q queries as the input. Each query contains two integers representing the starting and the ending indices of a substring in S. For each query, the program must print the most frequently occurring alphabet in the specified substring. If two or more alphabets have the same frequency, then the program must print the alphabet that is least in the alphabetical order.
Input:
badbadbed
4
0 8
1 4
0 5
2 7
Output:
b
a
a
b
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    int start=in.nextInt();
		    int end=in.nextInt();
		    int a[]=new int[26];
		    for(int j=start;j<=end;j++)
		    {
		        a[s.charAt(j)-'a']++;
		    }
		    char maxchar='\0';
		    int max=0;
		    for(int k=0;k<26;k++)
		    {
		        if(a[k]>max)
		        {
		           max=a[k];
		           maxchar=(char)(k+97);
		        }
		    }
		    System.out.println(maxchar);
		}

	}
}
