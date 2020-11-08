/*
Example Input/Output 1:
Input:
He separated the fighting children
Output:
separated fighting children He the
Explanation:
The word "He" contains 1 vowel.
The word "separated" contains 4 vowels.
The word "the" contains 1 vowel.
The word "fighting" contains 2 vowels.
The word "children" contains 2 vowels.
After sorting the words based on the number of vowels in descending order, the string becomes "separated fighting children He the" .
Hence the output is
separated fighting children He the
Example Input/Output 2:
Input:
India will win the upcoming champions trophy
Output:
India upcoming champions will win the trophy
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length],k=0;
        for(int i=0;i<s.length;i++){
            int c=0;
            for(int j=0;j<s[i].length();j++){
                if(isVow(s[i].charAt(j))){
                    c++;
                }
            }
            a[k++]=c;
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<k;j++){
                if(a[j-1]<a[j]){
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                    String e=s[j-1];
                    s[j-1]=s[j];
                    s[j]=e;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(s[i]+" ");
        }
	}
	public static boolean isVow(char a){
	    a=Character.toLowerCase(a);
	    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
	        return true;
	    }
	    return false;
	}
}
