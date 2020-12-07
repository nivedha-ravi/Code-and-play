/*
Interior wall painting cost is X rupees per square feet and exterior wall painting cost is Y rupees per square feet. A house has M interior walls and N exterior walls to paint. The program must accept the surface area (in units of square feet) of the M interior walls and N exterior walls as the input. The program must print the total estimated cost with the precision up to 2 decimal places as the output.
Input:
18 12
6 3
14.3
15.2
10.5
12.5
15.2
14.3
10.25
10.25
10.0
Output:
1842.00
Explanation:
The interior wall painting cost is 18 rupees per square feet and the exterior wall painting cost is 12 rupees per square feet.
Here M=6 and N=3.
The total surface area of 6 interior walls is 82 (14.3+15.2+10.5+12.5+15.2+14.3) square feet.
The total cost to paint 6 interior walls is 1476 (82*18) rupees.
The total surface area of 3 exterior walls is 30.5 (10.25+10.25+10.0) square feet.
The total cost to paint 3 exterior walls is 366 (30.5*12) rupees.
The total estimated cost with the precision upto two decimal places is 1842.00 (1476 + 366) rupees.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int m=in.nextInt();
		int n=in.nextInt();
		double totalsurfaceareaint=0.0;
		for(int i=0;i<m;i++)
		{
		    totalsurfaceareaint+=in.nextDouble();
		}
		double totalcostint=totalsurfaceareaint*x;
		double totalsurfaceareaext=0.0;
		for(int i=0;i<n;i++)
		{
		    totalsurfaceareaext+=in.nextDouble();
		}
		double totalcostext=totalsurfaceareaext*y;
		System.out.printf("%.2f",totalcostext+totalcostint);


	}
}
