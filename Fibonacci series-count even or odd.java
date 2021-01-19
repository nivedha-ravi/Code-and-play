import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=0,n2=1,n3=0,odd=1,even=0;
		System.out.print(n1+" "+n2);
		while(n3<=n)
		{
		    n3=n1+n2;
		    if(n3>n)
		    {
		        break;
		    }
		    if(n3%2==0)
		    {
		        even++;
		    }
		    else
		    {
		        odd++;
		    }
		    n1=n2;
		    n2=n3;
		    System.out.print(" "+n3);
		}
		System.out.print("\n"+odd+"\n"+even);

	}
}
