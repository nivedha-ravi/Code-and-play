/*
Example Input/Output 1:
Input:
Foot
Basket
Vbdets
Output: YES
Explanation:
The string Foot can be decoded as 5449.
The string Basket can be decoded as 108049.
The string Vbdets can be decoded as 113498.
The sum of 5449 + 108049 is equal to 113498.
So YES is printed as the output.
Example Input/Output 2:
Input:
BALL
dog
Cat
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        String s3=sc.next().toLowerCase();
        if(Long.parseLong(dup(s1))+Long.parseLong(dup(s2))==Long.parseLong(dup(s3)))
        System.out.print("YES");
        else
        System.out.print("NO");
	}
	public static String dup(String a){
	    Map<Character,Integer> m=new HashMap<Character,Integer>();
        m.put('a',0);m.put('b',1);m.put('c',2);m.put('d',3);m.put('e',4);m.put('f',5);
        m.put('g',6);m.put('h',7);m.put('i',8);m.put('j',9);m.put('k',0);m.put('l',1);
        m.put('m',2);m.put('n',3);m.put('o',4);m.put('p',5);m.put('q',6);m.put('r',7);
        m.put('s',8);m.put('t',9);m.put('u',0);m.put('v',1);m.put('w',2);m.put('x',3);
        m.put('y',4);m.put('z',5);
        String s="";
        for(int i=0;i<a.length();i++){
            for(Map.Entry<Character,Integer>j:m.entrySet()){
                if(a.charAt(i)==j.getKey()){
                    s+=j.getValue()+"";
                    break;
                }
            }
        }
        return s;
	  }
}


import java.util.*;
public class Hello {
    public static long update(String str) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz",result="";
        for(char ch:str.toCharArray())
        {
            int val = alphabets.indexOf(ch);
            result += Integer.toString(val%10);
        }
        return Long.parseLong(result);
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		String s3 = sc.next().toLowerCase();
		long sum = 0L;
		sum += update(s1);
		sum += update(s2);
		long check = update(s3);
	    System.out.print(sum==check ? "YES" : "NO");
	}
}
