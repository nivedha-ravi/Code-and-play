/*
Input:
5
-2 3 -4 1 -5
Output:
8
Explanation:
If the person has 8 health points initially, 1st day -> The person's health is decreased by 2 points. Now the person has 6 health points.
2nd day -> The person's health is increased by 3 points. Now the person has 9 health points.
3rd day -> The person's health is decreased by 4 points. Now the person has 5 health points.
4th day -> The person's health is increased by 1 point. Now the person has 6 health points.
5th day -> The person's health is decreased by 5 points. Now the person has 1 health point.
There is no negative health points (including 0) when testing the medicine for 5 days.
If the person has 7 health points initially, 1st day -> The person's health is decreased by 2 points. Now the person has 5 health points.
2nd day -> The person's health is increased by 3 points. Now the person has 8 health points.
3rd day -> The person's health is decreased by 4 points. Now the person has 4 health points.
4th day -> The person's health is increased by 1 point. Now the person has 5 health points.
5th day -> The person's health is decreased by 5 points. Now the person has 0 health point.
The health point becomes 0 on the 5th day. The minimum health points that the person should initially have is 8.
Example Input/Output 2:
Input:
8
-5 2 1 -3 -5 2 3 5
Output:
11
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=in.nextInt();
int i=1;
while(true)
{
    int j=i;
    for(int k=0;k<n;k++)
    {
    j+=arr[k];
    if(j<=0)
    break;
    }
    //System.out.println(j);
    if(j>0)
    {
    System.out.println(i);
    break;
    }
    i++;
}
	}
}



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
        for(int i=1;;i++){
            int num=i,f=0;
            for(int j=0;j<n;j++){
                num+=arr[j];
                if(num<=0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.print(i);
                return;
            }
        }
	}
  }
