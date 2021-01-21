/*
Input:
5
2 4 5 1 3
Output:
5
5 3
Explanation:
The possible inversion pairs are (2, 1), (4, 1), (4, 3), (5, 1) and (5, 3).
The count of inversions is 5 and the last occurring inversion pair is (5, 3).
Hence the output is
5
5 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
    int inv1=0,inv2=0,count=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>a[j])
		        {
		            count++;
		            inv1=a[i];
		            inv2=a[j];
		        }
		    }
		}
		System.out.print(count+"\n"+inv1+" "+inv2);

	}
}
