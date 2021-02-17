/*
Input:
Kohli 59.3
Dhawan 45.1
Prithvi 28.0
Rahane 35.3
Rahul 47.6
Manish 35.1
Shreyas 49.9
Rishabh 26.7
Hardik 29.9
Jadeja 31.9
Bumrah 3.8
Bhuvneshwar 14.2
Output:
Kohli 59.3
Shreyas 49.9
Rahul 47.6
Dhawan 45.1
Rahane 35.3
Manish 35.1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s[]=new String[12];
		double a[]=new double[12];
	    for(int i=0;i<12;i++)
	    {
	        s[i]=in.next();
	        a[i]=in.nextDouble();
	    }
	    for(int i=0;i<12;i++)
	    {
	        for(int j=i+1;j<12;j++)
	        {
	            if(a[i]<a[j])
	            {
	            String temp=s[i];
	            s[i]=s[j];
	            s[j]=temp;
	            double c=a[i];
	            a[i]=a[j];
	            a[j]=c;
	            }
	        }
	        if(i<6)
	        {
	            System.out.println(s[i]+" "+a[i]);
	        }
	    }

	}
}
