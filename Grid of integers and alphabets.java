/*
INPUT:
6
OUTPUT:
1 2 c 4 5 6
g 8 9 10 k 12
m 14 15 16 q 18
s 20 21 22 w 24
y 26 27 28 c 30
31 32 g 34 35 36
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
	    int n=in.nextInt();
	    int count=1;
	    for(int i=1;i<=n;i++,System.out.println())
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(count%2==0)
	            {
	                System.out.print(count+" ");
	                count++;
	            }
	            else
	            {
	                if(count%2!=0)
	                {
	                    int no=(count>26)?count%26:count;
	                    if(isVowel((char)(no+96)))
	                    {
	                        System.out.print(count+" ");
	                    }
	                    else
	                    {
	                        System.out.print((char)(no+96)+" ");
	                    }
	                    count++;
	                }
	            }
	        }
	    }

	}
}
