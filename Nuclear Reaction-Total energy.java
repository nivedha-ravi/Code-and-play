/*
In a chemistry lab, the combination of two nuclear chemicals produces initial energy as E. This energy E changes at a consistent rate R every second. The scientist wishes to calculate the total energy produced if the reaction is allowed to occur for T seconds. The program must accept the values of E, R and T as the input. The program must print the total energy produced as the output.
Input:
6 4 4
Output:
48
Explanation:
For T = 1, the initial energy 6 is generated. For T = 2, a consistent rate of 4 is added. So it becomes 10. For T = 3, again 4 is added to the previous energy value. So it becomes 14. For T = 4, again 4 is added to the previous energy value. So it becomes 18.
The total energy produced after 4 seconds is 48 (6 + 10 + 14 + 18).
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int e=in.nextInt();
		int r=in.nextInt();
		int t=in.nextInt();
		int energy=0;
		for(int i=1;i<=t;i++)
		{
		    energy+=e;
		    e+=r;
		}
        System.out.print(energy);
	}
}
