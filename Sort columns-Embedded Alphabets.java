/*
Input:
4 3
9c7 5s2 p661
690d 7k9 q41
a38 3i75 67p
8b0 90m 5p74
Output:
480
733
848
783
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		char cr[][]=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        String str=in.next();
		        String s="";
		        for(int k=0;k<str.length();k++)
		        {
		            if(Character.isDigit(str.charAt(k)))
		            {
		                s+=str.charAt(k);
		            }
		            else
		            {
		                cr[i][j]=str.charAt(k);
		            }
		        }
		        a[i][j]=Integer.parseInt(s);
		    }
		}
		for(int i=0;i<c;i++)
		{
		    for(int k=0;k<r;k++)
		    {
		        for(int l=k+1;l<r;l++)
		        {
		            if(cr[k][i]>cr[l][i])
		            {
		                char ch=cr[k][i];
		                cr[k][i]=cr[l][i];
		                cr[l][i]=ch;
		                int temp=a[k][i];
		                a[k][i]=a[l][i];
		                a[l][i]=temp;
		            }
		            else if(cr[k][i]==cr[l][i])
		            {
		                if(a[k][i]>a[l][i])
		                {
		                    int temp=a[k][i];
		                    a[k][i]=a[l][i];
		                    a[l][i]=temp;
		                }
		            }
		        }
		    }

		}
		for(int i=0;i<r;i++)
		{
		    int sum=0;
		    for(int j=0;j<c;j++)
		    {
		        sum+=a[i][j];
		    }
		    System.out.println(sum);
		}

	}
}
