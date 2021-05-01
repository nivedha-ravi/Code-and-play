/*
Input:
3 4
Output:
0 0 0 1 1 1 0 0 0 1 1 1
0 0 0 1 1 1 0 0 0 1 1 1
0 0 0 1 1 1 0 0 0 1 1 1
1 1 1 0 0 0 1 1 1 0 0 0
1 1 1 0 0 0 1 1 1 0 0 0
1 1 1 0 0 0 1 1 1 0 0 0
0 0 0 1 1 1 0 0 0 1 1 1
0 0 0 1 1 1 0 0 0 1 1 1
0 0 0 1 1 1 0 0 0 1 1 1
1 1 1 0 0 0 1 1 1 0 0 0
1 1 1 0 0 0 1 1 1 0 0 0
1 1 1 0 0 0 1 1 1 0 0 0
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		char ch='0';
		char c=ch;
		for(int i=1;i<=n;i++)
		{
		    for(int k=1;k<=m;k++,System.out.println())
		    {
    		    for(int j=1;j<=m*n;j++)
    		    {
    		        System.out.print(c+" ");
    		        if(j%m==0)
    		        {
    		            c=(c=='0')?'1':'0';
    		        }
    		    }
    		    c=ch;
		    }
		    ch=(ch=='0')?'1':'0';
		    c=ch;
		}

	}
}
