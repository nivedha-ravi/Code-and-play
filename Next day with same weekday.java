/*
Input:
11-08-2020
Output:
18-08-2020
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s[]=in.next().split("-");
		int date=Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int year=Integer.parseInt(s[2]);
		int[] days=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
		    days[1]=29;
		}
		int daysincurr=days[month-1];
		for(int i=0;i<7;i++)
		{
		    if(date+1<=daysincurr)
		    {
		        date++;
		    }
		    else
		    {
		        date=1;
		        month++;
		        if(month>12)
		        {
		            month=1;
		            year++;
		        }
		    }
		}
		System.out.printf("%02d-%02d-%d",date,month,year);


	}
}
