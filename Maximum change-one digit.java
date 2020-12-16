/*
Input:
5225
Output:
30525625
Explanation:
The four possible combinations are given below. 2225, 5525, 5255 and 5222.
The maximum value M is 5525 which is obtained by replacing the 2nd digit 2 with 5. The square of 5525 is 30525625.
So 30525625 is printed as the output.
*/
//Optimised code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch[]=in.next().toCharArray();
		Long max=Long.parseLong(new String(ch));
		for(int i=0;i<ch.length;i++)
		{
		    ch[i]=(ch[i]=='2')?'5':'2';
		    Long num=Long.parseLong(new String(ch));
		    if(num>max)
		    {
		        max=num;
		    }
		    ch[i]=(ch[i]=='2')?'5':'2';

		}
		System.out.print(max*max);

	}
}

//Normal code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch[]=in.next().toCharArray();
		ArrayList<Long> a=new ArrayList<Long>();
		a.add(Long.parseLong(new String(ch)));
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='2')
		    {
		        ch[i]='5';
		        a.add(Long.parseLong(new String(ch)));
		        ch[i]='2';
		    }
		    else if(ch[i]=='5')
		    {
		        ch[i]='2';
		        a.add(Long.parseLong(new String(ch)));
		        ch[i]='5';
		    }

		}
		Collections.sort(a);
		System.out.print(a.get(a.size()-1)*a.get(a.size()-1));

	}
}
