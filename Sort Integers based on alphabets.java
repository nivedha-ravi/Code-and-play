/*
Input: 5 10c 34b93 4c33 54a2 f4478 Output: 542 3493 10 433 4478 Explanation: The given integers are 10(c), 3493(b) , 433(c), 542(a) and 4478(f). After sorting the integers based on the given conditions, the integers become 542 3493 10 433 4478 So they are printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char alpha[]=new char[n];
		int numeric[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    String num="";
		    for(int j=0;j<s.length();j++)
		    {
		        if(Character.isAlphabetic(s.charAt(j)))
		        {
		            alpha[i]=s.charAt(j);
		        }
		        else
		        {
		            num+=s.charAt(j);
		        }
		    }
		    numeric[i]=Integer.parseInt(num);
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(alpha[i]>alpha[j])
		        {
		            char ch=alpha[i];
		            alpha[i]=alpha[j];
		            alpha[j]=ch;
		            int temp=numeric[i];
		            numeric[i]=numeric[j];
		            numeric[j]=temp;
		        }
		        else if(alpha[i]==alpha[j])
		        {
		            if(numeric[i]>numeric[j])
		            {
		                int temp=numeric[i];
		                numeric[i]=numeric[j];
		                numeric[j]=temp;
		            }
		        }
		    }
		    System.out.print(numeric[i]+" ");
		}

	}
}
