/*
The program must accept the names of the colors in an LED serial set as the input. The program must find the number of groups of LEDs having the same color at the beginning and the end in the given LED serial set. Also consider each LED in the given LED serial set as a group. Finally, the program must print the number of groups of LEDs as the output.
Input:
Yellow Red Yellow Green Blue Yellow Green
Output:
11
Explanation:
The 11 groups of LEDs are given below.
Yellow
Red
Yellow
Green
Blue
Yellow
Green
Yellow Red Yellow
Yellow Red Yellow Green Blue Yellow
Yellow Green Blue Yellow
Green Blue Yellow Green
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=in.nextLine().split(" ");
		int count=s.length;
		for(int i=0;i<s.length;i++)
		{
		    for(int j=i+1;j<s.length;j++)
		    {
		        if(s[i].equals(s[j]))
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);


	}
}
