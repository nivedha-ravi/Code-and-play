/*
A physical fitness test (running test) is conducted to select candidates for military training in a country. A batch of 3 candidates appearing for the running test on track for 3 rounds. The program must accept 9 integers indicating the oxygen level after each round for 3 candidates as the input. For each candidate, the program must calculate the average oxygen level over the 3 rounds. The candidate who has the highest average oxygen level is the most fit candidate. The program must print the string value "Candidate Number: " followed by the most fit candidate's number as the output. If more than one trainee attains the same highest average level, they all need to be printed.
Input:
96
93
96
93
91
93
91
93
91
Output:
Candidate Number: 1
Candidate Number: 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;
		for(int i=1;i<=9;i++)
		{
		    int num=in.nextInt();
		    if(i==1||i==4||i==7)
		    {
		        sum1+=num;
		    }
		    else if(i==2 || i==5 || i==8)
		    {
		        sum2+=num;
		    }
		    else if(i==3||i==6||i==9)
		    {
		        sum3+=num;
		    }
		}
		int maxsum=((sum1>=sum2 && sum1>=sum3)?sum1:(sum2>=sum1 && sum2>=sum3)?sum2:sum3);
		if(sum1==maxsum)
		{
		    System.out.println("Candidate Number: 1");
		}
		if(sum2==maxsum)
		{
		    System.out.println("Candidate Number: 2");
		}
		if(sum3==maxsum)
		{
		    System.out.println("Candidate Number: 3");
		}

	}
}
