/*
Input:
2-5-9-11:3-9
Output:
2 3 4 5
5 6 7 8 9
9 10 11
3 4 5 6 7 8 9
Explanation:
There are two patterns separated by a colon.
The first pattern is 2-5-9-11.
The integers from 2 to 5 are printed in the first line.
The integers from 5 to 9 are printed in the second line.
The integers from 9 to 11 are printed in the third line.
The second pattern is 3-9.
The integers from 3 to 9 are printed in the fourth line.
Hence the output is 2 3 4 5 5 6 7 8 9 9 10 11 3 4 5 6 7 8 9
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s[]=in.nextLine().split(":");
		for(int i=0;i<s.length;i++)
		{
		    String[] str=s[i].split("-");
		    for(int j=0;j<str.length-1;j++,System.out.println())
		    {
		        int a=Integer.parseInt(str[j]);
		        int b=Integer.parseInt(str[j+1]);
		        for(int k=a;k<=b;k++)
		        {
		            System.out.print(k+" ");
		        }
		    }
		}

	}
}
