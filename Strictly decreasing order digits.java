/*
Input:
8 250
Output:
210 98 87 76 65 54 43 32 21 10
*/
import java.util.*;
public class Hello {
    public static boolean isStrictlyDecreasing(int n)
    {
        while(n>10)
        {
            if((n%10)+1!=(n/10)%10)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int flag=0;
		while(y>=x)
		{

		    if(isStrictlyDecreasing(y) && y>=10)
		    {
		        System.out.print(y+" ");
		        flag=1;
		    }
		    y--;
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}

	}
}
