/*
Input:
10
83 79 78 66 63 61 54 46 43 16
13
Output:
83
79 78
66 63 61
54 46 43 16
83 79 78 66 63
61 54 46 43 16 83
79 78 66 63 61 54 46
43 16 83 79 78 66 63 61
54 46 43 16 83 79 78 66 63
61 54 46 43 16 83 79 78 66 63
61 54 46 43 16 83 79 78 66 63 61
54 46 43 16 83 79 78 66 63 61 54 46
43 16 83 79 78 66 63 61 54 46 43 16 83
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
        int x=in.nextInt();
        int counter=0;
        for(int i=1;i<=x;i++,System.out.println())
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a[counter++]+" ");
            if(counter==n)
            {
                counter=0;
            }
            }
        }
	}
}
