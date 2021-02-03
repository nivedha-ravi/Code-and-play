/*
Input:
3 3
5
1r 3c 2r2c 1r 2c
Output:
2 3 3
0 2 1
0 1 1
Explanation:
Here Q=5, the given 5 queries are
1r 3c 2r2c 1r 2c
The 1st query is 1r, so the integers in the 1st row are incremented.
The 2nd query is 3c, so the integers in the 3rd column are incremented.
The 3rd query is 2r2c, so the integer in the 2nd row and 2nd column is incremented.
The 4th query is 1r, so the integers in the 1st row are incremented.
The 5th query is 2c, so the integers in the 2nd column are incremented. After processing the 5 queries, the matrix becomes 2 3 3 0 2 1 0 1 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt(),c = sc.nextInt();
	    int n = sc.nextInt();
	    int[][] a = new int[r][c];
	    sc.nextLine();
	    for(int i = 0;i < n; i++) {
	        String s = sc.next(),temp = "";
	        int row = 0,col = 0;
	        String[] s1 = s.split("[0-9]");
	        String[] s2 = s.split("[a-z]");
	        for(String str : s1)
	        temp += str;
	        if(temp.equals("r")) {
	            row = Integer.parseInt(s2[0]);
	            for(int k = 0;k < c;k++)
	            a[row-1][k]++;
	        }else if(temp.equals("c")) {
	            col = Integer.parseInt(s2[0]);
	            for(int k = 0; k < r; k++)
	            a[k][col-1]++;
	        }else if(temp.equals("rc")) {
	            row = Integer.parseInt(s2[0]);
	            col = Integer.parseInt(s2[1]);
	            a[row-1][col-1]++;
	        }else {
	            row = Integer.parseInt(s2[1]);
	            col = Integer.parseInt(s2[0]);
	            a[row-1][col-1]++;
	        }

	    }
	    for(int i = 0;i < r; i++) {
	        for(int j = 0;j < c; j++)
	        System.out.print(a[i][j]+" ");
	        System.out.println();
	    }


	}
}
