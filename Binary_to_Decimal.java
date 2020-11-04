import java.util.*;
public class Hello {


    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int bin=in.nextInt();
	    int num=0,base=1;
	    while(bin>0)
	    {
	        if((bin%10)==1)
	        {
	            num=num+base;
	        }
	        base=base*2;
	        bin/=10;
	    }
        System.out.print(num);
	}
}
