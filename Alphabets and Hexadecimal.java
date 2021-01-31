/*
Input:
6671
Output:
LAOF
Explanation:
The hexadecimal representation of 6671 is 1A0F.
After replacing 0 with O and 1 with L, the value of H becomes LAOF. Here LAOF contains only alphabets, so it is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] hex=Integer.toHexString(in.nextInt()).toUpperCase().toCharArray();
		for(int i=0;i<hex.length;i++)
		{
		    if(hex[i]=='0'||hex[i]=='1')
		    {
		        hex[i]=(hex[i]=='0')?'O':'L';
		    }
		    char ch=hex[i];
		    if(!(ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='O'||ch=='L'))
		    {
		        System.out.print("-1");
		        System.exit(1);
		    }
		}
		System.out.print(new String(hex));

	}
}
