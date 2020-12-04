/*
Input:
Hi bob@123, your transaction is successful. Thank You.
Output:
Hi bob@123, your transaction is successful.
Explanation:
The number of consonants in the word Hi is 1.
The number of consonants in the word bob@123, is 2.
The number of consonants in the word your is 2.
The number of consonants in the word transaction is 7.
The number of consonants in the word is is 1.
The number of consonants in the word successful. is 7.
The number of consonants in the word Thank is 4.
The number of consonants in the word You. is 1.
Here the maximum number of consonants is 7.
The words "transaction" and "successful." have the same maximum number of consonants, so the words till the last occurring word "successful." are printed as the output.
Hence the output is Hi bob@123, your transaction is successful
*/
import java.util.*;
public class Hello {
    public static int noofconsonants(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isAlphabetic(ch) && (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')))
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=in.nextLine().split(" ");
		int max=0,index=0;
		for(int i=0;i<s.length;i++)
		{
		    int num=noofconsonants(s[i]);
		    if(num>=max)
		    {
		       max=num;
		       index=i;
		    }
		}
        for(int i=0;i<=index;i++)
        {
            System.out.print(s[i]+" ");
        }
	}
}
