/*
Input: aepd Output: abcdeefghijklmnoppqrstuvwxyzabcd
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		for(int i=0;i<ch.length-1;i+=1)
		{
		    char c=ch[i];
		    while(true)
		    {
		        System.out.print(c);
		        if(c==ch[i+1])
		        {
		            break;
		        }
		        if(c=='z')
		        {
		            c='a'-1;
		        }
		        c++;
		    }

		}

	}
}
