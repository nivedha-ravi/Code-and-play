/*
There is a water tank with the maximum capacity of X litres and a bucket with the maximum capacity of Y litres. A boy wants to fill greater than or equal to 80% of the water tank with the water using the bucket. The amount of water taken at a time in the bucket is not fixed as it can be any value less than or equal to Y. The program must accept the values of X, Y and a list of integers representing the amount of water taken in the buckets to fill the water tank. The program must print the number of buckets B poured into the water tank to reach greater than or equal to 80% of water. If it is not possible to fill 80% of the water tank, the program must print the string value "TANK NOT FULL" as the output.
Input:
100
20
20
15
10
20
20
20
Output:
5
Explanation:
Here the maximum capacity of a tank is 100 litres and the maximum capacity of a bucket is 20 litres.
The amount of water taken in the buckets to fill the water tank are 20, 15, 10, 20, 20 and 20.
After pouring the first 5 buckets of water into the tank.
The tank contains 85 (20+15+10+20+20) litres of water which is greater than 80% of its capacity.
Hence the output is 5.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int percent=(80*x)/100;
		int count=0,sum=0;
		for(;;)
		{
		    int num=in.nextInt();
		    if(sum>=percent)
		    {
		        System.out.print(count);
		        System.exit(1);
		    }
		    if(num<=y)
		    {
		        sum+=num;
		        count++;
		    }
		    if(!in.hasNextInt())
		    {
		        break;
		    }
		}
		System.out.print((sum>=percent)?count:"TANK NOT FULL");

	}
}
