/*
Input:
sckms
kapa-
irrr-
llog-
Output:
skillrackprograms
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[][] a=new char[100][100];
		int ax=0,ay=0;
		while(in.hasNext())
		{
		    String s=in.next();
		    for(ay=0;ay<s.length();ay++)
		    {
		        a[ax][ay]=s.charAt(ay);
		    }
		    ax++;
		}
	    for(int j=0;j<ay;j++)
	    {
	        if(j%2==0)
	        {
	            for(int i=0;i<ax;i++)
	            {
	                if(a[i][j]!='-')
	                {
	                    System.out.print(a[i][j]);
	                }
	            }
	        }
	        else
	        {
	            for(int i=ax-1;i>=0;i--)
	            {
	                if(a[i][j]!='-')
	                {
	                    System.out.print(a[i][j]);
	                }
	            }
	        }
	    }


	}
}
