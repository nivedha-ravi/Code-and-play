/*
Input:
5 3
1 2 5
2 3 10
2 5 15
Output:
5 30 25 15 15
Explanation: Here M = 5 and N = 3.
Initially, the number of seats booked in the five buses are 0 0 0 0 0.
On the first day, 5 seats are booked for the buses from 1 to 2.
The number of seats booked in the five buses become 5 5 0 0 0.
On the second day, 10 seats are booked for the buses from 2 to 3.
The number of seats booked in the five buses become 5 15 10 0 0.
On the third day, 15 seats are booked for the buses from 2 to 5.
The number of seats booked in the five buses become 5 30 25 15 15.
Hence the output is 5 30 25 15 15
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int a[]=new int[m];
		for(int i=0;i<n;i++)
		{
		    int index1=in.nextInt();
		    int index2=in.nextInt();
		    int k=in.nextInt();
		    for(int j=index1-1;j<=index2-1;j++)
		    {
		        a[j]+=k;
		    }
		}
		for(int i=0;i<m;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
