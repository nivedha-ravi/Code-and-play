/*
Example Input/Output 1:
Input:
5 8 10
Output:
eifkgmhojq
Explanation: The 26 lower case alphabets are abcdefghijklmnopqrstuvwxyz.
M = 5, N = 8 and K = 10.
Here we need to form a string of length 10.
1st alphabet of S = 5th lower case alphabet e. Now the remaining lower case alphabets are abcdfghijklmnopqrstuvwxyz.
2nd alphabet of S = 8th lower case alphabet i. Now the remaining lower case alphabets are abcdfghjklmnopqrstuvwxyz.
3rd alphabet of S = 5th lower case alphabet f. Now the remaining lower case alphabets are abcdghjklmnopqrstuvwxyz.
4th alphabet of S = 8th lower case alphabet k. Now the remaining lower case alphabets are abcdghjlmnopqrstuvwxyz.
Similarly, the remaining 6 alphabets of S are formed using the remaining lower case alphabets.
The string S is eifkgmhojq, which is printed as the output. 
Example Input/Output 2:
Input:
30 27 5
Output:
dbhfl
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<String> alpha=new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
		int m=in.nextInt();
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		while(count<k)
		{
		    System.out.print(alpha.remove((m-1)%alpha.size()));
		    count++;
		    if(count==k)
		    {
		        break;
		    }
		    else
		    {
		        System.out.print(alpha.remove((n-1)%alpha.size()));
		        count++;
		    }
		}

	}
}
