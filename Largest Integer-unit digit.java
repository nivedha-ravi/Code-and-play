/*
 Input:
 6
 592 4215 85 702 217 92
 2
 Output:
 702
 Explanation:
 The integers having the unit digit 2 among the 6 integers are 592, 702 and 92.
 The largest integer is 702 which is printed as the output
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
		int d=in.nextInt();
		int max=0,flag=0;
		for(int i=0;i<n;i++)
		{
		    if(a[i]%10==d)
		    {
		        flag=1;
		        if(a[i]>max)
		        {
		            max=a[i];
		        }
		    }
		}
		System.out.print((flag==0)?"-1":max);

	}
}
