/*
Input:
3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
Explanation: Here N = 3, the value of 23 - 1 is 7. Hence the output is
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
*/
import java.util.*;
public class Hello {
    public static void print(int diff,String s)
    {
        for(int i=0;i<diff;i++)
        {
            System.out.print(0+" ");
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<=Math.pow(2,n)-1;i++)
		{
		    String s=Integer.toBinaryString(i);
		    print(n-s.length(),s);
		}

	}
}
