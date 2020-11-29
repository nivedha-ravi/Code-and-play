/*
The program must accept an integer representing the weight of the clothes to be washed in a washing machine.
There are 3 water levels in the washing mechanism which are given below.
- Low Water Level: The estimated time is 25 minutes, where the approximate weight is between 1 gram to 2000 grams (both inclusive).
- Medium Water Level: The estimated time is 35 minutes, where the approximate weight is between 2001 grams and 4000 grams (both inclusive).
- High Water Level: The estimated time is 45 minutes, where the approximate weight is above 4000 grams.
The maximum capacity of the machine is 7000 grams.
The program must print the estimated time for the given weight of clothes W as the output.
If the weight is more than 7000 grams, the program must print the string value "OVERLOADED" as the output.
If the weight is 0, the program must print 0 as the output. For all other values of W, the program must print "INVALID INPUT" as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int level=in.nextInt();
        if(level>=1 && level<=2000)
        {
            System.out.print("25");
        }
        else if(level>2000 && level<=4000)
        {
            System.out.print("35");
        }
        else if(level>4000 && level<=7000)
        {
            System.out.print("45");
        }
        else if(level>7000)
        {
            System.out.print("OVERLOADED");
        }
        else if(level==0)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("INVALID INPUT");
        }

	}
}
