/*
Example Input/Output 1:
Input:
110111000100
Output:
1 2 4 8
Explanation:
Here S = 110111000100.
The unique powers of 2 formed using the substrings of S are given below.
1 (1),
2 (10),
4 (100) and
8 (1000).
Hence the output is 1 2 4 8
Example Input/Output 2:
Input:
00100000
Output:
1 2 4 8 16 32
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		String s=new Scanner(System.in).next();
		for(int i=0;i<65;i++)
		{
		    long a=(long)Math.pow(2,i);
		    if(s.contains(Long.toBinaryString(a)))
		    System.out.print(a+" ");
		}
	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sc=new Scanner( System.in);
	 String s=sc.nextLine();
	 int l=s.length();
	 long t=1,in=0;
	 while(in<=63){
	     String tem=Long.toBinaryString(t);
	     if(s.contains(tem))
	     System.out.print(t+" ");
	     t*=2;
	     in++;
	 }

	}
}
