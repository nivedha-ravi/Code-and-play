/*
Input:
4 6
A B A A B B
A A A A A A
B B A A A A
A A A A B A
Output:
- - - A A A
A A A A A A
- - A A A A
- A A A A A
Explanation:
After removing all the occurrences of B, the empty cells are replaced with hyphens.
A - A A - -
A A A A A A
- - A A A A
A A A A - A
After shifting the occurrences of A to the right, the matrix becomes
- - - A A A
A A A A A A
- - A A A A
- A A A A A
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		for(int i=0;i<r;i++)
		{
		    int count=0;
		    for(int j=0;j<c;j++)
		    {
		        char ch=in.next().charAt(0);
		        if(ch=='A')
		        {
		            count++;
		        }
		    }
		    int diff=c-count;
		    System.out.println("- ".repeat(diff)+""+"A ".repeat(count));
		}

	}
}
