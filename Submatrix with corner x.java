
/*
Example Input/Output 1:
Input:
4
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
59
Output:
59
58 29
23 59
29 70
59 54
59 54
82 67
23 59
86 82
50 23 59
51 86 82
10 60 37
Explanation:
All four possible 2x2 square submatrices which contain the integer 59 in one of the four corners are highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
The only possible 3x3 square submatrix which contains the integer 59 in one of the four corners is highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
Example Input/Output 2:
Input:
5
54 84 73 27 83
50 63 42 19 23
21 87 34 16 14
37 38 77 90 57
43 11 79 47 64
34
Output:
34
63 42
87 34
42 19
34 16
34 16
77 90
87 34
38 77
54 84 73
50 63 42
21 87 34
73 27 83
42 19 23
34 16 14
34 16 14
77 90 57
79 47 64
21 87 34
37 38 77
43 11 79
*/
#include<stdio.h>
#include <stdlib.h>

int max(int a, int b) {
    return a>b?a:b;
}

void printSubMatrix(int N, int arr[N][N], int a, int b, int c, int d) {
    for(int i=a ; i<=c ; ++i) {
        for(int j=b ; j<=d ; ++j) {
            printf("%d ", arr[i][j]);
        }printf("\n");
    }
}

int main() {
    int N, X;
    scanf("%d", &N);
    int arr[N][N];
    for(int i=0 ; i<N ; ++i) {
        for(int j=0 ; j<N ; ++j) {
            scanf("%d", &arr[i][j]);
        }
    } scanf("%d", &X);
    for(int i=0 ; i<N ; ++i) {
        for(int j=0 ; j<N ; ++j) {
            if(arr[i][j] == X) {
                int Dn = 1;
                int Dx = max(i, max(j, max(N-i-1, N-j-1)));
                printf("%d\n", X);
                for(int k=Dn ; k<=Dx ; ++k) {
                    if(i-k>=0 && j-k>=0)
                        printSubMatrix(N, arr, i-k, j-k, i, j);
                    if(i-k>=0 && j+k<N)
                        printSubMatrix(N, arr, i-k, j, i, j+k);
                    if(i+k<N && j+k<N)
                        printSubMatrix(N, arr, i, j, i+k, j+k);
                    if(i+k<N && j-k>=0)
                        printSubMatrix(N, arr, i, j-k, i+k, j);
                }
            }
        }
    }
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=0,j=0,f=1,m;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    a[i][j]=sc.nextInt();
		}
		int k=sc.nextInt();
		hello:
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(a[i][j]==k)
		        break hello;
		    }
		}
		System.out.println(k);
		while(f<n)
		{
		    if(i-f>=0)
		    {
		        if(j-f>=0)
		        {
		        for(k=i-f;k<=i;k++)
		        {
		            for(m=j-f;m<=j;m++)
		            System.out.print(a[k][m]+" ");
		            System.out.println();
		        }
		        }
		        if(j+f<n)
		        {
		            for(k=i-f;k<=i;k++)
		            {
		                for(m=j;m<=j+f;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		    }
		    if(i+f<n)
		    {
		        if(j+f<n)
		        {
		            for(k=i;k<=i+f;k++)
		            {
		                for(m=j;m<=j+f;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		        if(j-f>=0)
		        {
		            for(k=i;k<=i+f;k++)
		            {
		                for(m=j-f;m<=j;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		    }
		    f++;
		}
	}
}
