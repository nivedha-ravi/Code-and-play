/*
INPUT:
10
OUTPUT:
2

Set bits-1's
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,c=0;
    scanf("%d",&n);
    while(n>0)
    {
        if(n&1)
        {
            c++;
        }
        n=n>>1;
    }
    printf("%d",c);


}
