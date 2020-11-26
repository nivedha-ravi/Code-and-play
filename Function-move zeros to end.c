/*
Input:
6
28 0 5 0 7 44
Output:
28 5 7 44 0 0
*/
void moveZeroes(int* arr, int SIZE)
{
    int copyindex=0;
    for(int i=0;i<SIZE;i++)
    {
        if(arr[i]!=0)
        {
            arr[copyindex++]=arr[i];
        }
    }
    while(copyindex<SIZE)
    {
        arr[copyindex++]=0;
    }
}
