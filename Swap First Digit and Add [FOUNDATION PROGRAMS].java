/*
Input:
598 1024
Output:
5222
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s1=in.next().toCharArray();
		char[] s2=in.next().toCharArray();
		char temp=s1[0];
		s1[0]=s2[0];
		s2[0]=temp;
		System.out.print(Integer.parseInt(new String(s1))+Integer.parseInt(new String(s2)));

	}
}
