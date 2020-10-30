/*
Example Input/Output 1:
Input:
6
Abc 2001
XYZ 1997
pqr 2002
Abc 2010
Abc 2006
Efg 2002
Output:
Abc 2010
Efg 2002
pqr 2002
XYZ 1997
Explanation:
The book Abc has three editions.
The first edition was published in 2001, the second edition was published in 2006 and the third edition was published in 2010.
So the most recently published book (Abc 2010) is considered.
The book XYZ was published in 1997.
The book pqr was published in 2002.
The book Efg was published in 2002.
After sorting the books based on the given conditions, the books become
Abc 2010
Efg 2002
pqr 2002
XYZ 1997
Example Input/Output 2:
Input:
5
IJK 1996
IJK 2011
IJK 2006
pqr 2010
IJK 2010
Output:
IJK 2011
pqr 2010
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String bo[]=new String[n];
        int yr[]=new int[n];
        for(int i=0;i<n;i++){
            bo[i]=sc.next();
            yr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(yr[j-1]<yr[j]){
                    int t=yr[j-1];
                    yr[j-1]=yr[j];
                    yr[j]=t;
                    String s=bo[j-1];
                    bo[j-1]=bo[j];
                    bo[j]=s;
                }else if(yr[j-1]==yr[j] && !(bo[j-1].equals(bo[j]))){
                    if(bo[j-1].compareTo(bo[j])>0){
                        int y=yr[j-1];
                        yr[j-1]=yr[j];
                        yr[j]=y;
                        String h=bo[j-1];
                        bo[j-1]=bo[j];
                        bo[j]=h;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(bo[i]!="*"){
            for(int j=i+1;j<n;j++){
                if(bo[i].equals(bo[j])){
                    bo[j]="*";
                }
            }}
        }
        for(int i=0;i<n;i++){
            if(bo[i]!="*")
            System.out.println(bo[i]+" "+yr[i]);
        }
	}
}
