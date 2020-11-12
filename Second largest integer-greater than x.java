/*
Input:
8
18 11 13 9 6 25 36 2
15
Output:
25
Explanation:
The second largest integer greater than 15 among the given 8 integers is 25. So 25 is printed as the outpu
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    a.add(in.nextInt());
		}
		int x=in.nextInt();
		for(int i:a)
		{
		    if(i>x)
		    {
		        b.add(i);
		    }
		}
		a.clear();
        Collections.sort(b);
        System.out.print(b.get(1));
	}
}
