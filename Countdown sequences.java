/*
Input:
11
4 5 4 3 2 1 3 2 1 5 1
Output:
5 4 3 2 1 3 2 1 1
Explanation:
Here N = 11 and the given 11 integers are 4 5 4 3 2 1 3 2 1 5 1.
The 1st countdown sequence contains 5 4 3 2 1, so they are printed.
The 2nd countdown sequence contains 3 2 1, so they are printed.
The 3rd countdown sequence contains 1, so it is printed.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int i,j,k,n,f=0;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
		    if(a[i]==1){
		        int count=1,t=1;
		        f=1;
		        j=i-1;
		        while(j>=0 && a[j]-t==1){
		            t=a[j];
		            j--;
		            count++;
		        }
		        for(k=count;k>=1;k--)   System.out.print(k+" ");
		        System.out.println();
		    }
		}
		if(f==0) System.out.print("-1");
	}
}
