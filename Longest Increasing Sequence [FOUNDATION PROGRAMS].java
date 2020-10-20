/*
The program must accept N integers as the input. The program must print the longest contiguous increasing sequence in the given N integers as the output. If there are two or more longest contiguous increasing sequences, the program must print the first occurring longest contiguous increasing sequence as the output.
Input:
8
3 4 6 7 8 9 1 2
Output:
6 7 8 9
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int start=0,end=0,currlen=1,maxlen=1,currstart=0,i;
		for(i=1;i<n;i++)
		{
		    if(a[i]==a[i-1]+1)
		    {
		        currlen++;
		    }
		    else
		    {
		        if(currlen>maxlen)
		        {
		            maxlen=currlen;
		            start=currstart;
		            end=i-1;
		        }
		        currlen=1;
		        currstart=i;
		    }
		}
		if(currlen>maxlen)
		{
		    maxlen=currlen;
		    start=currstart;
		    end=i-1;
		}
        for(i=start;i<=end;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
