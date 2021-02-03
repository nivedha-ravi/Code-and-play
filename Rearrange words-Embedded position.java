/*
Input:
4on Keep1 ru3sh t2he
Output:
Keep the rush on
Explanation:
There are four words in the given string.
 4on Keep1 ru3sh t2he
 The word 4on is the 4th word.
 The word keep1 is the 1st word.
The word ru3sh is the 3rd word.
The word t2he is the 2nd word.
Hence the output is Keep the rush on
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a[]=in.nextLine().split(" ");
		String s[]=new String[a.length];
		int n[]=new int[s.length];
		for(int i=0;i<a.length;i++)
		{
		    String str="",str1="";
		    for(int j=0;j<a[i].length();j+=1)
		    {
		        if(Character.isDigit(a[i].charAt(j)))
		        {
		            str+=a[i].charAt(j);
		        }
		        else
		        {
		            str1+=a[i].charAt(j);
		        }
		    }
		    n[i]=Integer.parseInt(str);
		    s[i]=str1;

		}
		for(int i=0;i<a.length;i++)
		{
		    for(int j=i+1;j<a.length;j++)
		    {
		        if(n[i]>n[j])
		        {
		            int temp=n[i];
		            n[i]=n[j];
		            n[j]=temp;
		            String t=s[i];
		            s[i]=s[j];
		            s[j]=t;
		        }
		    }
		}
        for(int i=0;i<a.length;i++)
        {
            System.out.print(s[i]+" ");
        }
	}
}
