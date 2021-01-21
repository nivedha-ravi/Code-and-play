/*
 Input:
 nckgo
 mango
 Output:
 YES
 Explanation:
 Here S1 = nckgo and S2 = mango.
 The 1st alphabet in S1 and S2 are not same. So n is replaced by shifting 1 position to the left. Now S1 becomes mckgo.
 The 2nd alphabet in S1 and S2 are not same. So c is replaced by shifting 2 positions to the left. Now S1 becomes makgo.
 The 3rd alphabet in S1 and S2 are not same. So k is replaced by shifting 3 positions to the right. Now S1 becomes mango.
 The 4th and 5th alphabets in S1 and S2 are same. Now S1 and S2 are equal. So YES is printed as the output.
 Example Input/Output 2:
 Input:
 football
 gqlxwust
 Output:
 YES
 Example Input/Output 3:
 Input:
 spcnujdt
 robotics
 Output:
 NO
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int cnt = 1;
		for(int i=0;i<s1.length();i++)
		{
		    char ch1 = s1.charAt(i);
		    char ch2 = s2.charAt(i);
		    if(ch1!=ch2)
		    {
		        char check = ch1,check1=ch1;
		        int flag=0;
		        for(int j=1;j<=cnt;j++)
		        {
		            if(check=='z') check='a'-1;
		            check++;
		        }
		        if(check==ch2)flag=1;
		        for(int j=1;j<=cnt;j++)
		        {
		            if(check1=='a') check1='z'+1;
		            check1--;
		        }
		        if(flag!=1 && check1==ch2) flag=1;
		        if(flag==0)
		        {
		            System.out.print("NO");
		            System.exit(0);
		        }
		    }
		    cnt++;
		}
		System.out.print("YES");
	}
}
