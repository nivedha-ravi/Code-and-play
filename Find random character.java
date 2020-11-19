/*
Input:
nelson
oneplsn
Output:
p
Explanation:
Here S = nelson and M = oneplsn. The randomly inserted character in M is p. So p is printed as the output
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ch1[]=in.next().split("");
		String ch2[]=in.next().split("");
		ArrayList<String> a=new ArrayList<>(Arrays.asList(ch1));
		ArrayList<String> b=new ArrayList<>(Arrays.asList(ch2));
		for(int i=0;i<b.size();i++)
		{
		    if(a.contains(b.get(i)))
		    {
		        a.remove(b.get(i));
		    }
		    else
		    {
		        System.out.print(b.get(i));
		        break;
		    }
		}


	}
}
