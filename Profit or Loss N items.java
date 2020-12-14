/*
Input:
6
84 77 72 58 23 25
Output:
Profit 1
Explanation:
The cost price of the 6 items are 84, 77, 72, 58, 23 and 25.
The selling price of the 6 items are 85, 75, 70, 60, 25 and 25.
The total cost price is 339. The total selling price is 340.
So the shopkeeper makes a profit of 1 rupee.
Hence the output is Profit 1
Example Input/Output 2:
Input:
3
152 96 100
Output:
Loss 3
Explanation:
The cost price of the 3 items are 152, 96 and 100.
The selling price of the 3 items are 150, 95 and 100.
The total cost price is 348. The total selling price is 345.
So the shopkeeper suffers a loss of 3 rupees.
Hence the output is Loss 3
Example Input/Output 3:
Input:
5
15 20 5 16 19
Output:
No Profit No Loss
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int cp=0,sp=0;
		for(int i=0;i<n;i++)
		{
		    int price=in.nextInt();
		    cp+=price;
		    if(price%5<=2)
		    {
		        price-=price%5;
		    }
		    else
		    {
		        price+=(5-price%5);
		    }
		    sp+=price;
		}
		int diff=sp-cp;
		if(diff==0)
		{
		    System.out.print("No Profit No Loss");
		}
		else if(diff>0)
		{
		    System.out.print("Profit "+diff);
		}
		else
		{
		    System.out.print("Loss "+(diff*-1));
		}
    }

}
