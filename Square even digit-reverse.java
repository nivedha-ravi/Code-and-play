/*
Example Input/Output 1:
Input: 12345
Output: 561341
Explanation:
The even digits in the integer 12345 are 2 and 4.
After replacing the even digits 2 and 4 with 4 and 16 respectively, the integer becomes 143165.
After reversing the integer 143165, the integer becomes 561341.
So 561341 is printed as the output.
Example Input/Output 2:
Input: 60500
Output: 5063
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        String s="";
        for(int i=0;i<c.length;i++){
            if((c[i]-'0')%2==0) s+=(c[i]-'0')*(c[i]-'0');
            else s+=c[i];
        }
        StringBuilder sb=new StringBuilder(s);
        System.out.print(Long.parseLong(sb.reverse().toString()));
	}
}
