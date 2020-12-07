/*
Input:
5 7
C m D k i t d
E t q C e o g
i A q q b c D
F y m z g g o
g h a l A l s
4 2
3 6
Output:
yhamqqDkCqzlAgbeitoc
Explanation:
In the given 5x7 character matrix, the characters from the cell (4, 2) to the cell (3, 6) in vertical zig-zag direction are highlighted below.
C m D k i t d
E t q C e o g
i A q q b c D
F y m z g g o
g h a l A l s
So yhamqqDkCqzlAgbeitoc is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char[][] a=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		    }
		}
		int c1x=in.nextInt()-1;
		int c1y=in.nextInt()-1;
		int c2x=in.nextInt()-1;
		int c2y=in.nextInt()-1;
		int k=0;
        for(int i=c1y;;i++)
        {
            int flag=0;
            if(k%2==0)
            {
                while(c1x<r)
                {
                    if(i==c2y && c1x==c2x)
                    {
                        System.out.print(a[c1x][i]);
                        flag=1;
                        break;
                    }
                    System.out.print(a[c1x++][i]);
                }
            }
            else
            {
                while(c1x>=0)
                {

                    if(i==c2y && c1x==c2x)
                    {
                        System.out.print(a[c1x][i]);
                        flag=1;
                        break;
                    }
                    System.out.print(a[c1x--][i]);
                }
            }
            c1x=(k%2==0)?r-1:0;
            k++;
            if(flag==1)
            {
                break;
            }

        }
	}
}
