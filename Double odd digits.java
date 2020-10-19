/*
Input:
9765432
Output:
1814748
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    char[] ch=in.next().toCharArray();
	    String even="",odd="";
	    int flag=0,flag1=0;
	    for(int i=0;i<ch.length;i++)
	    {
	        if((int)(ch[i])%2==0)
	        {
	            even+=ch[i];
	            flag=1;
	        }
	        else
	        {
	            int num=ch[i]-'0';
	            num*=2;
	            odd+=num;
	            flag1=1;
	        }
	    }
	    if(flag==0)
	    {
	        System.out.print(Long.parseLong(odd));
	    }
	    else if(flag1==0)
	    {
	        System.out.print(Long.parseLong(even));
	    }
	    else
	    {
	        System.out.print(Long.parseLong(odd)+Long.parseLong(even));
	    }


	}
}
