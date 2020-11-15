import java.util.*;
public class Hello {
    public static int countUpper(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] s=new String[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    s[i]=in.next();
		    a[i]=countUpper(s[i]);
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-1;j++)
		    {
		        if(a[j]<a[j+1])
		        {
		            int temp=a[j];
		            a[j]=a[j+1];
		            a[j+1]=temp;
		            String temp1=s[j];
		            s[j]=s[j+1];
		            s[j+1]=temp1;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(s[i]);
		}

	}
}
