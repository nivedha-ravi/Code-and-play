/*
Input:
skillrack
Output:
bdefghjmnopqtuvwxyz
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch='a';
		while(ch<='z')
		{
		    if(s.indexOf(ch)==-1)
		    {
		        System.out.print(ch);
		    }
		    ch++;
		}

	}
}
