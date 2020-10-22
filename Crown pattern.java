/*
Input: 11
Output:
*++++*++++*
#++++#++++#
##++###++##
###########
###########
Explanation:
Here N = 11. The number of rows in the grid = (11-1)/2 = 5.
The number of rows in the grid = 11.
So the grid of size 5x11 is formed as given below.
*++++*++++*
#++++#++++#
##++###++##
###########
###########
Example Input/Output 2:
Input:
9
Output:
*+++*+++*
#+++#+++#
##+###+##
#########
Example Input/Output 3:
Input:
17
Output:
*+++++++*+++++++*
#+++++++#+++++++#
##+++++###+++++##
###+++#####+++###
####+#######+####
#################
#################
#################
*/
import java.util.*;
public class Hello {
    public static void printrest(int c,int startindex,int endindex,int startmiddle,int endmiddle,char ch)
    {
        for(int j=0;j<c;j++)
        {
            if(j<=startindex||j>=c-1-endindex||(j>=startmiddle && j<=endmiddle))
            {
                System.out.print(ch);
            }
            else
            {
                System.out.print("+");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int r=(n-1)/2;
		char ch1='*',ch2='#';
		int num=0,startindex=0,endindex=0;
		for(int i=1;i<=r;i++)
		{
		    if(i==1)
		    {
		        printrest(n,startindex,endindex,(int)(n/2)-num,(int)(n/2)+num,ch1);
		    }
		    else
		    {
		        printrest(n,startindex,endindex,(int)(n/2)-num,(int)(n/2)+num,ch2);
		        startindex++;
		        endindex++;
		        num++;
		    }
		}

	}
}
