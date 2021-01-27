/*
Input:
5
ghi 1500
def 1200
abc 1500
jkl 1500
mno 1600
Output:
1600 mno
1500 abc, ghi, jkl
1200 def
Explanation:
The purchase amounts in descending order are 1600, 1500 and 1200.
There is only one customer who has purchased the items for 1600.
1600 mno
There are three customers who have purchased the items for 1500.
1500 abc, ghi, jkl
There is only one customer who has purchased the items for 1200.
1200 def
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    String[] s=new String[n];
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        s[i]=in.next();
	        a[i]=in.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]<a[j])
	            {
	                int temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	                String str=s[i];
	                s[i]=s[j];
	                s[j]=str;
	            }
	            else if(a[i]==a[j])
	            {
	               if(s[i].compareTo(s[j])>0)
	               {
	                   String str=s[i];
	                   s[i]=s[j];
	                   s[j]=str;
	               }
	            }
	        }
	    }
	    for(int i=0;i<n;i++,System.out.println())
	    {
	        System.out.print(a[i]+" "+s[i]);
	        int flag=0,j=0;
	        for(j=i+1;j<n;j++)
	        {
	            if(a[i]==a[j])
	            {
	                System.out.print(", "+s[j]);
	            }
	            else
	            {
	                i=j-1;
	                flag=1;
	                break;
	            }
	        }
	        if(flag==0)
	        {
	            break;
	        }
	    }

	}
}
