/*
Input:
1 4 5 2 2 3 5 2 3 2 2 1 1
Output:
Agra
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String cities[]=new String[]{"Jaipur","Agra","Rishikesh","Goa","Mysore"};
		int a[]=new int[5];
		while(in.hasNextInt())
		{
		    a[in.nextInt()-1]++;
		}
		int max=0;
		for(int i=0;i<5;i++)
		{
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		}
		for(int i=0;i<5;i++)
		{
		    if(a[i]==max)
		    {
		        System.out.println(cities[i]);
		    }
		}

	}
}
