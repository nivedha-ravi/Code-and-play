/*
Example Input/Output 1:
Input:
4287452036
5
Output: 2
Explanation:
Here S = 4287452036 and K = 5.
The four-digit integers divisible by 5 are 8745 and 4520, which are the substrings of S.
So their count 2 is printed as the output.
Example Input/Output 2:
Input:
53200180
12
Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt(),c=0;
        for(int i=0;i<=s.length()-4;i++)
        {
            String a=s.substring(i,i+4);
            if(Integer.parseInt(a)%k==0 && a.charAt(0)!='0') c++;
        }
        System.out.print(c);
	  }
}
