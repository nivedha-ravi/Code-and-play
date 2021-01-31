/*
Input:
3
This is alpha 89830 beta 90 and gamma 901
I am 12 years old
Hii everyone
Output:
90
12
-1
Explanation:
There are 3 integers in the 1st string 89830, 90 and 901. So the smallest integer 90 is printed in the 1st line. There is only 1 integer in the 2nd string 12. So the integer 12 is printed in the 2nd line. 
There is no integer in the 3rd string. So -1 is printed in the 3rd line.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
	    for(int i=0;i<n;i++)
	    {
	        String[] s=in.nextLine().split(" ");
	        int min=Integer.MAX_VALUE;
	        for(int j=0;j<s.length;j++)
	        {
	            if(Character.isDigit(s[j].charAt(0)))
	            {
	                if(Integer.parseInt(s[j])<min)
	                {
	                    min=Integer.parseInt(s[j]);
	                }
	            }
	        }
	        System.out.println((min==Integer.MAX_VALUE)?"-1":min);
	    }
	}
}
