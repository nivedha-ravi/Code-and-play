/*
Example Input/Output 1:
Input:
1
Output:
00:01
00:02
00:04
00:08
00:16
00:32
01:00
02:00
04:00
08:00
16:00
Explanation:
The possible values of time where the sum of number of 1s in the binary representations of HH and MM is equal to 1 are given below.
00:01
00:02
00:04
00:08
00:16
00:32
01:00
02:00
04:00
08:00
16:00
Example Input/Output 2:
Input:
9
Output:
15:31
15:47
15:55
15:59
23:31
23:47
23:55
23:59
*/


import java.util.*;
public class Hello {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<24;i++)
        {
            for(int j=0;j<=59;j++)
            {
                if((Integer.bitCount(i)+Integer.bitCount(j))==n)
                {
                    System.out.printf("%02d:%02d\n",i,j);
                }
            }
        }
    }
}
