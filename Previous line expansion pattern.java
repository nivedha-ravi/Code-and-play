/*
Input:
3
Output:
A
ABA
ABACABA
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char ch='A';
		System.out.println(ch++);
		String prev="A";
		for(int i=1;i<n;i++,System.out.println())
		{
		    System.out.print(prev+ch+prev);
		    prev=prev+ch+prev;
		    ch++;
		}
	}
}
