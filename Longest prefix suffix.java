/*
Example Input/Output 1:
Input:
abcdxyzabcd
Output: 4
Explanation:
The longest proper prefix which is also a proper suffix in the string abcdxyzabcd is abcd.
So the length of the proper prefix or proper suffix is 4.
So 4 is printed as the output.
Example Input/Output 2:
Input:
PQRSPQRSP
Output: 5
Example Input/Output 3:
Input:
xyzabcxyzc
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        String a=new String(s);
        int b[]=new int[10000],o=0;
        for(int i=s.length-1;i>0;i--){
            if(s[0]==s[i]) {
                String d=a.substring(i);
                if(d.equals(a.substring(0,d.length()))){
                    b[o++]=d.length();
                }
            }
        }
        System.out.print((o==0)?"-1":b[o-1]);
    }
}
