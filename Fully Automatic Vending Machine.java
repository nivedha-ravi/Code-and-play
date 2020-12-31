/*
A fully automatic vending machine can serve the range of products as follows.
Coffee:
1. Espresso Coffee
2. Cappuccino Coffee
3. Latte Coffee
Tea:
1. Plain Tea
2. Assam Tea
3. Ginger Tea
4. Cardamom Tea
5. Masala Tea
6. Lemon Tea
7. Green Tea
8. Organic Darjeeling Tea
Soups:
1. Hot and Sour Soup
2. Veg Corn Soup
3. Tomato Soup
4. Spicy Tomato Soup 
Beverages:
1. Hot Chocolate Drink
2. Badam Drink
3. Badam-Pista Drink
A customer has to enter two keys for the menu M and the sub-menu S.
The key for selecting the menu is as follows.
C or c - Coffee
T or t - Tea
S or s - Soup
B or b - Beverages
The second key is the product number.
The program must accept the values of M and S as the input.
The program must print the output based on the following conditions.
- If the customer has entered the right keys, the program must print the string value "Enjoy Your " followed by the chosen product name.
- Else the program must print the string value "Invalid Option!" as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=Character.toLowerCase(in.next().charAt(0));
		int prod=in.nextInt();
		String coffee[]=new String[]{"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
		String tea[]=new String[]{"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
		String soup[]=new String[]{"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
		String bev[]=new String[]{"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
		switch(ch)
		{
		    case 'c':
		        System.out.print((prod>3)?"Invalid Option!":"Enjoy Your "+coffee[prod-1]);
		        break;
		    case 't':
		        System.out.print((prod>8)?"Invalid Option!":"Enjoy Your "+tea[prod-1]);
		        break;
		    case 's':
		        System.out.print((prod>4)?"Invalid Option!":"Enjoy Your "+soup[prod-1]);
		        break;
		    case 'b':
		        System.out.print((prod>3)?"Invalid Option!":"Enjoy Your "+bev[prod-1]);
		        break;
		    default:
		        System.out.print("Invalid Option!");
		}


	}
}
