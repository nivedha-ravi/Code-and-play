/*
Input:
24 100 80
Output:
20 10 5 4 4 2 2 1 1
Explanation:
Here X = 24, Y = 100 and Z = 80.
The common factors of 24 and 100 are 1, 2 and 4.
The common factors of 100 and 80 are 1, 2, 4, 5, 10 and 20.
So the factors are printed in descending order.
20 10 5 4 4 2 2 1 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		for(int i=1;i<=Math.min(x,y);i++)
		{
		    if(x%i==0 && y%i==0)
		    {
		        a.add(i);
		    }
		}
		for(int i=1;i<=Math.min(y,z);i++)
		{
		    if(y%i==0 && z%i==0)
		    {
		        a.add(i);
		    }
		}
		Collections.sort(a,Collections.reverseOrder());
		for(int i:a)
		{
		    System.out.print(i+" ");
		}

	}
}
