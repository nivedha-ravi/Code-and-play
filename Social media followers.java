/*
Example Input/Output 1:
Input:
5
A->C
C<-M
V<-A
C->M
H->M
Output:
A 0
C 2
H 0
M 2
V 1
Explanation:
The user A has no followers. So the count is 0.
The user C has 2 followers M and A. So the count is 2.
The user H has no followers. So the count is 0.
The user M has 2 followers C and H. So the count is 2.
The user V has 1 follower A. So the count is 1.
Example Input/Output 2:
Input:
3
A<-B
C->A
C<-B
Output:
A 2
B 0
C 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char a[]=new char[n];
		char b[]=new char[n];
		char c[]=new char[n];
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    a[i]=s.charAt(0);
		    b[i]=s.charAt(1);
		    c[i]=s.charAt(3);
		}
		for(char ch='A';ch<='Z';ch++)
		{
		    int follower=0,p=0;
		    for(int j=0;j<a.length;j++)
		    {
		        if(ch==a[j])
		        {
		            if(b[j]=='<')
		            {
		                follower++;
		            }
		            p=1;
		        }
		        else if(ch==c[j])
		        {
		            if(b[j]=='-')
		            {
		                follower++;
		            }
		            p=1;
		        }
		    }
		    if(p==1)
		    {
		        System.out.println(ch+" "+follower);
		    }
		}

	}
}
