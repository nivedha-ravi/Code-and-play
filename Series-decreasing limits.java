/*
Input:
6
Output:
6 5 4 3 2 1 5 4 3 2 4 3
Explanation:
Here N = 6. The possible decreasing limits based on the given conditions are given below.
6 to 1 (6 5 4 3 2 1) 5 to 2 (5 4 3 2) 4 to 3 (4 3) Hence the output is 6 5 4 3 2 1 5 4 3 2 4 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int start=1;
		while(n>=start)
		{
		    for(int i=n;i>=start;i--)
		    {
		        System.out.print(i+" ");
		    }
		    n--;
		    start++;
		}

	}
}
