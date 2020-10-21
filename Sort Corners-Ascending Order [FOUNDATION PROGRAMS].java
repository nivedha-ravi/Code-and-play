import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		int b[]=new int[4];
		b[0]=a[0][0];b[1]=a[0][c-1];b[2]=a[r-1][c-1];b[3]=a[r-1][0];
		Arrays.sort(b);
		a[0][0]=b[0];a[0][c-1]=b[1];a[r-1][c-1]=b[2];a[r-1][0]=b[3];
		for(int i=0;i<r;i++,System.out.println())
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		}
	}
}
