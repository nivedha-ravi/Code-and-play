/*
Boundary Condition(s):
1 <= N, E, S, W <= 100
1 <= Length of I <= 1000
Input Format:
The first line contains N, E, S and W separated by a space.
The second line contains I.
Output Format:
The first line contains the instructions for which the car moves.
Example Input/Output 1:
Input:
3 6 2 4
WWWNNNWWEWNWSNSWWEEN
Output:
WWWNNNWESSEE
Explanation:
Here N=3, E=6, S=2, W=4 and I="WWWNNNWWEWNWSNSWWEEN" .
The instructions for which the car moves are W, W, W, N, N, N, W, E, S, S, E and E.
Hence the output is WWWNNNWESSEE
Example Input/Output 2:
Input:
1 2 3 4
NNNNESWWSSEEE
Output:
NESWWSSE
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),e=sc.nextInt(),s=sc.nextInt(),w=sc.nextInt();
        char a[]=sc.next().toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='N' && n>0){
                System.out.print(a[i]);
                n--;
            }
            if(a[i]=='E' && e>0){
                System.out.print(a[i]);
                e--;
            }
            if(a[i]=='S' && s>0){
                System.out.print(a[i]);
                s--;
            }
            if(a[i]=='W' && w>0){
                System.out.print(a[i]);
                w--;
            }
        }
	}
}
