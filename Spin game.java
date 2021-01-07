
/*
Example Input/Output 1:
Input:
4
5 -4 -3 6
0
Output:
95 99 2 96
Explanation:
Here N = 4 and K = 0.
Initially, the top of the wheel indicates the integer 0.
After the 1st spin 5 (clockwise), the top of the wheel indicates 95.
After the 2nd spin -4 (counterclockwise), the top of the wheel indicates 99.
After the 3rd spin -3 (counterclockwise), the top of the wheel indicates 2.
After the 4th spin 6 (clockwise), the top of the wheel indicates 96.
Example Input/Output 2:
Input:
7 -10 -9 5 10 -1 -5 5
73
Output:
83 92 87 77 78 83 78
*/

import java.util.*;
public class Hello {

  public static void main(String[] args) {
  //Your Code Here
  Scanner sc = new Scanner(System.in);
  List<Integer> li = new ArrayList<Integer>();
  int x = sc.nextInt();
  int[] spins = new int[x];
  for(int i=0;i<x;i++)
  {
      spins[i] = sc.nextInt();
  }
  int k = sc.nextInt();
  for(int i=k;i<100;i++) li.add(i);
  for(int i=0;i<k;i++) li.add(i);
  for(int i=0;i<x;i++)
  {
      Collections.rotate(li,spins[i]);
      System.out.print(li.get(0)+" ");
  }
}
}

import java.util.*;
public class Hello {

  public static void main(String[] args) {
  //Your Code Here
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  a[i]=scan.nextInt();
  int k=scan.nextInt();
  for(int i=0;i<n;i++)
  {
      a[i]%=100;

      if(a[i]>0) k-=a[i];
      else k+=Math.abs(a[i]);

      if(k>99) k-=100;
      else if(k<0) k+=100;

      System.out.print(k+" ");
  }
}
}

import java.util.*;
public class Hello {

  public static void main(String[] args) {
  //Your Code Here
  Scanner sc=new Scanner(System.in);
  int i,j,k,n,x;
  n=sc.nextInt();
  int a[]=new int[n];
  for(i=0;i<n;i++){
      a[i]=sc.nextInt();
  }
  k=sc.nextInt();
  for(i=0;i<n;i++){
      if(a[i]>0){
          int t=a[i]%100;
          k-=t;
          if(k<0)    k=100+k;
          System.out.print(k+" ");
      }else{
          int t=a[i]*-1;
          t=t%100;
          k+=t;
          if(k>99)    k-=100;
          System.out.print(k+" ");
      }
  }
}
}
