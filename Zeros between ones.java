/*
Example Input/Output 1:
Input:
290 2
Output: YES
Explanation:
Here N = 290 and K = 2.
The binary representation of 290 is 100100010.
There are 2 zeroes present between first two 1s.
There are 3 zeroes present between last two 1s.
So YES is printed as the output.
Example Input/Output 2:
Input:
89 1
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt(),c=0;
        String s=Long.toBinaryString(n);
        String a[]=s.split("1");
        int l=a.length;
        for(int i=0;i<l-1;i++)
        {
            if(a[i].length()>=k) c++;
        }
        if(s.charAt(0)=='1' && s.charAt(s.length()-1)!='1') l--;
        System.out.print((c==l-1) ? "YES" : "NO");
	  }
}
