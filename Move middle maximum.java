/*
Input:
7
88 3 49 40 80 9 99
4
Output:
49 88 3 9 80 40 99
Explanation:
Here N = 7 and T = 4.
For T = 1, 88 3 49 40 80 9 99 -> 88 3 49 40 9 99 80 (Moved to the end)
For T = 2, 88 3 49 40 9 99 80 -> 49 88 3 40 9 99 80 (Moved to the beginning)
For T = 3, 49 88 3 40 9 99 80 -> 49 88 3 9 99 80 40 (Moved to the end)
For T = 4, 49 88 3 9 99 80 40 -> 49 88 3 9 80 40 99 (Moved to the end)
*/
import java.util.*;
public class Hello {
    public static int maximum(int a[],int strt,int end)
    {
        int max=a[strt],ind=strt;
        for(int i=strt;i<=end;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                ind=i;
            }
        }
        return ind;
    }
    public static void movebeg(int a[],int index)
    {
        int val=a[index];
        for(int i=index;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=val;
    }
    public static void moveend(int a[],int index,int n)
    {
        int val=a[index];
        for(int i=index;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=val;
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int mid=n/2;
		int t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int maxind=maximum(a,mid-1,mid+1);
		    if(maxind==mid-1)
		    {
		        movebeg(a,mid-1);
		    }
		    else if(maxind==mid+1)
		    {
		        moveend(a,mid+1,n);
		    }
		    else if(maxind==mid)
		    {
		        if(a[0]>a[n-1])
		        {
		            movebeg(a,maxind);
		        }
		        else
		        {
		            moveend(a,maxind,n);
		        }
		    }
		}
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
