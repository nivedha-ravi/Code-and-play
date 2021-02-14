/*
Input: 6 13 45 67 89 40 24 Output: 40 8 Explanation: The given 6 integers are 13, 45, 67, 89, 40 and 24. The factors of 13 are 1 and 13. So the count is 2. The factors of 45 are 1, 3, 5, 9, 15 and 45. So the count is 6. The factors of 67 are 1 and 67. So the count is 2. The factors of 89 are 1 and 89. So the count is 2. The factors of 40 are 1, 2, 4, 5, 8, 10, 20 and 40. So the count is 8. The factors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24. So the count is 8. The integers with the maximum number of factors are 40 and 24. The first occurring integer is 40. Hence the output is 40 8
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int maxnum=0,max=0;
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    int c=0;
		    for(int j=1;j<=num;j++)
		    {
		        if(num%j==0)
		        {
		            c++;
		        }
		    }
		    if(c>max)
		    {
		        max=c;
		        maxnum=num;
		    }
		}
		System.out.print(maxnum+" "+max);

	}
}
