/*
Input:
8
3791 5548 4419 1860 1532 2180 6684 2959 
Output:
16242
Explanation:
Here N = 8. The first occurrences of all 10 digits in the given 8 integers (left to right) are highlighted below. 3791 5548 4419 1860 1532 2180 6684 2959 4419 - All digits in 4419 are already present in the previous integers. 2180 - All digits in 2180 are already present in the previous integers. 6684 - All digits in 6684 are already present in the previous integers. 2959 - All digits in 2959 are already present in the previous integers. The sum of these four integers is 16242, which is printed as the output
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
		long sum=0;
		int b[]=new int[10];
        for(int i=1;i<n;i++)
        {
            int num=a[i-1],flag=0;
            while(num>0)
            {
                b[num%10]++;
                num/=10;
            }
            num=a[i];
            while(num>0)
            {
                if(b[num%10]==0)
                {
                    flag=1;
                    break;
                }
                num/=10;
            }
            if(flag==0)
            {
                sum+=a[i];
            }

        }
        System.out.print((sum==0)?"-1":sum);
	}
}
