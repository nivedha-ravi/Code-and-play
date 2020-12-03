/*
Example Input/Output 1:
Input:
6 5
S K q J l
P L M b F
F s F J D
i b P b r
s q A n Z
D a A O j
shopping
Output:
S K p J l
P L i b F
F s n J D
i h g b r
s o A n Z
D p A O j
Explanation:
Here S = shopping.
The position of the first occurrence of the first character of S is (3, 2).
After replacing the characters from the position (3, 2) with the characters of S, the matrix becomes
S K p J l
P L i b F
F s n J D
i h g b r
s o A n Z
D p A O j
Example Input/Output 2:
Input:
3 3
t S l
S e e
F N i
SkillRack
Output:
a S l
c k l
k i R
Example Input/Output 3:
Input:
4 5
a S r p k
Y I D k F
h O m x w
j i Q h p
window
Output:
n S r p k
d I D k F
o O m x w
w i Q h i
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),r=0,c=0,k=0,y=0,l=0,p=0;
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        char b[]=sc.next().toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==b[0]) {
                    r=i;c=j;y=1;
                    break;
                }
            }
            if(y==1) break;
        }
        for(int i=r;i<n;i++){
            a[i][c]=b[k++];
            if(k==b.length-1) {
                l=1;break;
            }
        }
        if(l==0){
            for(int i=c+1;i<m;i++){
                for(int j=0;j<n;j++){
                    if(k==b.length) {
                        p=1;break;
                    }
                    a[j][i]=b[k++];
                }
                if(p==1) break;
            }
            if(p==0){
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(k==b.length) {
                            p=1;break;
                        }
                        a[j][i]=b[k++];
                    }
                    if(p==1) break;
                }
            }
        }
        for(int i=0;i<n;i++,System.out.println()){
          for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
        }
	  }
}
