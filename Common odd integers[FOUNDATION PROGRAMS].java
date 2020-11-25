/*
The program must accept the values for two integer arrays of size M and N respectively. The program must print the common odd integer values in both the arrays as the output. The odd integers must be printed in the same order as they appear in the first array. If there is no common odd integer, the program must print -1 as the output.
Note: Each array has unique integer values.
Input:
7 6
97 37 30 39 89 60 44
89 37 15 97 20 98
Output:
97 37 89
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int printed=0;
		ArrayList<Integer> odd=new ArrayList<Integer>();
		ArrayList<Integer> odd1=new ArrayList<Integer>();
		for(int i=0;i<m;i++)
		{
		    int num=in.nextInt();
		    if(num%2!=0)
		    {
		        odd.add(num);
		    }
		}
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    if(num%2!=0)
		    {
		        odd1.add(num);
		    }
		}
		for(int i=0;i<odd.size();i++)
		{
		    if(odd1.contains(odd.get(i)))
		    {
		        System.out.print(odd.get(i)+" ");
		        printed=1;
		    }
		}
		if(printed==0)
		{
		    System.out.print("-1");
		}

	}
}
