import java.util.*;
import java.util.Map.Entry;
public class Hello {
    public static int getLowerCaseCount(String str)
    {
        int count=0;
        for(int index=0;index<str.length();index++)
        {
            if(Character.isLowerCase(str.charAt(index)))
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		List<String> list=new LinkedList<>();
		scanner.nextLine();
		for(int index=0;index<N;index++)
		{
		    list.add(scanner.nextLine().trim());
		}
		Collections.sort(list,(o1,o2)->getLowerCaseCount(o1)- getLowerCaseCount(o2));
		for(String str:list)
		System.out.println(str);
	}
}


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j,len,count,tem;
    scanf("%d",&n);
    char a[n][101],temp[101];
    int low[n];
    for(i=0;i<n;i++)
        scanf("%s",a[i]);
    for(i=0;i<n;i++)
    {
        len=strlen(a[i]);
        count=0;
        for(j=0;j<len;j++)
        {
            if(a[i][j]>=97 && a[i][j]<=122)
                count++;
        }
        low[i]=count;
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-1;j++)
        {
            if(low[j]>low[j+1])
            {
                tem=low[j];
                low[j]=low[j+1];
                low[j+1]=tem;

                strcpy(temp,a[j]);
                strcpy(a[j],a[j+1]);
                strcpy(a[j+1],temp);
            }
        }
    }
    for(i=0;i<n;i++)
        printf("%s \n",a[i]);
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0;i<n;i++)
		{
		    s[i] = sc.next();
		}
		Comparator<String> comp = new Comparator<String>()
		{
		    @Override
		    public int compare(String s1,String s2)
		    {
		        int c1 = 0,c2 = 0;
		        for(int i=0;i<s1.length();i++)
		        {
		            if(Character.isLowerCase(s1.charAt(i))) c1++;
		        }
		        for(int i=0;i<s2.length();i++)
		        {
		            if(Character.isLowerCase(s2.charAt(i))) c2++;
		        }
		        return c1-c2;
		    }
		};
		Arrays.sort(s,comp);
		for(String str:s)
		System.out.println(str);
	}
}
