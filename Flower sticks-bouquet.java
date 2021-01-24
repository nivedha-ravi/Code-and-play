/*
There are N flower sticks to make a bouquet. The first K flower sticks must be arranged in increasing order and the remaining flower sticks must be arranged in decreasing order. The program must accept N integers representing the heights of the N flower sticks and the value of K as the input.
The program must print the heights of the N flower sticks after making the bouquet.
Input:
10
90 22 92 42 6 24 30 58 50 29
6
Output:
6 22 24 42 90 92 58 50 30 29
Explanation:
Here K=6 and the given 10 integers are 90 22 92 42 6 24 30 58 50 29 After arranging the first 6 flower sticks in increasing order and the remaining 4 flower sticks in decreasing order, the height of the 10 flower sticks become 6 22 24 42 90 92 58 50 30 29
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int k=in.nextInt();
		Arrays.sort(a,0,k);
		Arrays.sort(a,k,n);
		for(int i=k,j=n-1;i<j;i++,j--)
		{
		    int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
