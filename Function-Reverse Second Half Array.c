void reverseSecondHalf(int* arr, int SIZE)
{
    for(int i=SIZE/2,j=SIZE-1;i<j;i++,j--)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
