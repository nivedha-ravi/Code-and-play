/*
Input:
9
10 10 20 22 22 22 22 22 90
Output:
10 20 22 90
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int curr=in.nextInt();
		System.out.print(curr+" ");
		int prev=curr;
		for(int i=1;i<n;i++)
		{
		    curr=in.nextInt();
		    if(curr>prev)
		    {
		        System.out.print(curr+" ");
		        prev=curr;
		    }
		}

	}
}
