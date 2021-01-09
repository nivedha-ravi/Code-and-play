/*
Input:
6 3
54 8 100 6 200 80
Output:
54 100
8 100
100 200
80 200
Explanation:
Here N=6 and K=3.
There are four windows of size 3.
1st Window: 54 8 100 The largest two values are 54 100.
2nd Window: 8 100 6 The largest two values are 8 100.
3rd Window: 100 6 200 The largest two values are 100 200.
4th Window: 6 200 80 The largest two values are 80 200.
Hence the output is 54 100 8 100 100 200 80 200
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<=n-k;i+=1)
		{
		    ArrayList<Integer> arr=new ArrayList<Integer>();
		    for(int j=i;j<i+k;j++)
		    {
		        arr.add(a[j]);
		    }
		    Collections.sort(arr);
		    System.out.println(arr.get(k-2)+" "+arr.get(k-1));
		}


	}
}
