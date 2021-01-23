/*
Input:
big
2 1 6
Output:
kpm
Explanation:
Here S = big. The length of S is 3 and the three integers are 2, 1 and 6.
X = 2 -> After encrypting the first alphabet, the string becomes dig.
X = 1 -> After encrypting the first 2 alphabets, the string becomes ejg.
X = 6 -> After encrypting the first 3 alphabets, the string becomes kpm. So kpm is printed as the output.
*/
import java.util.*;
public class Hello {
    public static char Shift(int n,char ch)
    {
        while(n>0)
        {
            if(ch=='Z'||ch=='z')
            {
                ch-=26;
            }
            ch++;
            n--;
        }
        return ch;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    char[] s=in.next().toCharArray();
	    for(int i=0;i<s.length;i++)
	    {
	        int num=in.nextInt();
	        for(int j=0;j<=i;j++)
	        {
	            s[j]=Shift(num,s[j]);
	        }
	    }
	   for(int i=0;i<s.length;i++)
	   {
	       System.out.print(s[i]);
	   }

	}
}
