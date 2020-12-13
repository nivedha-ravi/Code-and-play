/*
Input:
2010
Output:
31-Jan-2010
28-Feb-2010
31-Mar-2010
30-Apr-2010
31-May-2010
30-Jun-2010
31-Jul-2010
31-Aug-2010
30-Sep-2010
31-Oct-2010
30-Nov-2010
31-Dec-2010
Explanation:
There are 31 days in the months Jan, Mar, May, Jul, Aug, Oct and Dec.
There are 30 days in the months Apr, Jun, Sep and Nov.
There are 28 days in the month Feb as the year 2010 is not a leap year
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		int dates[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		String months[]=new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		if((y%100!=0 && y%4==0) || y%400==0)
		{
		    dates[1]=29;
		}
		for(int i=0;i<12;i++)
		{
		    System.out.println(dates[i]+"-"+months[i]+"-"+y);
		}


	}
}
