/*
 A metro train is a ring route train which runs in a circular fashion. There are N stations in the train's route. The names of the N stations and the distance between each station (from the previous station to the current station) are passed as the input to the program. For every 1000 meters, the ticket fare is X rupees. The name of the source station, the name of destination station and the value of X are also passed as the input to the program. The program must print the total ticket fare F as the output. The total ticket fare F must be ceiled.
 Input:
 8
 AB DK GH KJ OP RS XY TK
 600 800 750 900 1600 900 1400 1500
 XY KJ
 5
 Output:
 23
 Explanation:
 The source station is XY and the destination station is KJ.
 The stations present between the source and the destination are XY, TK, AB, DK, GH and KJ.
 The distance between XY to TK is 1500 meters. The distance between TK to AB is 600 meters.
 The distance between AB to DK is 800 meters. The distance between DK to GH is 750 meters.
 The distance between GH to KJ is 900 meters. The total distance covered is 4550 meters.
 The total ticket cost is 22.75.
 After ceiling the ticket cost, it becomes 23. So 23 is printed as the output.
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> stations=new ArrayList<String>();
		ArrayList<Integer> tktfair=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    stations.add(in.next());
		}
		for(int i=0;i<n;i++)
		{
		    tktfair.add(in.nextInt());
		}
		String start=in.next();
		String end=in.next();
		int x=in.nextInt();
		int total=0;
		if(stations.indexOf(start)<stations.indexOf(end))
		{
		    for(int i=stations.indexOf(start)+1;i<=stations.indexOf(end);i++)
		    {
		        total+=tktfair.get(i);
		    }
		}
		else
		{
		    for(int i=stations.indexOf(start)+1;i<stations.size();i++)
		    {
		        total+=tktfair.get(i);
		    }
		    for(int i=0;i<=stations.indexOf(end);i++)
		    {
		        total+=tktfair.get(i);
		    }
		}
		double f=total/1000.0;
		System.out.print((int)Math.ceil(f*x));

	}
}
