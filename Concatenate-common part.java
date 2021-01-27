/*
INPUT:
skillrack
5
king
racks
rock
acknowledge
skillrack
OUTPUT:
skillracking
skillracks
-1
skillracknowledge
skillrack
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char S[101],X[101],temp[101];
    int N;
    scanf("%s\n%d\n",S,&N);
    for(int i=0;i<N;i++)
    {
        scanf("%s\n",X);
        strcpy(temp,X);
        int lenX = strlen(X),lenS=strlen(S),flag=0;
        for(int i=lenX-1;i>=0;i--)
        {
            if(strcmp(temp,&S[lenS-1-i])==0)
            {
                printf("%s%s\n",S,&X[i+1]);
                flag=1;
                break;
            }
            temp[i]='\0';
        }
        if(flag==0)printf("-1\n");
    }
}
