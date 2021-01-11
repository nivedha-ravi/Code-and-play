/*
Input:
6 12
Output:
4
Explanation:
Here N = 6 and K = 12.
The multiplication chart of 6x6 is given below.
1 2 3 4 5 6
2 4 6 8 10 12
3 6 9 12 15 18
4 8 12 16 20 24
5 10 15 20 25 30
6 12 18 24 30 36
Here 12 occurs 4 times.
So 4 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(i*j==k)
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);

	}
}
