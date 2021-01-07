/*
Example Input/Output 1:
Input:
12:35:49
Output:
HH:MM:SS
#0 #0 #1
#0 01 10
01 10 00
10 11 01
Explanation:
The given time T is 12:35:49.
The 1st column represents the digit 1. So the hyphens in the 1st column are replaced with the binary representation of 1 (##01).
The 2nd column represents the digit 2. So the hyphens in the 2nd column are replaced with the binary representation of 2 (0010).
The 3rd column represents the digit 3. So the hyphens in the 3rd column are replaced with the binary representation of 3 (#011).
The 4th column represents the digit 5. So the hyphens in the 4th column are replaced with the binary representation of 5 (0101).
The 5th column represents the digit 4. So the hyphens in the 5th column are replaced with the binary representation of 4 (#100).
The 6th column represents the digit 9. So the hyphens in the 6th column are replaced with the binary representation of 9 (1001).
Example Input/Output 2:
Input:
00:15:59
Output:
HH:MM:SS
#0 #0 #1
#0 01 10
00 00 00
00 11 11
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        String a=Integer.toBinaryString(Integer.parseInt(s[0]+""));
        String b=Integer.toBinaryString(Integer.parseInt(s[1]+""));
        String c1=Integer.toBinaryString(Integer.parseInt(s[3]+""));
        String d=Integer.toBinaryString(Integer.parseInt(s[4]+""));
        String e=Integer.toBinaryString(Integer.parseInt(s[6]+""));
        String f=Integer.toBinaryString(Integer.parseInt(s[7]+""));
        char c[][]=new char[4][6];
        for(int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                c[i][j]='0';
            }
        }
        c[0][0]='#';c[1][0]='#';c[0][2]='#';c[0][4]='#';
        int k=a.length()-1,q=3;
        while(k>=0){
            c[q--][0]=a.charAt(k--);
        }
        k=b.length()-1;q=3;
        while(k>=0){
            c[q--][1]=b.charAt(k--);
        }
        k=c1.length()-1;q=3;
        while(k>=0){
            c[q--][2]=c1.charAt(k--);
        }
        k=d.length()-1;q=3;
        while(k>=0){
            c[q--][3]=d.charAt(k--);
        }
        k=e.length()-1;q=3;
        while(k>=0){
            c[q--][4]=e.charAt(k--);
        }
        k=f.length()-1;q=3;
        while(k>=0){
            c[q--][5]=f.charAt(k--);
        }
        System.out.println("HH:MM:SS");
        for(int i=0;i<4;i++,System.out.println()){
            for(int j=0;j<6;j++){
                if(j%2!=0) System.out.print(c[i][j]+" ");
                else System.out.print(c[i][j]);
            }
        }
	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length(),k=0;
		char[][] mat=new char[4][6];
		for(int i=0;i<4;i++){
		    for(int j=0;j<6;j++){
		        if(i==0&&j%2==0||i==1&&j==0){
		            mat[i][j]='#';
		        }else{
		            mat[i][j]='-';
		        }
		    }
		}
		for(int i=0;i<6;i++){
		    int num=0;
		    if(s.charAt(k)==':'){
		        k++;
		    }
		    num=s.charAt(k)-'0';
		    k++;
		    String a=Integer.toBinaryString(num);
		    int p=a.length()-1;
		    for(int j=3;j>=0;j--){
		        if(mat[j][i]=='-'){
		            if(p<0){
		                mat[j][i]='0';
		            }else{
		              mat[j][i]=a.charAt(p);
		              p--;
		            }
		        }
		    }
		}
		System.out.println("HH:MM:SS");
		for(int i=0;i<4;i++){
		    for(int j=0;j<6;j++){
		        System.out.print(mat[i][j]);
		        if(j%2==1){
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		char[][] time = new char[4][6];
		String val = sc.next();
		int col=0;
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<6;j++)
		    {
		        time[i][j]='0';
		    }
		}
		for(int i=0;i<val.length();i++)
		{
		    if(val.charAt(i)!=':')
		    {
		        int digit = Integer.parseInt(val.charAt(i)+"");
		        String bin = Integer.toBinaryString(digit);
		        //System.out.println(bin);
		        int len = bin.length()-1;
		        for(int j=3;j>=0;j--)
		        {
		            //System.out.println("hi");
		            time[j][col] = bin.charAt(len--);
		            if(len<0)break;
		        }
		        col++;
		    }
		}
		time[0][0]='#';
		time[0][2]='#';
		time[0][4]='#';
		time[1][0]='#';
		System.out.println("HH:MM:SS");
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<6;j+=2)
		    {
		        System.out.print(time[i][j]+""+time[i][j+1]+" ");
		    }
		    System.out.println();
		}
	}
}
