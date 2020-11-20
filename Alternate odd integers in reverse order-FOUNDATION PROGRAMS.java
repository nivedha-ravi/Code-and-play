/*
The program must accept N integers as the input. The program must print the odd integers skipping the alternate odd integers among the N integers in reverse order. Note: At least one odd integer is always present in the given N integers
Input:
10
2 43 12 35 49 1 84 8 21 62
Output:
21 49 43
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		boolean printed=true;;
		for(int i=n-1;i>=0;i--)
		{
		    if(a[i]%2!=0)
		    {
		        if(printed)
		        {
		            System.out.print(a[i]+" ");
		        }
		        printed=!printed;
		    }
		}

	}
}
