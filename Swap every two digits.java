/*
Input:
27521 7809
Output:
81041
Explanation:
After swapping every two digits in X, it becomes 72251.
After swapping every two digits in Y, it becomes 8790.
The sum of 72251 and 8790 is 81041.
So 81041 is printed as the output.
*/
import java.util.*;
public class Hello {
    public static int everytwoswap(char[] a)
    {
        for(int i=0;i<a.length;i+=2)
        {
            if(a.length%2!=0 && i==a.length-1)
            {
                break;
            }
            char temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;

        }
        return Integer.parseInt(new String(a));
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] c=in.next().toCharArray();
		char[] ch=in.next().toCharArray();
		System.out.print(everytwoswap(c)+everytwoswap(ch));


	}
}
