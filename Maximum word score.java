
/*
Example Input/Output 1:
Input:
abcdefghijklmnopqrstuvwxyz
5
pen
gold
doll
coin
book
Output:
doll
Explanation:
Here N = 5.
The 5 words and their scores are given below.
pen - 35 (16+5+14)
gold - 38 (7+15+12+4)
doll - 43 (4+15+12+12)
coin - 41 (3+15+9+14)
book - 43 (2+15+15+11)
The words doll and book have the same maximum score, so the first occurring word doll is printed as the output.
Example Input/Output 2:
Input:
zyxwvutsrqponmlkjihgfedcba
4
pencil
horse
candle
cookie
Output:
candle
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		int max=0;
		String maxstr="";
		for(int i=0;i<n;i++)
		{
		    String str=in.next();
		    int sum=0;
		    for(int j=0;j<str.length();j++)
		    {
		        sum+=s.indexOf(str.charAt(j))+1;
		    }
		    if(sum>max)
		    {
		        max=sum;
		        maxstr=str;
		    }

		}
		System.out.print(maxstr);

	}
}
