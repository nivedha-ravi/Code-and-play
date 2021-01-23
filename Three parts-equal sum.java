/*
 Input:
 8
 0 8 -6 5 -3 4 1 -3
 Output:
 YES
 Explanation:
 The given 8 integers are 0, 8, -6, 5, -3, 4, 1 and -3. The sum of the first three integers is 2 (0 + 8 + (-6)). The sum of the next two integers is 2 (5 + (-3)). The sum of the last three integers is 2 (4 + 1 + (-3)). So YES is printed as the output.
 */
import java.util.*;
public class Hello {
    public static int sum(int a,int b,int arr[])
    {
        int s=0;
        for(int i=a;i<=b;i++)
        {
            s+=arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<=n-3;i++)
		{
		    for(int j=i+1;j<=n-2;j++)
		    {
		        if(sum(0,i,a)==sum(i+1,j,a) && sum(i+1,j,a)==sum(j+1,n-1,a))
		        {
		            System.out.print("YES");
		            System.exit(1);
		        }
		    }
		}
		System.out.print("NO");

	}
}
