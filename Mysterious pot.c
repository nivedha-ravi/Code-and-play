/*
There is a huge pot which can multiply the gold coins dropped in it T times. But the pot can be used only one time in a day. Mr.Gopal initially had N gold coins and he made use of the pot for D days and he finally had G gold coins. The program must accept the values of T, D and G as the input and print the value of N.
Input:
2 5 96
Output:
3
Explanation:
The pot multiplies the coins two times. That is doubles. Mr.Gopal had 3 gold coins initially and he used the pot for 5 days.
So at the end of Day1 - 6, Day2 - 12, Day3 - 24, Day4 - 48, Day5 - 96.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int t,d,g;
    scanf("%d %d %d",&t,&d,&g);
    while(d--)
    {
        g/=t;
    }
    printf("%d",g);



}
