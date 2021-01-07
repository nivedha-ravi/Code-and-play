/*
Input:
4
5729 123 7979 1099
Output:
16010
Explanation:
Here N = 4.
After shifting the smallest digit in each integer to the right, the integers become 5792 231 7997 1990.
The sum of the modified integers is 16010. So 16010 is printed as the output.
*/
import java.util.*;
public class Hello {
    public static char min(char[] ch)
    {
        Arrays.sort(ch);
        return ch[0];
    }
    public static String shift(int ind,char[] ch)
    {
        for(int i=ind;i<ch.length-1;i++)
        {
            char c=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=c;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    char mini=min(s.toCharArray());
		    int ind=s.lastIndexOf(mini);
		    String str=shift(ind,s.toCharArray());
		    sum+=Integer.parseInt(str);
		}
		System.out.print(sum);

	}
}
