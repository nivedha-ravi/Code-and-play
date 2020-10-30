/*
Input:
a
Good
Alice is a Good girl she is a Good student
Output:
girl student
Explanation: Here W1 = a and W2 = Good.
The words that occur immediately after W1 and W2 in the string S are girl and student. Hence the output is girl student
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String w1=in.next();
		String w2=in.next();
		in.nextLine();
		String[] s=in.nextLine().split(" ");
		int flag=0;
		for(int i=0;i<s.length-1;i++)
		{
		    if(s[i].equals(w1) && s[i+1].equals(w2))
		    {
		        if((i+2)!=s.length)
		        {
		            flag=1;
		            System.out.print(s[i+2]+" ");
		        }
		    }
		}
		if(flag==0)
		{
		   System.out.print("-1");
		}

	}
}
