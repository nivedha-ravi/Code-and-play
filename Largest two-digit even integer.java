/*
Input:
147
Output:
74
Explanation:
Here N = 147, the possible two-digit integers are 14, 17, 41, 47, 71 and 74.
The largest two-digit even integer is 74. So 74 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+1;j<s.length();j++)
		    {
		       String str=s.charAt(i)+""+s.charAt(j);
		       if(Integer.parseInt(str)%2==0)
		       {
		           a.add(Integer.parseInt(str));

		       }
		    }
		}
		for(int i=s.length()-1;i>0;i--)
		{
		    for(int j=i-1;j>=0;j--)
		    {
		        String str=s.charAt(i)+""+s.charAt(j);
		        if(Integer.parseInt(str)%2==0)
		        {
		            a.add(Integer.parseInt(str));
		        }
		    }
		}
		Collections.sort(a);
		System.out.print(a.get(a.size()-1));


	}
}
