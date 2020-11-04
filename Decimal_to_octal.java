import java.util.*;
public class Hello {
    public static void decimaltooctal(int n)
    {
        int[] oct=new int[1000];
        int i=0;
        while(n>0)
        {
            oct[i++]=n%8;
            n/=8;
        }
        for(i=i-1;i>=0;i--)
        {
            System.out.print(oct[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        decimaltooctal(n);


	}
}
