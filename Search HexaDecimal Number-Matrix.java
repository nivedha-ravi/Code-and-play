/*
Input:
4 5
F 3 E B 2
A 1 5 F 9
7 A 2 4 8
5 2 D D 6
45
Output:
YES
Explanation:
The hexadecimal value of 45 is 2D. In the given 4x5 matrix, the hexadecimal value of 45 is present horizontally in the 4th row of the matrix.
F 3 E B 2
A 1 5 F 9
7 A 2 4 8
5 2 D D 6
So YES is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		String s[]=new String[r];
		for(int i=0;i<r;i++)
		{
		    String str="";
		    for(int j=0;j<c;j++)
		    {
		        str+=Character.toLowerCase(in.next().charAt(0));
		    }
		    s[i]=str;

		}
		String hex=Long.toHexString(in.nextLong());
		for(int i=0;i<r;i++)
		{
		   if(s[i].contains(hex))
		   {
		       System.out.print("YES");
		       System.exit(1);
		   }
		}
		System.out.print("NO");



	}
}
