/*
Example Input/Output 1:
Input: codeedelll
Output: coel
Explanation:
Here the string str is "codeedelll" .
After removing the alphabets which are recurring even number of times in "codeedelll" , it becomes "coddel" .
Still, the modified string contains the alphabets which are recurring even number of times.
So those alphabets are removed in the string.
Now the modified string "coel" has no more recurring alphabets.
So coel is printed as the output.
Example Input/Output 2:
Input: xwxyyx
Output: xw
Example Input/Output 3:
Input: Success
Output: Sue
*/

#include<stdio.h>
void removeRepeatingAlphabets (char str[])
{
    while(1){
        int l=strlen(str),f=0;
        for(int i=0;i<l-1;i++){
            if(str[i]==str[i+1]){
                for(int j=i+2;j<l;j++){
                    str[j-2]=str[j];
                }
                str[strlen(str)-2]='\0';
                f=1;
                break;
            }
        }
        if(f==0) break;
    }
}
int main()
{
    char a[10000];
    scanf("%s",a);
    removeRepeatingAlphabets(a);
    printf("%s",a);
}
