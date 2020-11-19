/*
Input:
engineering
2
Output:
en 1
ng 2
gi 1
in 2
ne 1
ee 1
er 1
ri 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		String[] str=new String[s.length()];
		Set<String> a=new LinkedHashSet<>();
		int k=0;
		for(int i=0;i<s.length();i++)
		{
		    int num=i+n;
		    if(num>s.length())
		    {
		        break;
		    }
		    String st=s.substring(i,num);
		    a.add(st);
		    str[k++]=st;
		}
		ArrayList<String> b=new ArrayList<>(a);
		for(int i=0;i<b.size();i++)
		{
		    int count=0;
		   for(int j=0;j<k;j++)
		   {
		       if(str[j].equals(b.get(i)))
		       {
		           count++;
		       }
		   }
		   System.out.println(b.get(i)+" "+count);
		}

	}
}
