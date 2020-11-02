/*
Example Input/Output 1:
Input:
4 5 3 11 20
Output:
25
Explanation: The three possible ways to select the boxes are given below. 5, 11 5, 20 3, 20 The maximum number of fruits that the customer can get is 25 (5 + 20). So 25 is printed as the output. Example Input/Output 2: Input: 7 10 20 15 1 9 12 2 Output: 37import java.util.*;
*/
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=in.nextInt();
int t1=arr[0];
int t2=0;
int max=0;
for(int i=1;i<n;i++)
{
int curr=t1>t2?t1:t2;
t1=t2+arr[i];
t2=curr;
}
System.out.println((t1>t2)?t1:t2);
	}
}
