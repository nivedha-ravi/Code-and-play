/*
INPUT:
322
OUTPUT:
299
INPUT:
1000
OUTPUT:
99
*/
import java.util.*;
public class Hello {
    public static boolean isascending(int n)
    {
        while(n>10)
        {
            if(n%10<(n/10)%10)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%100==0)
		{
		    System.out.print(n-1);
		}
		else
		{
		    for(;;n--)
		    {
		        if(isascending(n))
		        {
		            System.out.print(n);
		            break;
		        }
		    }
		}


	}
}
