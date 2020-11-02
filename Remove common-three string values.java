/*
Input:
cloud
lab
clab
Output:
oudl
Explanation: After removing the common characters in S1 and S3, the string values become S1 = "oud" S3 = "ab" After removing the common characters in S2 and S3, the string values become S2 = "l" S3 = "" The remaining characters in S1 and S2 are o, u, d and l.
So they are printed as the output
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    char[] s1=in.next().toCharArray();
		char[] s2=in.next().toCharArray();
		char[] s3=in.next().toCharArray();
		for(int i=0;i<s1.length;i++)
		{
		    for(int j=0;j<s3.length;j++)
		    {
		        if(s1[i]==s3[j])
		        {
		            s1[i]='\0';
		            s3[j]='\0';
		        }
		    }
		}
		for(int i=0;i<s2.length;i++)
		{
		    for(int j=0;j<s3.length;j++)
		    {
		        if(s2[i]==s3[j])
		        {
		            s2[i]='\0';
		            s3[j]='\0';
		        }
		    }
		}
		for(int i=0;i<s1.length;i++)
		{
		    if(s1[i]!='\0')
		    {
		        System.out.print(s1[i]);
		    }
		}
		for(int i=0;i<s2.length;i++)
		{
		    if(s2[i]!='\0')
		    {
		        System.out.print(s2[i]);
		    }
		}


	}
}
