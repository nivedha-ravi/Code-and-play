/*
Input:
24
Output:
1 24 2 12 3 8 4 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int val;
		for(val=1;val*val<n;val++)//square root of value should be less than n value
		{
		    if(n%val==0)
		    {
		        System.out.printf("%d %d ",val,n/val);//smallest is val and the largest is n/val
		    }
		}
        if(val==n/val)// the value is equal to the n/val(sqrt)
        {
            System.out.print(val);
        }
	}
}
