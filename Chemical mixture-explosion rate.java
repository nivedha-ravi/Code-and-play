/*
In a high energy materials research laboratory, there is a stand containing two rows. Each row has N chemicals. Each chemical has some explosion rate. The scientists have decided to combine the two chemicals to create a very powerful bomb. The explosion rate of the mixture is the product of their respective explosion rates. The way of mixing the chemicals is given below. - The scientists reverse the positions of the chemicals in the second row. - Then they mix each chemical from the first row with the corresponding chemical in the second row. - If the explosion rate of a mixture is negative, they will not mix those two chemicals. The program must accept the explosion rates of the 2*N chemicals as the input. The program must print the sum of the explosion rates of all the mixtures as the output.
Input:
5
5 1 -5 4 -6
-2 9 5 -8 2
Output:
58
Explanation:
Here N = 5. The explosion rates of the 5 chemicals in the first row are 5 1 -5 4 -6. The explosion rates of the 5 chemicals in the second row are -2 9 5 -8 2. After reversing the positions of the chemicals in the second row, they become 2 -8 5 9 -2. The 5 possible mixtures and their explosion rate are given below. 5 * 2 = 10 1 * -8 = -8 -5 * 5 = -25 4 * 9 = 36 -6 * -2 = 12 The 2nd and 3rd mixtures give the negative explosion rate. So they are not considered. The total explosion rate = 58 (10 + 36 + 12). So 58 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    b[i]=in.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
		    int temp=b[i];
		    b[i]=b[n-i-1];
		    b[n-i-1]=temp;
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    if(a[i]*b[i]>=0)
		    {
		        sum+=a[i]*b[i];
		    }
		}
		System.out.print(sum);

	}
}
