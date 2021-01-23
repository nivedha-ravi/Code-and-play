/*
Input: 5 3 2
2 3 6 10 15
Output:
2 3 6 10 11 15 19
Explanation:
T = 1, the sum of integers in the first subarray of size 3 is 11 (2 + 3 + 6). After inserting 11 in the sorted array, the array becomes 2 3 6 10 11 15.
T = 2, the sum of integers in the second subarray of size 3 is 19 (3 + 6 + 10). After inserting 19 in the sorted array, the array becomes 2 3 6 10 11 15 19.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++) {
            arr.add(s.nextInt());
        }
        for(int i=0;i<b;i++) {
            sum1=0;
            for(int j=i;j<a+i;j++) {
                sum1+=arr.get(j);
            }
            arr.add(sum1);
            Collections.sort(arr);
        }
        for(int i:arr)
        System.out.print(i+" ");


	}
}
