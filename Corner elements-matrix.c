/*
Input:
5
0 0 4 9 9
1 2 6 9 3
9 5 3 4 6
0 8 1 3 6
9 2 6 8 6
2
Output:
0 0 * 9 9
1 * * * 3
* * * * *
0 * * * 6
9 2 * 8 6
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k;
    scanf("%d\n",&n);
    int a[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d ",&a[i][j]);
        }
    }
    scanf("%d",&k);
    int count=k;
    for(int i=0;i<n;i++,printf("\n"))
    {
        for(int j=0;j<n;j++)
        {
            if(j<count || j>=n-count)
            {
                printf("%d ",a[i][j]);
            }
            else
            {
                printf("* ");
            }
        }
        if(i>=n-k)
        {
            count++;
        }
        else
        {
            count--;
        }
        if(i==n-k-1)
        {
            count=1;
        }
    }


}
