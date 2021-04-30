/*
Input:
4
Chennai Super Kings - M. A. Chidambaram Stadium
Kolkata Knight Riders - Eden Gardens
Mumbai Indians - Wankhede Stadium
Royal Challengers Bangalore - M. Chinnaswamy Stadium
Output:
Chennai Super Kings vs Kolkata Knight Riders (M. A. Chidambaram Stadium)
Kolkata Knight Riders vs Chennai Super Kings (Eden Gardens)
Chennai Super Kings vs Mumbai Indians (M. A. Chidambaram Stadium)
Mumbai Indians vs Chennai Super Kings (Wankhede Stadium)
Chennai Super Kings vs Royal Challengers Bangalore (M. A. Chidambaram Stadium)
Royal Challengers Bangalore vs Chennai Super Kings (M. Chinnaswamy Stadium)
Kolkata Knight Riders vs Mumbai Indians (Eden Gardens)
Mumbai Indians vs Kolkata Knight Riders (Wankhede Stadium)
Kolkata Knight Riders vs Royal Challengers Bangalore (Eden Gardens)
Royal Challengers Bangalore vs Kolkata Knight Riders (M. Chinnaswamy Stadium)
Mumbai Indians vs Royal Challengers Bangalore (Wankhede Stadium) 
Royal Challengers Bangalore vs Mumbai Indians (M. Chinnaswamy Stadium)
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		String[] t=new String[n];
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
		    String str=in.nextLine();
		    t[i]=str.split(" - ")[0];
		    s[i]=str.split(" - ")[1];
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        System.out.println(t[i]+" vs "+t[j]+" ("+s[i]+")");
		        System.out.println(t[j]+" vs "+t[i]+" ("+s[j]+")");
		    }
		}

	}
}
