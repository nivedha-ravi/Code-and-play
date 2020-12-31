/*
Example Input/Output 1:
Input:
153 3
Output: 116
Explanation:
The binary representation of 153 is 10011001.
After reversing every 3 bits from right to left, the binary representation becomes 01110100.
The decimal equivalent of 01110100 is 116. So 116 is printed as the output.
Example Input/Output 2:
Input:
362 4
Output: 357
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        StringBuilder s=new StringBuilder(Integer.toBinaryString(n)),d=new StringBuilder();
        String a=s.reverse().toString();
        for(int i=0;i<a.length();i+=k)
        {
            int h=i+k;
            if(h>a.length()) h=a.length();
            String f=a.substring(i,h);
            for(int j=f.length()-1;j>=0;j--)
            {
                d.append(f.charAt(j)+"");
            }
        }
        System.out.print(Integer.parseInt(d.reverse().toString(),2));
	}
}
