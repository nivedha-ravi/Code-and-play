/*
Input:
GoodGoodGood
3
Output:
YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char s[]=in.next().toCharArray();
		int t=in.nextInt();
		int len=s.length;
		if(len%t!=0)
		{
		    System.out.print("NO");
		    return;
		}
		else
		{
		    int k=len/t;
		    for(int i=0;i<t;i++)
		    {
		        for(int j=0;j<k;j++)
		        {
		            if(s[j]!=s[i*k+j])
		            {
		                System.out.print("NO");
		                return;
		            }
		        }
		    }
		}
		System.out.print("YES");

	}
}
