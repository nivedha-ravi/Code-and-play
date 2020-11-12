/*
Example Input/Output 1:
Input:
8
Output:
1 1 1 1
1 2 2 2
1 2 4 4
1 2 4 8
Example Input/Output 2:
Input:
72
Output:
1 1 1 1 1 1 1 1 1 1 1 1
1 2 2 2 2 2 2 2 2 2 2 2
1 2 3 3 3 3 3 3 3 3 3 3
1 2 3 4 4 4 4 4 4 4 4 4
1 2 3 4 6 6 6 6 6 6 6 6
1 2 3 4 6 8 8 8 8 8 8 8
1 2 3 4 6 8 9 9 9 9 9 9
1 2 3 4 6 8 9 12 12 12 12 12
1 2 3 4 6 8 9 12 18 18 18 18
1 2 3 4 6 8 9 12 18 24 24 24
1 2 3 4 6 8 9 12 18 24 36 36
1 2 3 4 6 8 9 12 18 24 36 72
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> fact= new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		    fact.add(i);
		}
		int f=fact.size();
		for(int i=0;i<f;i++)
		{
		    for(int j=0;j<f;j++)
		    {
		        if(j>=i)
		        System.out.print(fact.get(i)+" ");
		        else
		        System.out.print(fact.get(j)+" ");
		    }
		    System.out.println();
		}

	}
}
