/*
Example Input/Output 1:
Input:
18*10*811*11*17*0210*
Output:
skillrack
Explanation:
Here S = 18*10*811*11*17*0210*.
18* is replaced with the alphabet s. Now the string becomes s10*811*11*17*0210*.
10* is replaced with the alphabet k. Now the string becomes sk811*11*17*0210*.
8 is replaced with the alphabet i. Now the string becomes ski11*11*17*0210*.
11* is replaced with the alphabet l. Now the string becomes skil11*17*0210*.
11* is replaced with the alphabet l. Now the string becomes skill17*0210*.
17* is replaced with the alphabet r. Now the string becomes skillr0210*.
0 is replaced with the alphabet a. Now the string becomes skillra210*.
2 is replaced with the alphabet c. Now the string becomes skillrac10*.
10* is replaced with the alphabet k. Now the string becomes skillrack.
So skillrack is printed as the output.
Example Input/Output 2:
Input:
15*17*14*617*012*12*813*6
Output:
programming
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='*') s1=s1.replace('*',' ');
        }
        String[] s=s1.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].length()<=2){
                System.out.print((char)(Integer.parseInt(s[i])+97));
            }else{
                char c[]=s[i].toCharArray();
                for(int j=0;j<s[i].length()-2;j++){
                    System.out.print((char)((c[j]-'0')+97));
                }
                String d=(s[i]+"").substring(s[i].length()-2,s[i].length());
                System.out.print((char)(Integer.parseInt(d)+97));
            }
        }
	}
}
