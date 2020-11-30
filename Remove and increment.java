/*
Example Input/Output 1:
Input:
5 3
12 5 8 1 6
Output:
14 18
Explanation:
The given 5 integers are 12, 5, 8, 1 and 6. Here X = 3, so we need to remove 3 integers.
After removing the integer 12, the remaining 4 integers become 8 11 4 9.
After removing the integer 8, the remaining 3 integers become 14 7 11.
After removing the integer 14, the remaining 2 integers become 14 18.
Example Input/Output 2:
Input:
6 2
99 5 7 6 1 2
Output:
34 32 27 27
Explanation:
The given 6 integers are 99, 5, 7, 6, 1 and 2.
Here X = 2, so we need to remove 2 integers.
After removing the integer 99, the remaining 5 integers become 25 27 26 21 21.
After removing the integer 25, the remaining 4 integers become 34 32 27 27.
Example Input/Output 3:
Input:
4 3
2 3 1 4
Output:
10
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    a.add(in.nextInt());
		}
		int count=0;
		for(int i=0;i<x;)
		{
		    int k=a.remove(0);
		    for(int j=0;j<k;j++)
		    {
		        a.set(j%a.size(),a.get(j%a.size())+1);//to access the index circularly
		    }
		    count++;
		    if(count==x)
		    {
		        break;
		    }
		}
		for(int i:a)
		{
		    System.out.print(i+" ");
		}


	}
}
