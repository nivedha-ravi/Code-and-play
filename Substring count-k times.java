/*
Example Input/Output 1:
Input:
abcccc
1 4
Output:
YES
Explanation:
Here S = abcccc, L = 1 and K = 4.
The substring values of length 1 are a, b, c, c, c, c.
The substring c has repeated 4 times consecutively.
So YES is printed as the output.
Example Input/Output 2:
Input:
ababaaac
2 2
Output:
YES
Example Input/Output 3:
Input:
xyxyxzxy
2 3
Output:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=scan.nextInt();
		int k=scan.nextInt();
		for(int i=0;i<=s.length()-l;i++)
		{
		    int n=1;
		    String t=s.substring(i,i+l);
		    for(int j=i+l;j<=s.length()-l;j=j+l)
		    {
		        if(t.equals(s.substring(j,j+l)))
		        {
		             n++;
    		        if(n==k)
    		        {
    		           System.out.print("YES");
    		           return;
    		        }
		        }
		        else
		        {
		           // n=0;
		            break;
		        }
		    }
		}
		System.out.print("NO");

	}
}
