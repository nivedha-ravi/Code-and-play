/*
Input:
15 10
Output:
15 10 14 9 13 8 12 7 11 6
Explanation:
The absolute difference between 15 and 10 is 5. The largest integer is 15 and the smallest integer is 10. The previous 5 integers of 15 are 15, 14, 13, 12 and 11. The previous 5 integers of 10 are 10, 9, 8, 7 and 6. The integers in the series S1 are interlaced with the integers in the series S2. Hence the output is 15 10 14 9 13 8 12 7 11 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int d=Math.abs(n1-n2);
		int large=Math.max(n1,n2);
		int small=Math.min(n1,n2);
		for(int i=0;i<d;i++)
		{
		    System.out.print(large--+" "+small--+" ");
		}

	}
}
