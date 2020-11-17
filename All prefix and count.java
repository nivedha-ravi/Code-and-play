/*
Input:
11
honey
danger
dangling
ball
honour
donkey
strong
state
honda
honesty
stroke
Output:
bal 1
dan 2
don 1
hon 4
sta 1
str 2
Explanation: All possible suffixes in sorted are bal, dan, don, hon, sta and str. The string ball has the suffix bal. The string values danger and dangling have the suffix dan. The string donkey has the suffix don. The string values honey, honour, honda and honesty have the suffix hon. The string state has the suffix sta. The string values strong and stroke have the suffix str. Hence the output is bal 1 dan 2 don 1 hon 4 sta 1 str 2
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Set<String> a=new HashSet<String>();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    a.add(s.substring(0,3));
		    str[i]=s;
		}
		ArrayList<String> b=new ArrayList<>(a);
		Collections.sort(b);
		for(int i=0;i<b.size();i++)
		{
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        if(str[j].substring(0,3).equals(b.get(i)))
		        {
		            count++;
		        }
		    }
		    System.out.println(b.get(i)+" "+count);
		}

	}
}
