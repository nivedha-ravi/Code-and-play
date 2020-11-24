/*
Input:
20 4 12 4
B B F F F F F F B F B B B F F F F F F B
4
Output:
Yes
Explanation:
The number of seats in a row is 20.
The first 4 seats B, B, F and F are in the first block.
The next 12 seats F, F, F, F, B, F, B, B, B, F, F and F are in the second block.
The next 4 seats F, F, F and B are in the third block.
The second block has the 4 continuous seats which are not booked yet.
So Yes is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        char[] ch=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=in.next().charAt(0);
        }
        int k=in.nextInt();
        for(int i=0;i<=n-k;i++)
        {
            Set<String> a=new HashSet<String>();
            for(int j=i;j<i+k;j++)
            {
                a.add(ch[j]+" ");
            }
            if(a.size()==1 && a.contains("F "))
            {
                if((i>=0 && i+k-1<=x-1) || (i>=x && i+k-1<=x+y-1) ||(i>=x+y && i+k-1<=x+y+z-1))
                {
                    System.out.print("Yes");
                    System.exit(1);
                }
            }
        }
        System.out.print("No");
	}
}
