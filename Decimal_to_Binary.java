import java.util.*;
public class Hello {
    public static void decimaltobinary(int n)
    {
        int[] bin=new int[1000];
        int i=0;
        while(n>0)
        {
            bin[i++]=n%2;
            n/=2;
        }
        for(i=i-1;i>=0;i--)
        {
            System.out.print(bin[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        decimaltobinary(n);


	}
}
