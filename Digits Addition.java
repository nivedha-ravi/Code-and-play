/*
Input:
12
9 2 8 1 3 5 6 7 3 1 1 6
9
7 8 4 6 2 1 9 9 7
Output:
9 2 8 9 2 0 2 9 5 1 1 3
Explanation:
The X is formed using the 12 digits 9 2 8 1 3 5 6 7 3 1 1 6. The Y is formed using the 9 digits 7 8 4 6 2 1 9 9 7. X = 928135673116 and Y = 784621997. The sum of X and Y is 928920295113. Hence the output is 9 2 8 9 2 0 2 9 5 1 1 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		String s1="",s2="";
		for(int i=0;i<m;i++)
		{
		    s1+=in.next();
		}
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    s2+=in.next();
		}
		long sum=Long.parseLong(s1)+Long.parseLong(s2);
		String s=Long.toString(sum);
		for(int i=0;i<s.length();i++)
		{
		    System.out.print(s.charAt(i)+" ");
		}

	}
}

import java.util.*;
import java.math.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String str = "";
		for(int i=0;i<m;i++) str+=sc.nextInt()+"";
		BigInteger bi1 = new BigInteger(str);
		int n = sc.nextInt();
		str="";
		for(int i=0;i<n;i++) str+=sc.nextInt()+"";
		BigInteger bi2 = new BigInteger(str);
		BigInteger bi3;
		bi3 = bi1.add(bi2);
		for(char ch:bi3.toString().toCharArray())
		System.out.print(ch+" ");
	}
}
