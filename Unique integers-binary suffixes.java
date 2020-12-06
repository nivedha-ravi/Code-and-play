/*
Input:
12
Output:
0 4 12
Explanation:
Here N = 12.
The binary representation of 12 is 1100.
The suffixes in the binary representation of 12 are 0, 00, 100 and 1100.
The unique integers that are formed by converting the above suffixes are 0, 4 and 12.
So the integers 0, 4 and 12 are printed in ascending order.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String bin=Integer.toBinaryString(in.nextInt());
		Set<Integer> a=new TreeSet<Integer>();
		for(int i=0;i<bin.length();i++)
		{
		    String s=bin.substring(i,bin.length());
		    a.add(Integer.parseInt(s,2));
		}
		ArrayList<Integer> b=new ArrayList<>(a);
		for(int i:b)
		{
		    System.out.print(i+" ");
		}

	}
}
