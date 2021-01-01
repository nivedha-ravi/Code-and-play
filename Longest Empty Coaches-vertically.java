/*
Input:
10 7
1 1 1 1 1 0 0
0 0 0 1 1 1 1
1 1 1 0 1 1 0
1 1 0 1 1 0 1
0 0 0 0 0 0 0
1 0 1 1 0 1 0
0 0 1 0 1 1 1
1 0 0 0 0 0 0
1 1 0 1 0 0 0
1 1 0 1 0 0 1
Output:
6
Explanation:
The longest empty coaches in the train are highlighted below.
1 1 1 1 1 0 0
0 0 0 1 1 1 1
1 1 1 0 1 1 0
1 1 0 1 1 0 1
0 0 0 0 0 0 0
1 0 1 1 0 1 0
0 0 1 0 1 1 1
1 0 0 0 0 0 0
1 1 0 1 0 0 0
1 1 0 1 0 0 1
Here the length is 6 which is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char a[][]=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		    }
		}
		char[] s=new char[r*c];
		int l=0;
		for(int i=0;i<c;i++)
		{
		    for(int j=0;j<r;j++)
		    {
		        if(i%2==0)
		        {
		        s[l++]=a[j][i];
		        }
		        else
		        {
		            s[l++]=a[r-j-1][i];
		        }
		    }

		}
		int maxlen=0;
		for(int i=0;i<l;i++)
		{
		    if(s[i]==0)
		    {
		        int count=0;
		        for(int j=i;j<l-1;j++)
		        {
		            if(s[j]==s[j+1])
		            {
		                count++;
		            }
		            else
		            {
		                i=j;
		                break;
		            }
		        }
		        count++;
		        if(count>maxlen)
		        {
		            maxlen=count;
		        }
		    }
		}
		System.out.print(maxlen);
	}
}
