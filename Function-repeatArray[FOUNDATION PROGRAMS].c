/*
You are required to complete the given code. You can click on Run anytime to check the compilation/execution status of the program. You can use printf to debug your code. The submitted code should be logically/syntactically correct and pass all test cases. Do not write the main() function as it is not required.
Code Approach:
For this question, you will need to complete the code as in the given implementation. We do not expect you to modify the approach. The function/method repeatArray accepts three arguments - SIZE, arr and K, an integer representing the size of the array arr, the integer array arr and an integer K respectively. The function/method repeatArray must form a new integer array by repeating the given array K times. Then the function must return the new array. Your task is to implement the function repeatArray so that it passes all the test cases.
Example Input/Output 1:
Input:
3
2 3 5
4
Output:
2 3 5 2 3 5 2 3 5 2 3 5
*/
int* repeatArray(int SIZE, int arr[], int K)
{
    int *ptr=(int*)malloc(SIZE*K*sizeof(int));
    int index=0;
    for(int i=1;i<=K;i++)
    {
        for(int j=0;j<SIZE;j++)
        {
            ptr[index++]=arr[j];
        }
    }
    return ptr;
}
