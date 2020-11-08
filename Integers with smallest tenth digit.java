/*
Input: 5 89 12 63 52 14 Output: 12 14
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    if((a[i]/10%10)<min)
		    {
		        min=(a[i]/10%10);
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if((a[i]/10%10)==min)
		    {
		        System.out.print(a[i]+" ");
		    }
		}

	}
}
