/*
Input:
environmentcareneeded
4 6
Output:
enviro
ctnemn
arenee
***ded
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int r=in.nextInt();
		int c=in.nextInt();
		int follow=0;
		for(int i=0;i<r;i++,System.out.println())
		{
		    StringBuilder sb=new StringBuilder();
		    for(int j=0;j<c;j++)
		    {
		        if(i%2==0)
		        {
		            if(follow>=ch.length)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(ch[follow++]);
		            }
		        }
		        else
		        {
		            if(follow>=ch.length)
		            {
		                sb.append('*');
		            }
		            else
		            {
		                sb.append(ch[follow++]);
		            }
		        }
		    }
		    if(i%2!=0)
		    {
		        System.out.print(sb.reverse().toString());
		    }

		}

	}
}
