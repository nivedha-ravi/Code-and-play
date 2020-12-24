/*
Example Input/Output 1:
Input:
Sku#ll
Ski#ll
Output: YES
Explanation:
Here S1 = "Sku#ll" and S2 = "Ski#ll" .
If S1 typed into an empty text editor, it becomes "Skll" .
If S2 typed into an empty text editor, it becomes "Skll" .
Both S1 and S2 give the same string when they are typed into empty text editors.
So YES is printed as the output.
Example Input/Output 2:
Input:
ab##cd
a#b###cd#d
Output: YES
Example Input/Output 3:
Input:
h#Hello
#hello####Helloo#
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		a=find(a);
		String b=scan.next();
		b=find(b);
		if(a.equals(b))
	    System.out.print("YES");
		else
		System.out.print("NO");

	}
	static String find(String s)
	{
	    String an="";
	    for(char c:s.toCharArray())
	    {
	        if(c!='#')
	        an+=c;
	        else if(an.length()>0)
	        an=an.substring(0,an.length()-1);
	    }
	    return an;
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sc=new Scanner( System.in);
	 char[] a=sc.nextLine().toCharArray();
	 char[] b=sc.nextLine().toCharArray();
	 int l1=a.length,l2=b.length;
	 for(int i=0;i<l1;i++){
	     if(a[i]=='#'){
	         for(int j=i-1;j>=0;j--){
	             if(a[j]!='#'&&a[j]!='*'){
	                 a[j]='*';
	                 break;
	             }
	         }
	     }
	 }
	 for(int i=0;i<l2;i++){
	     if(b[i]=='#'){
	         for(int j=i-1;j>=0;j--){
	             if(b[j]!='#'&&b[j]!='*'){
	                 b[j]='*';
	                 break;
	             }
	         }
	     }
	 }
	 int m=(l1>l2)?l1:l2;
	 String t1="",t2="";
	 for(int i=0;i<m;i++){
	     if(i<l1&&a[i]!='*'&&a[i]!='#')
	     t1=t1+""+a[i];
	     if(i<l2&&b[i]!='*'&&b[i]!='#')
	     t2=t2+""+b[i];
	 }
	 if(t1.equals(t2))
	 System.out.println("YES");
	 else
	 System.out.println("NO");
	}
}
