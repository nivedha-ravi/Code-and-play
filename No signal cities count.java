/*
Input:
10 10
SSSEEEEEENNWWSSSSSSS
2
3 3 L
7 5 S
Output:
7
Explanation:
The asterisks in the below matrix represent the cities with no signal.
The hash symbols in the below matrix represent the cities with signal.
The alphabet L represents a large tower. The alphabet S represents a small tower.
# # # # # * * * * *
# # # # # * * * * *
# # L # # * * * * *
# # # # # * * * * *
# # # # # * * * * *
* * * # # # * * * *
* * * # S # * * * *
* * * # # # * * * *
* * * * * * * * * *
* * * * * * * * * *
The path traveled by the person is highlighted below.
# # # # # * * * * *
# # # # # * * * * *
# # * # # * * * * *
# # # # # * * * * *
# # # # # * * * * *
* * * # # # * * * *
* * * # * # * * * *
* * * # # # * * * *
* * * * * * * * * *
* * * * * * * * * *
The person did not receive the signal in 7 cities, so 7 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char[][] cities=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        cities[i][j]='*';
		    }
		}
        String p=in.next();
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int row=in.nextInt();
            int col=in.nextInt();
            char size=in.next().charAt(0);
            int xtra=0;
            if(size=='L')
            {
                xtra=3;
            }
            else if(size=='S')
            {
                xtra=2;
            }
            for(int rw=Math.max(0,row-xtra);rw<Math.min(r,row+xtra-1);rw++)
            {
                for(int cl=Math.max(0,col-xtra);cl<Math.min(c,col+xtra-1);cl++)
                {
                    if(rw!=row-1 || cl!=col-1)
                    {
                        cities[rw][cl]='#';
                    }
                }
            }
        }
        int x=0,y=0,count=0;
        if(cities[0][0]=='*')
        {
            count++;
        }
        for(int ch=0;ch<p.length();ch++)
        {
            if(p.charAt(ch)=='N')
            {
                x-=1;
            }
            else if(p.charAt(ch)=='S')
            {
                x+=1;
            }
            else if(p.charAt(ch)=='E')
            {
                y+=1;
            }
            else if(p.charAt(ch)=='W')
            {
                y-=1;
            }
            if(cities[x][y]=='*')
            {
                count++;
            }
        }
        System.out.print(count);
	}
}
