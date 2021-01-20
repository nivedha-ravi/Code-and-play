/*
Input:
25 4
Output:
Y
Y Z
Y Z A
Y Z A B
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int r=in.nextInt();
		for(int i=0;i<r;i++,System.out.println())
		{
		    char ch=(char)(n+64);
		    for(int j=0;j<=i;j++)
		    {
		        if(ch=='Z')
		        {
		            System.out.print(ch+" ");
		            ch='A';
		        }
		        else
		        {
		            System.out.print(ch+" ");
		            ch++;
		        }
		    }
		}

	}
}
