/*
Input:
4
10 20 15 10
8 15 12 6
Output:
6
Explanation:
The maximum capacity of the 4 tanks are given below.
10 20 15 10
Initially, the amount of water in the 4 tanks are given below.
8 15 12 6
After 1 hour of rain, the amount of water in the 4 tanks are given below. 9 16 13 7 (No overflow)
After 2 hours of rain, the amount of water in the 4 tanks are given below. 10 17 14 8 (No overflow)
After 3 hours of rain, the amount of water in the 4 tanks are given below. 10 18 15 9 (Total overflowed - 1 litre)
After 4 hours of rain, the amount of water in the 4 tanks are given below. 10 19 15 10 (Total overflowed - 3 litres)
After 5 hours of rain, the amount of water in the 4 tanks are given below. 10 20 15 10 (Total overflowed - 6 litres)
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max[]=new int[n];
		int initial[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    max[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    initial[i]=in.nextInt();
		}
		int extra=0;
		for(;;)
		{
		    int f=0;
		    for(int i=0;i<n;i++)
		    {
		        if(max[i]>initial[i])
		        {
		            f=1;
		        }
		    }
		    if(f==0)
		    {
		        break;
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(max[i]>initial[i])
		        {
		            initial[i]++;
		        }
		        else
		        {
		            extra++;
		        }
		    }
		}
		System.out.print(extra);

	}
}
