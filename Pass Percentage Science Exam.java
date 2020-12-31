/*
Example Input/Output 1:
Input:
10
M 50 25
M 32 15
F 65 24
M 75 25
F 40 10
F 45 17
M 25 10
M 37 12
M 60 21
F 72 25
Output:
60.00
50.00
75.00
Explanation:
Total number of students = 10.
Total number of male students = 6.
Total number of female students = 4.
M 50 25 -> Pass
M 32 15 -> Fail
F 65 24 -> Pass
M 75 25 -> Pass
F 40 10 -> Fail
F 45 17 -> Pass
M 25 10 -> Fail
M 37 12 -> Fail
M 60 21 -> Pass
F 72 25 -> Pass
The number of students passed in the exam = 6.
The number of male students passed in the exam = 3.
The number of female students passed in the exam = 3.
The overall pass percentage is 60.00 which is printed in the first line.
The pass percentage of male students is 50.00 which is printed in the second line.
The pass percentage of female students is 75.00 which is printed in the third line.
Example Input/Output 2:
Input:
5
M 51 12
F 46 22
M 29 18
M 38 13
M 41 19
Output:
60.00
50.00
100.00
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int malepass=0,femalepass=0,pass=0,female=0,male=0,total=n;
		while(n>=1)
		{
		    char ch=in.next().charAt(0);
		    int t=in.nextInt();
		    int e=in.nextInt();
		    if(t>=38 && e>=13)
		    {
		        pass+=1;
		        if(ch=='M')
		        {
		            malepass+=1;
		        }
		        else if(ch=='F')
		        {
		            femalepass+=1;
		        }
		    }
		    if(ch=='M')
		    {
		        male++;
		    }
		    else
		    {
		        female++;
		    }
		    n--;
		}
		float p=pass/(float)(total);
		float m=malepass/(float)(male);
		float f=femalepass/(float)(female);
		System.out.printf("%.2f\n",p*100);
		System.out.printf("%.2f\n",m*100);
		System.out.printf("%.2f\n",f*100);

	}
}
