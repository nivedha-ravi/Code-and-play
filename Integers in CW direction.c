#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int x;
    scanf("%d",&x);
    int index=x-1;
    do
    {
        printf("%d ",a[index]);
        index=(index+1)%n;
    }
    while(index!=x-1);
}
