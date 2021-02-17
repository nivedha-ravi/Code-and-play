/*
Input:
5
13 17 20 24 25 6
Output:
14 15 16 18 19 21
Explanation: The given 5 integers are 13, 17, 20, 24 and 25. The missing integers among the given 5 integers are 14, 15, 16, 18, 19, 21, 22 and 23. The first 6 missing integers are 14, 15, 16, 18, 19 and 21. Hence the output is 14 15 16 18 19 21
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int k=in.nextInt();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n-1;i++)
        {
            int num=a[i]+1;
            while(num<a[i+1])
            {
                b.add(num++);
            }
        }
        if(b.size()<k)
        {
            System.out.print("-1");
        }
        else
        {
            for(int i=0;i<k;i++)
            {
                System.out.print(b.get(i)+" ");
            }
        }
	}
}
