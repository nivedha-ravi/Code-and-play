/*
Example Input/Output 1:
Input:
4
02:45 10
03:20 25
02:55 15
05:30 35
3 15 50
Output:
2
2
Explanation:
Here X = 3, Y = 15 and Z = 50.
For the 1st vehicle, the parking time is 02:45 and the total parking charge is 30 ((2 + 1) * 10).
For the 2nd vehicle, the parking time is 03:20 and the total parking charge is 75 (3 * 25).
For the 3rd vehicle, the parking time is 02:55 and the total parking charge is 45 ((2 + 1) * 15).
For the 4th vehicle, the parking time is 05:30 and the total parking charge is 175 (5 * 35).
The number of vehicles parked for more than 3 hours and 15 minutes is 2.
The number of vehicles charged above 50 rupees is 2. Hence the output is 2 2
Example Input/Output 2:
Input:
6
00:30 15
04:45 20
01:00 10
05:30 20
02:31 12
00:45 30
0 59 30
Output:
4
3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] charges=new int[n];
		int[] timings=new int[n];
		for(int i=0;i<n;i++)
		{
		    String[] time=in.next().split(":");
		    int hour=Integer.parseInt(time[0]);
		    int min=Integer.parseInt(time[1]);
		    int charge=in.nextInt();
		    timings[i]=hour*60+min;
		    if(timings[i]<=30)
		    {
		        charges[i]=charge;
		    }
		    else if(min<=30)
		    {
		        charges[i]=hour*charge;
		    }
		    else
		    {
		        charges[i]=(hour+1)*charge;
		    }
		}
        int parkinghr=in.nextInt();
        int parkingmin=in.nextInt();
        int parkingcharge=in.nextInt();
        int noofvehicles_hightime=0,noofvehicles_highcharge=0;
        for(int i=0;i<n;i++)
        {
            if(charges[i]>parkingcharge)
            {
                noofvehicles_highcharge++;
            }
            if(timings[i]>parkinghr*60+parkingmin)
            {
                noofvehicles_hightime++;
            }
        }
        System.out.print(noofvehicles_hightime+"\n"+noofvehicles_highcharge);
	}
}
