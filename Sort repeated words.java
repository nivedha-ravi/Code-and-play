/*
Example Input/Output 1:
Input:
when there is a will there is a way
Output:
there is a
Explanation:
In the string "when there is a will there is a way" , the repeated words are there, is and a.
The length of the word there is 5.
The length of the word is is 2.
The length of the word a is 1.
After sorting the repeated words in descending order based on the length, the words become there is a
Example Input/Output 2:
Input:
Adversity and loss make a man wise
Output: -1
Example Input/Output 3:
Input:
If You are not part of the solution you are part of the problem
Output:
part are the of
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String a[]=new String[s.length];
        int b[]=new int[s.length],k=0,l=0;
        for(int i=0;i<s.length;i++){
            int o=0;
            if(!s[i].equals("*")){
                for(int j=i+1;j<s.length;j++){
                    if(s[i].equals(s[j])){
                        o=1;
                        s[j]="*";
                    }
                }
                if(o==1){
                    a[l++]=s[i];
                    b[k++]=s[i].length();
                }
            }
        }
        if(k==0){
          System.out.print(-1);
          return;
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<k;j++){
                if(b[j-1]<b[j]){
                    int t1=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t1;
                    String t2=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t2;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
	  }
}
