/*
Example Input/Output 1:
Input:
20 5 8
13 7 5 6 10 9 17 12
Output: 1 4 2 1
Explanation:
The total number of seats in a bus is 20 and the number of seats in each row is 5.
So the total number of rows in the bus is 4 (20 / 5).
The booked seat numbers are 13, 7, 5, 6, 10, 9, 17 and 12.
In the 1st row, the seat number 5 is booked. So 1 is printed.
In the 2nd row, the seat numbers 6, 7, 9 and 10 are booked. So 4 is printed.
In the 3rd row, the seat numbers 12 and 13 are booked. So 2 is printed.
In the 4th row, the seat number 17 is booked. So 1 is printed.
Example Input/Output 2:
Input:
15 3 15
12 5 2 4 3 13 10 15 14 9 6 11 8 7 1
Output:
FULL
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int y=s.nextInt();
		int[] arr=new int[y];
		for(int i=0;i<y;i++) {
		    arr[i]=s.nextInt();
		}
		if(n==y) {
		    System.out.print("FULL");
		}
		else {
		    int m=n/x;
		    for(int h=1;h<=m;h++) {
		        int c=0;
		        for(int i=0;i<y;i++) {
		            if(arr[i]<=h*x && arr[i]>(h-1)*x)
		                c++;
		        }
		        System.out.println(c+" ");
		    }
		}
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (n != y){
    		int[] bkd = new int[y];
    		for (int i = 0;i < y;i++){
    		    bkd[i] = sc.nextInt();
    		}
    		Arrays.sort(bkd);
    		int j = 0;
    		for (int i = 0;i < n/x;i++){
    		    int z = (i*x + x);
    		    int count = 0;
    		    while (j < y && bkd[j] <= z){
    		        count++;
    		        j++;
    		    }
    		    System.out.println(count);
    		}
		}else{
		    System.out.println("FULL");
		}
	}
}
