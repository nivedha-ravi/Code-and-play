/*
The program must accept the list of team names participating in a cricket tournament. The character q or Q in the input represents the end of the team list. Each team must play exactly one game against the other teams. The program must print the string value "Total Matches: " followed by the total number of matches possible excluding the semi-final and the final. Then the program must print the pairing of teams in the order of their occurrence as the output.
Input:
Chennai
Mumbai
Delhi
Kolkata
Q
Output:
Total Matches: 6
Chennai vs Mumbai
Chennai vs Delhi
Chennai vs Kolkata
Mumbai vs Delhi
Mumbai vs Kolkata
Delhi vs Kolkata
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=new String[13];
		int k=0,count=0;
		do
		{
		    s[k++]=in.next();
		}
		while(!(s[k-1].equals("Q")||s[k-1].equals("q")));
		ArrayList<String> first=new ArrayList<String>();
		ArrayList<String> last=new ArrayList<String>();
		for(int i=0;i<k-1;i++)
		{
		    for(int j=i+1;j<k-1;j++)
		    {
		        first.add(s[i]);
		        last.add(s[j]);
		        count++;
		    }
		}
		System.out.println("Total Matches: "+count);
		for(int i=0;i<count;i++)
		{
		    System.out.println(first.get(i)+" vs "+last.get(i));
		}



	}
}
