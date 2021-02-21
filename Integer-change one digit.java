/*
Input:
1234 2
Output:
1034 1134 1234 1334 1434 1534 1634 1734 1834 1934
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
		int k=in.nextInt();
		for(char i='0';i<='9';i++)
		{
		   s[k-1]=i;
		   System.out.print(Integer.parseInt(new String(s))+" ");
		}

	}
}
