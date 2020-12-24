
/*
Example Input/Output 1:
Input: 46
Output: 4
Explanation:
Here N = 46.
One of the possible ways to form the integer 46 by adding the integers present in the Fibonacci series is given below.
1 + 3 + 8 + 34 = 46.
The minimum number of integers required to form 46 is 4.
So 4 is printed as the output.
Example Input/Output 2:
Input: 100
Output: 3
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
long long int a[100001],n,i,j=1,k,x=0,count=0;
scanf("%lld",&n);
a[0]=0,a[1]=1;
for(i=2;i<=n;i++)
{
    a[i]=a[i-1]+a[i-2];
    if(a[i]>n)
    {
        j=i;
        break;
    }
}
for(i=j-1;i>=0;i--)
{
    if((x+a[i])<=n)
    {
        x+=a[i];
        count++;
        //printf("%ld ",a[i]);
    }
    if(x==n)
    {
        break;
    }
}
printf("%lld",count);
}


import java.util.*;
public class Hello
{
    static List<Integer> al=new ArrayList<>();
    static void calculateTerms(int N)
    {
        int index=3,next=0;
        al.add(0);
        al.add(1);
        al.add(1);
        while(true)
        {
            next=al.get(index-1)+al.get(index-2);
            if(next>N)
            return;
            al.add(next);
            index++;
        }
    }
    static int findMinTerms(int N)
    {
        calculateTerms(N);
        int count=0,pos=al.size()-1;
        while(N>0)
        {
            count+=(N/al.get(pos));
            N%=(al.get(pos));
            pos--;
        }
        return count;
    }
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.print(findMinTerms(N));
	}
}
