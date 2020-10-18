/*
Input:
Education
3 8
Output:
oiau
*/
import java.util.*;
public class Hello {
    public static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch[]=in.next().toCharArray();
		int from=in.nextInt();
		int to=in.nextInt();
		for(int i=to-1;i>=from-1;i--)
		{
		    if(isVowel(ch[i]))
		    {
		        System.out.print(ch[i]);
		    }
		}

	}
}
