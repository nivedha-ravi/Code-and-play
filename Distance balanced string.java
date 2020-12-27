/*
Example Input/Output 1:
Input:
aBcFBCDc
Output:
Yes
Explanation:
The alphabets in the first half are a, B, c and F.
Their positions are 1, 2, 3 and 6. So the sum is 12.
The alphabets in the second half are B, C, D and c.
Their positions are 2, 3, 4 and 3. So the sum is 12.
Here both the first and the second halves have the same sum.
So Yes is printed as the output.
Example Input/Output 2:
Input:
AbCdEfGh
Output:
No
Example Input/Output 3:
Input:
abcDCBA
Output:
Yes
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length,n=0,sum1=0,sum2=0;
        if(l%2!=0) n=l/2+1;
        else n=l/2;
        for(int i=0;i<l/2;i++){
            sum1+=(int)(Character.toLowerCase(s[i]))-96;
        }
        for(int i=n;i<l;i++){
            sum2+=(int)(Character.toLowerCase(s[i]))-96;
        }
        System.out.print((sum1==sum2) ? "Yes" : "No");
	  }
}
