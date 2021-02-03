/*
Example Input/Output 1:
Input:
7
3 2 4 5 4 8 4
4
Output:
4 5 8
Explanation:
Here N = 4. The integers between the first occurring 4 and last occurring 4 are 5 4 8. After sorting the integers 5, 4, 8 in ascending order, the integers become 4, 5, 8. Hence the output is 4 5 8
Example Input/Output 2:
Input:
5
1 8 2 3 4
8
Output:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    a.add(in.nextInt());
		}
		int t=in.nextInt();
		if(a.indexOf(t)==a.lastIndexOf(t) || a.indexOf(t)+1==a.lastIndexOf(t))
		{
		    System.out.print("-1");
		}
		else
		{
		    ArrayList<Integer> b=new ArrayList<>();
		    for(int i=a.indexOf(t)+1;i<a.lastIndexOf(t);i++)
		    {
		        b.add(a.get(i));
		    }
		    Collections.sort(b);
		    for(int i:b)
		    {
		        System.out.print(i+" ");
		    }
		}

	}
}
