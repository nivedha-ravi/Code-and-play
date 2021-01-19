/*
In a lodge, there is a bunch of room keys having key number stamped on each key. There may be few duplicate keys in the bunch (i.e., more than one key with the same number). A room can be opened with a key which must have the room's number. There is a rare chance of blank keys (-) which are the keys without numbers, and no room can be opened with those keys. The program must accept the list of key numbers available in the bunch as the input. The character q or Q in the input represents the end of the key numbers list. The program must print the output based on the following conditions. - The program must print the string value "Blank Keys: " followed by the number of blank keys in the bunch. - Then the program must print the string value "Total Keys: " followed by the total number of keys available in the bunch. - Finally, the program must print the string value "Number of rooms: " followed by the total number of rooms available in the lodge as the output
Input:
A101
A103
A102
B202
-
A102
A101
B201
B203
-
B203
Q
Output:
Blank Keys: 2
Total Keys: 11
Number of rooms: 6
Explanation:
The number of blank keys in the list of key numbers is 2. So Blank Keys: 2 is printed.
There are 9 numbered keys and 2 blank keys, the total number of keys in the bunch is 11. So Total Keys: 11 is printed.
The number of unique key numbers in the list is 6.
So Number of rooms: 6 is printed.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Set<String> unique=new HashSet<String>();
		ArrayList<String> keys=new ArrayList<String>();
		int blank=0;
		String s="";
		do
		{
		    s=in.next();
		    if(s.equals("-"))
		    {
		        blank++;
		    }
		    else if(!(s.equalsIgnoreCase("q")))
		    {
		        unique.add(s);
		        keys.add(s);
		    }
		}while(!(s.equalsIgnoreCase("q")));
		System.out.print("Blank Keys: "+blank+"\nTotal Keys: "+(blank+keys.size())+"\nNumber of rooms: "+unique.size());

	}
}
