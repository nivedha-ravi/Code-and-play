/*
Input:
3 4
86 81 44 95
71 16 84 63
90 75 37 21
Output:
75 84 95
Explanation:
The maximum integer in the matrix is 95. So the elements in its diagonal are 75, 84 and 95. Hence the output is 75 84 95
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c;
    scanf("%d %d\n",&r,&c);
    int a[r][c];
    int max=0,maxi,maxj;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a[i][j]);
            if(max<a[i][j])
            {
                max=a[i][j];
                maxi=i;
                maxj=j;
            }
        }
    }
    if((maxi==0 && maxj==0)||(maxi==r-1 && maxj==c-1))
    {
       printf("%d ",a[maxi][maxj]);
    }
    else if((maxi>=0 && maxi<r-1) && maxj==c-1)
    {
       int dup[r],count=0;
       while(maxi<=r-1 && maxj>=0)
       {
           dup[count++]=a[maxi][maxj];
           maxi++;
           maxj--;
       }
       for(int i=count-1;i>=0;i--)
       {
           printf("%d ",dup[i]);
       }
    }
    else if((maxi>0 && maxi<r-1) && (maxj>0 && maxj<c-1))
    {
        int dup[r],count=0,i=maxi-1,j=maxj+1;
        while(maxi<=r-1 && maxj>=0)
        {
            dup[count++]=a[maxi++][maxj--];
        }
        for(int k=count-1;k>=0;k--)
        {
            printf("%d ",dup[k]);
        }
        while(i>=0 && j<=c-1)
        {
            printf("%d ",a[i--][j++]);
        }
    }
    else if(maxi==r-1 && (maxj>=0 && maxj<c-1))
    {
        while(maxi>=0 && maxj<=c-1)
        {
            printf("%d ",a[maxi--][maxj++]);
        }
    }
    else if(maxj==0 && (maxi>0 && maxi<=r-1))
    {
        while(maxi>=0 && maxj<=c-1)
        {
            printf("%d ",a[maxi--][maxj++]);
        }
    }
    else if(maxi==0 && (maxj>0 && maxj<=c-1))
    {
        int dup[r],count=0;
        while(maxi<=r-1 && maxj>=0)
        {
            dup[count++]=a[maxi++][maxj--];
        }
        for(int i=count-1;i>=0;i--)
        {
            printf("%d ",dup[i]);
        }
    }
}
