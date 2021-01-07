/*
Example Input/Output 1:
Input:
4
Output:
23
Explanation:
The given series is 5, 14, 19, 23, 28, 32, 37, 41, 46, and so on.
The 4th term in the series is 23.
So 23 is printed as the output.
Example Input/Output 2:
Input:
13
Output:
69
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        for(int i=5;;i++)
        {
            int sum=0,l=i,p=1;
            while(l>0)
            {
                sum+=l%10;
                l=l/10;
                p=1;
            }
            if(sum%5==0 && p==1)
            {
                k++;
                if(k==n)
                {
                    System.out.print(i);
                    return;
                }
            }
        }
	}
}
