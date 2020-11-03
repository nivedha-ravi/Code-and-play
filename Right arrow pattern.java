/*
Input:
5
Output:
--*
---*
*****
---*
--*
Explanation:
Here N = 5.
The 1st line contains (5-1)/2 hyphens and an asterisk. --*
The 2nd line contains (5-1)/2 + 1 hyphens and an asterisk. ---*
The 3rd line contains 5 asterisks. *****
The 4th line contains (5-2) hyphens and an asterisk. ---*
The 5th line contains (5-3) hyphens and an asterisk. --*
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<(int)(n/2);i++,System.out.println("*"))
		{
		    for(int j=0;j<(int)((n-1)/2+i);j++,System.out.print("-"));
		}
		for(int i=0;i<n;i++,System.out.print("*"));
		System.out.println();
		int hyphen=2;
		for(int i=0;i<(int)(n/2);i++,hyphen++,System.out.println("*"))
		{
		    for(int j=0;j<n-hyphen;j++,System.out.print("-"));

		}


    }
}
