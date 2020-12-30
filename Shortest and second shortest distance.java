/*
There are N paths to travel from the city A to the city B. The distance of each path is passed as the input to the program. The program must print the shortest distance and the second shortest distance among the given N distances as the output. If all the distances are equal, then the program must print the string value "Equal" as the output.
Input:
5
400 100 500 200 300
Output:
100 200
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashSet<Integer> a=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++)
		{
		    a.add(in.nextInt());
		}
        ArrayList<Integer> b=new ArrayList<Integer>(a);
        Collections.sort(b);
        System.out.print((b.size()==1)?"Equal":b.get(0)+" "+b.get(1));
	}
}
