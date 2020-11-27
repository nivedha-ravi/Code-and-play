/*
Example Input/Output 1:
Input:
15 4
Output:
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3
Explanation: Here N = 15 and K = 4.
So 15 integers are printed based on the given conditions.
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3
Example Input/Output 2:
Input:
10 20
Output:
1 2 3 4 5 6 7 8 9 10
Example Input/Output 3:
Input:
18 3
Output:
1 2 3 2 1 2 3 2 1 2 3 2 1 2 3 2 1 2
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int printed=0,temp=1;
		while(printed<n)
		{
		    while(temp<=k && printed<n)
		    {
		        System.out.print(temp+" ");
		        temp++;
		        printed++;
		    }
		    temp=temp-2;
		    while(temp>=1 && printed<n)
		    {
		        System.out.print(temp+" ");
		        temp--;
		        printed++;
		    }
		    temp=temp+2;
		}

	}
}
