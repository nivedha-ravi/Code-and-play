/*
INPUT:
5
1 2 1 2 1 2
OUTPUT:
2
*/
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0,maxp=0;
		int[] arr=new int[n];
		int[] num={0,0,0,0,0,0,0,0,0,0};
		int[] rep={0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<n;i++)
		{arr[i]=s.nextInt();
		if(num[arr[i]]==1)
		rep[arr[i]]=i;
		 num[arr[i]]++;}
		for(int i=0;i<10;i++)
		{if(num[i]>maxp)
		    {max=i;
		  maxp=num[i];}
		  else if(num[i]==maxp)
		  {if(rep[i]<rep[max])
		      max=i;

		  }		}
        System.out.print(max);
	}
}


import java.util.*;
import java.util.Map.Entry;
public class Hello {
    public static int getDistance(int[] arr,int num,int occurance)
    {
        if(occurance<2)
        return Integer.MAX_VALUE;
        int index=0,count=2,firstOccuranceIndex=0,secondOccuranceIndex=0;
        for(index=0;index<arr.length && count>0;index++)
        {
            if(arr[index]==num)
            {
                if(count==2)
                {
                    firstOccuranceIndex=index;
                }
                else{
                    secondOccuranceIndex=index;
                }
                count--;
            }
        }
        return secondOccuranceIndex- firstOccuranceIndex;
    }
    public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N=scanner.nextInt();
		int[] arr=new int[N];
		Map<Integer,Integer> map=new HashMap<>();
		for(int index=0;index<N;index++)
		{
		    int num=scanner.nextInt();
		    arr[index]=num;
		    if(map.get(num)==null)
		    map.put(num,1);
		    else
		    map.put(num,map.get(num)+1);
		}
		List<Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
		Collections.sort(list,(o1,o2)->o2.getValue()-o1.getValue()==0?getDistance(arr,o1.getKey(),o1.getValue())- getDistance(arr,o2.getKey(),o2.getValue()):o2.getValue()-o1.getValue());
        System.out.print(list.get(0).getKey());
	}
}
