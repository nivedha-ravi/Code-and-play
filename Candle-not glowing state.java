
/*
Example Input/Output 1:
Input:
4
1 6 10 11 2
Output: 7
Explanation:
Here X = 2.
At t = 0, the candle is glowing.
At t = 1, the candle is NOT glowing because a drop of water drops on the candle.
At t = 2, the candle is NOT glowing.
At t = 3, the candle is glowing (2 seconds over).
At t = 4, the candle is glowing.
At t = 5, the candle is glowing.
At t = 6, the candle is NOT glowing as a drop of water drops on the candle.
At t = 7, the candle is NOT glowing.
At t = 8, the candle is glowing (2 seconds over).
At t = 9, the candle is glowing.
At t = 10, the candle is NOT glowing because a drop of water drops on the candle.
At t = 11, the candle is NOT glowing because a drop of water drops on the candle.
At t = 12, the candle is NOT glowing.
At t = 13, the candle is glowing (2 seconds over).
At t = 14, the candle is glowing and so on.
The total time that the candle is not in glowing state is 7.
So 7 is printed as the output.
Example Input/Output 2:
Input:
7
3 6 7 13 18 21 22 5
Output: 23
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt(),sum=0;
        for(int i=0;i<n-1;i++){
            int m=a[i+1]-a[i];
            if(m>x)  sum+=x;
            else  sum+=m;
        }
        System.out.print(sum+x);
	}
}
