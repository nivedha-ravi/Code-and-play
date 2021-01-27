/*
Example Input/Output 1: Input: 1000001110 Output: baaaabb Explanation: Here S = 1000001110. The way the string S is decoded is given below. 10 0 0 0 0 11 10 => b a a a a b b
Example Input/Output 2: Input: 001111000101 Output: -1 Example Input/Output 3: Input: 010110100 Output: abbaba
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String a="";
		for(int i=0;i<S.length();i++)
		{
		    try{
		    char ch;
		    if(S.charAt(i)=='1' && S.charAt(i+1)=='0') {a+='b';i++; }
		    else if(S.charAt(i)=='1' && S.charAt(i+1)=='1') {a+='b';i++;}
		    else a+='a';}
		    catch(Exception e){
		        System.out.print("-1");
		        System.exit(0);
		    }

		}
		System.out.print(a);
	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String s1="";
		int t=0;
		int k=0;
		for(int i=0;i<ch.length-1;i++)
		{
		    if(ch[i]=='1' && (ch[i+1]=='0' || ch[i+1]=='1'))
		    {

		        s1=s1+'b';
		        if(i+1==ch.length-1)
		        t++;
		        k=k+2;
		        i++;
		    }
		    else if(ch[i]=='0')
		    {
		        s1=s1+'a';
		        k++;
		    }
		}
		if(t==0)
		{
		    if(ch[ch.length-1]=='0')
		    {
		        k++;
		        s1=s1+'a';
		    }
		}
		if(k==ch.length)
		{
		    System.out.print(s1);
		}
		else
		System.out.print("-1");

	}
}
