/*
Input:
4
2 7 10 3
Output:
0010 0111 1010 0011
Explanation:
Here N = 4 and the four integers are 2, 7, 10 and 3.
The largest integer is 10 whose binary representation is 1010. The number of bits in 1010 is 4. For the 1st integer 2, two zeroes are padded. So 0010 is printed. For the 2nd integer 7, one zero is padded. So 0111 is printed. For the 3rd integer 10, no zeroes are padded.
So 1010 is printed. For the 4th integer 3, two zeroes are padded. So 0011 is printed.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int largelen=0;
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
		    s[i]=Integer.toBinaryString(in.nextInt());
		    if(s[i].length()>largelen)
		    {
		        largelen=s[i].length();
		    }
		}
		for(int i=0;i<n;i++)
		{
		        System.out.print("0".repeat(largelen-s[i].length())+""+s[i]+" ");
		}

	}
}
