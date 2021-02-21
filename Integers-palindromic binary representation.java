/*
Input:
5 5 8 45 27 32
Output:
5 45 27
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int printed=0;
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    StringBuilder sb=new StringBuilder(Integer.toBinaryString(num));
		    if(sb.toString().equals(sb.reverse().toString()))
		    {
		        System.out.print(num+" ");
		        printed++;
		    }
		}
		if(printed==0)
		{
		    System.out.print("-1");
		}

	}
}
