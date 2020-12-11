/*
There is a chocolate vending machine which contains at most N chocolates.
The chocolate vending machine is never remaining empty as when last K chocolates are left, the machine is refilled with new chocolates in such a way that the machine gets full.
There are C customers numbered from 1 to C who want to buy some chocolates from the machine. The program must accept the values of N, K and C integers representing the number of chocolates that the C customers want to buy as the input. After processing each customer's request, the program must print the output based on the following conditions.
- The program must print the string value "Customer: " followed by the customer's number.
- If it is possible to sell the chocolates to a customer's request, the program must print the string value "Number of chocolates sold: " followed by the number of chocolates sold to the customer. Then the program must print the string value "Number of chocolates available: " followed by the number of chocolates remaining in the machine after the purchase.
- Else the program must print the string value "Invalid" as the output.

Input:
10 5
4
3 8 5 6
Output:
Customer: 1
Number of chocolates sold: 3
Number of chocolates available: 7
Customer: 2
Invalid
Customer: 3
Number of chocolates sold: 5
Number of chocolates available: 10
Customer: 4
Number of chocolates sold: 6
Number of chocolates available: 10
Explanation:
Here N=10 and K=5.
Initially the number of chocolates available in the vending machine is 10.
The customer 1 wants to buy 3 chocolates. It is possible to sell 3 chocolates. Now the number of chocolates sold is 3 and the number of chocolates remaining is 7.
The customer 2 wants to buy 8 chocolates. It is not possible to sell 8 chocolates because the vending machine has only 7 chocolates.
The customer 3 wants to buy 5 chocolates. It is possible to sell 5 chocolates. Now the number of chocolates sold is 5 and the number of chocolates remaining is 2 which is less than K. So the machine is refilled with new chocolates (now the machine has 10 chocolates).
The customer 4 wants to buy 6 chocolates. It is possible to sell 6 chocolates. Now the number of chocolates sold is 6 and the number of chocolates remaining is 4 which is less than K. So the machine is refilled with new chocolates (now the machine has 10 chocolates).
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int c=in.nextInt();
		int count=1,noofchocoavail=n;
		while(count<=c)
		{
		    System.out.println("Customer: "+count);
		    int noofchocosold=in.nextInt();
		    if(noofchocosold>noofchocoavail)
		    {
		        System.out.println("Invalid");
		    }
		    else
		    {
		        noofchocoavail=noofchocoavail-noofchocosold;
		        System.out.println("Number of chocolates sold: "+noofchocosold);
		        if(noofchocoavail<=k)
		        {
		            noofchocoavail=n;
		        }
		        System.out.println("Number of chocolates available: "+noofchocoavail);

		    }
		    count++;
		}

	}
}
