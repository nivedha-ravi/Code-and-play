/*
Input:
11
92 86 84 80 75 71 68 65 51 50 21
Output:
163 92 157 121 155 122 151 136 146 139
Explanation:
Here N = 11, so the middle integer is 71 (6th integer).
The sum of 71 and the 1st integer is 163 (71+92).
The sum of 71 and the 11th integer is 92 (71+21).
The sum of 71 and the 2nd integer is 157 (71+86).
The sum of 71 and the 10th integer is 121 (71+50).
The sum of 71 and the 3rd integer is 155 (71+84).
The sum of 71 and the 9th integer is 122 (71+51).
The sum of 71 and the 4th integer is 151 (71+80).
The sum of 71 and the 8th integer is 136 (71+65).
The sum of 71 and the 5th integer is 146 (71+75).
The sum of 71 and the 7th integer is 139 (71+68).
Hence the output is 163 92 157 121 155 122 151 136 146 139
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
		    System.out.print((a[i]+a[mid])+" "+(a[n-i-1]+a[mid])+" ");
		}

	}
}
