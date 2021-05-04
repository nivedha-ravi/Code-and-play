/*
Input:
4 5
u l y j m
j m d e f
u o i k n
w t p x y
3
Output:
YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char[][] a=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		    }
		}
		int k=in.nextInt();
		for(int i=0;i<=r-k;i++)
		{
		    for(int j=0;j<=c-k;j++)
		    {
                char[] p=new char[k*k];
		        int o=0,flag=0;;
		        for(int l=i;l<i+k;l++)
		        {
		            for(int m=j;m<j+k;m++)
		            {
		                p[o++]=a[l][m];
		            }

		        }
		        for(int l=0;l<o-1;l++)
		        {
		            if(p[l]>p[l+1])
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		        {
		            System.out.print("YES");
		            System.exit(1);
		        }
		    }
		}
        System.out.print("NO");
	}
}
