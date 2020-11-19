/*
Input:
5 4 30
48 42 17 32
52 23 30 34
44 30 33 11
20 15 30 75
26 60 44 84
Output: 
23 30
30 33
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,k;
    scanf("%d %d %d\n",&r,&c,&k);
    int a[r][c],firstindexI,firstindexJ,secondIndexI,secondIndexJ,count=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a[i][j]);
            if(a[i][j]==k)
            {
                if(count==0)
                {
                    firstindexI=i,firstindexJ=j;
                    count++;
                }
                else if(count==1)
                {
                    secondIndexI=i,secondIndexJ=j;
                    count++;
                }
            }
        }
    }
    int startJ=(firstindexJ<secondIndexJ)?firstindexJ:secondIndexJ;
    int endJ=(firstindexJ<secondIndexJ)?secondIndexJ:firstindexJ;
    for(int i=firstindexI;i<=secondIndexI;i++,printf("\n"))
    {
        for(int j=startJ;j<=endJ;j++)
        {
            printf("%d ",a[i][j]);
        }
    }


}
