/*
Example Input/Output 1:
Input:
4
2 1 3 5
Output:
1 + 2 = 3
2 + 1 = 3
2 + 3 = 5
3 + 2 =5
Explanation:
All possible pairs of integers whose sum is present in the 4 integers are given below.
2 + 1 = 3
2 + 3 = 5
1 + 2 = 3
3 + 2 = 5
After sorting the pairs based on the given conditions, the pairs become
1 + 2 = 3
2 + 1 = 3
2 + 3 = 5
3 + 2 = 5
Example Input/Output 2:
Input:
3
123 234 123
Output: -1
Example Input/Output 3:
Input:
6
10 20 30 10 20 30
Output:
10 + 10 = 20
10 + 10 = 20
10 + 20 = 30
10 + 20 = 30
10 + 20 = 30
10 + 20 = 30
20 + 10 = 30
20 + 10 = 30
20 + 10 = 30
20 + 10 = 30
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n],b[]=new int[10000],c[]=new int[10000],d[]=new int[10000],u=0,v=0,o=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int sum=a[i]+a[j];
                    for(int k=0;k<n;k++){
                        if(a[k]==sum){
                            b[u++]=a[i];
                            c[v++]=a[j];
                            d[o++]=sum;break;
                        }
                    }
                }
            }
        }
        for(int i=0;i<o;i++){
            for(int j=1;j<o;j++){
                if(d[j-1]>d[j]){
                    int t=d[j-1];
                    d[j-1]=d[j];
                    d[j]=t;
                    int t1=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t1;
                    int t2=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t2;
                }else if(d[j-1]==d[j]){
                    if(b[j-1]>b[j]){
                        int t=d[j-1];
                        d[j-1]=d[j];
                        d[j]=t;
                        int t1=b[j-1];
                        b[j-1]=b[j];
                        b[j]=t1;
                        int t2=c[j-1];
                        c[j-1]=c[j];
                        c[j]=t2;
                    }
                }
            }
        }
        if(o==0)
        System.out.print("-1");
        else
        for(int i=0;i<o;i++){
            System.out.println(b[i]+" + "+c[i]+" = "+d[i]);
        }
	}
}
