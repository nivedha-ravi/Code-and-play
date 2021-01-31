/*
Input:
4
doc2.txt
profile.png
doc1.txt doc2.docx
N
Output:
doc1.txt
doc2.txt
doc2.docx
profile.png
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    s[i]=sc.nextLine();
		}
		char ch=sc.next().charAt(0);
		String s1[]=new String[n];
		String s2[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    String a="";
		    String b="";
		    char CH[]=s[i].toCharArray();
		    int t=0;
		    for(int j=0;j<CH.length;j++)
		    {
		        if(CH[j]=='.')
		        t++;
		        if(CH[j]=='.')
		        continue;
		        if(t==0)
		        a=a+CH[j];
		        else
		        b=b+CH[j];
		    }
		    s1[i]=a;
		    s2[i]=b;
		}
		if(ch=='N' || ch=='n')
		{
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n-1;j++)
		        {
		            if(s1[j+1].compareTo(s1[j])<0)
		            {
		                String temp1=s1[j+1];
		                s1[j+1]=s1[j];
		                s1[j]=temp1;
		                String temp2=s2[j+1];
		                s2[j+1]=s2[j];
		                s2[j]=temp2;
		            }
		        }
		    }
		}
		else if(ch=='e' || ch=='E')
		{
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n-1;j++)
		        {
		            if(s2[j+1].compareTo(s2[j])<0)
		            {
		                String temp1=s1[j+1];
		                s1[j+1]=s1[j];
		                s1[j]=temp1;
		                String temp2=s2[j+1];
		                s2[j+1]=s2[j];
		                s2[j]=temp2;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(s1[i]+"."+s2[i]);
		}


	}
}
