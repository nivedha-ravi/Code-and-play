/*
Input:
19
Output:
YES
Explanation:
Here N = 19. The only possible way to form 19 is 3 * 3 + 5 + 5. So YES is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n>0)
		{
		    if(n==3 || n==5)
		    {
		        System.out.print("YES");
		        System.exit(0);
		    }
		    if(n%3==0)
		    {
		        n/=3;
		    }
		    else
		    {
		        n-=5;
		    }
		}
        System.out.print("NO");
	}
}
