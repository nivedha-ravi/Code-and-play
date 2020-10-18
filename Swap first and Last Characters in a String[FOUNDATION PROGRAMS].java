import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		    char ch[]=in.next().toCharArray();
		    char c=ch[0];
		    ch[0]=ch[ch.length-1];
		    ch[ch.length-1]=c;
		    System.out.print(new String(ch)+" ");
		}

	}
}
