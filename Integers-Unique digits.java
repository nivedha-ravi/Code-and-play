/*
 Example Input/Output 1:
 Input:
 7
 12 5 98 54 71 44 123
 Output:
 12 5 98
 54 71
 123
 Explanation:
 The given 7 integers are 12, 5, 98, 54, 71, 44 and 123.
 In the first 3 integers, the digits have not occurred more than once. [12, 5, 98] In the next two integers, the digits have not occurred more than once.
 [54, 71] In the 6th integer 44, the digit 4 has repeated. So it is not printed.
 In the last integer, the digits have not occurred more than once. [123] Hence the output is 12 5 98 54 71 123
 Example Input/Output 2:
 Input:
 10
 28 57 49 89 81 91 60 46 66 77
 Output:
 28 57 49
 89
 81
 91 60
 46
 Example Input/Output 3:
 Input:
 4
 202 115 66 4124
 Output:
 -1
 */
import java.util.*;
public class Hello {
    public static boolean hasRepeatedDigit(int n)
    {
        int a[]=new int[100];
        while(n>0)
        {
            a[n%10]++;
            n/=10;
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]>1)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean hasCommonDigit(int a,int b)
    {
        int[] freq=new int[10];
        while(a>0)
        {
            freq[a%10]++;
            a/=10;
        }
        while(b>0)
        {
            if(freq[b%10]!=0)
            {
                return true;
            }
            b/=10;
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		   a[i]=in.nextInt();
		}
		int pos=0,linebreak=0,printed=0;
		for(int i=0;i<n;i++)
		{
		    if(!hasRepeatedDigit(a[i]))
		    {
		        for(int j=i-1;j>=pos;j--)
		        {
		            if(hasCommonDigit(a[i],a[j]))
		            {
		                System.out.println();
		                pos=i;
		            }
		        }

		        if(printed==1)
		        {
		            if(linebreak==1)
		            {
		                System.out.println();
		            }
		        }
		            System.out.print(a[i]+" ");
		            linebreak=0;
		              printed=1;
		    }
		    else
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(!hasRepeatedDigit(a[j]))
		            {
		                i=j-1;
		                pos=j;
		                linebreak=1;
		                break;
		            }
		        }
		    }

		}
        if(printed==0)
        {
            System.out.print("-1");
        }
	}
}
