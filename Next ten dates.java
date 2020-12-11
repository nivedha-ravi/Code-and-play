/*
Input:
23-06-2020
Output:
24-06-2020
25-06-2020
26-06-2020
27-06-2020
28-06-2020
29-06-2020
30-06-2020
01-07-2020
02-07-2020
03-07-2020
*/
import java.util.*;
public class Hello {
    public static boolean isLeapYear(int y)
    {
        return ((y%400==0) || (y%4==0 && y%100!=0))?true:false;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=in.next().split("-");
		int date=Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int year=Integer.parseInt(s[2]);
		int[] daysinmonth=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year))
		{
		    daysinmonth[1]=29;
		}
		month--;
		int currday=daysinmonth[month];
		for(int i=1;i<=10;)
		{
		    date++;
		    if(date<=currday)
		    {
		        System.out.printf("%02d-%02d-%d",date,month+1,year);
		        System.out.println();
		        i++;
		    }
		    if(date>=currday)
		    {

		        date=0;
		        month++;
		        if(month==12)
		        {
		            month=0;
		            year++;
		        }

		    }
		}

	}
}
