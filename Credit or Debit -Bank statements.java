/*
Input:
5000 5
1000 4000
500 4500
400 4900
900 4000
2000 2000
Output:
Opening Balance:5000
Debit:1000 Balance:4000
Credit:500 Balance:4500
Credit:400 Balance:4900
Debit:900 Balance:4000
Debit:2000 Balance:2000
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int prev=in.nextInt();
		int n=in.nextInt();
		System.out.println("Opening Balance:"+prev);
		for(int i=0;i<n;i++)
		{
		    int amt=in.nextInt();
		    int next=in.nextInt();
		    if(prev-next==amt)
		    {
		        System.out.print("Debit:");
		    }
		    else
		    {
		        System.out.print("Credit:");
		    }
		    System.out.println(amt+" "+"Balance:"+next);
		    prev=next;
		}

	}
}
