/*
Input:
Argument
Output:
AArguuuuuumeeent
Explanation:
There are 3 vowels in the given string Argument (A, u and e).
The first vowel is A. So one more A is inserted next to it.
Now the string becomes AArgument.
The second vowel is u.
So five more u are inserted next to it.
Now the string becomes AArguuuuuument.
The third vowel is e.
So two more e are inserted next to it.
Now the string becomes AArguuuuuumeeent.
So AArguuuuuumeeent is printed as the output
*/
import java.util.*;
public class Hello {
    public static void printVowels(char ch,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    char c=ch[i];
		    switch(Character.toLowerCase(ch[i]))
		    {
		        case 'a':
		            printVowels(c,1+1);
		            break;
		        case 'e':
		            printVowels(c,2+1);
		            break;
		        case 'i':
		            printVowels(c,3+1);
		            break;
		        case 'o':
		            printVowels(c,4+1);
		            break;
		        case 'u':
		            printVowels(c,5+1);
		            break;
		        default:
		            printVowels(c,1);
		            break;
		    }
		}

	}
}
