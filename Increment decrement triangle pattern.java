/*
Input:
5
Output:
-----0
----505
---45054
--3450543
-234505432
12345054321
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=n;
		for(int i=0;i<n+1;i++,System.out.println())
		{
		    for(int j=0;j<k;j++)
		    {
		        System.out.print("-");
		    }
		    for(int j=k+1;j<=n;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.print("0");
		    for(int j=n;j>k;j--)
		    {
		        System.out.print(j);
		    }
		    k--;
		}

	}
}
