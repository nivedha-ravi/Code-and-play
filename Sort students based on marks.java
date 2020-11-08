/*
Example Input/Output 1:
Input:
4
xxyz 85 99 86
stuuuv 91 92 100
efggg 85 99 72
aabbcc 91 92 100
Output:
aabbcc 91 92 100
stuuuv 91 92 100
xxyz 85 99 86
efggg 85 99 72
Explanation:
The students stuuuv and aabbcc scored the same marks in Maths, Physics and Chemistry (91, 92, 100).
So they are sorted based on their names in ascending order.
The students xxyz and efggg scored the same marks in Maths and Physics (85, 99).
So they are sorted in descending order based on the marks in Chemistry.
Hence the output is
aabbcc 91 92 100
stuuuv 91 92 100
xxyz 85 99 86
efggg 85 99 72
Example Input/Output 2:
Input:
5
Pppqrs 93 85 76
Xyzz 83 95 64
Mnnnno 83 100 89
Ijjkkk 83 95 79
Abcd 93 85 76
Output:
Abcd 93 85 76
Pppqrs 93 85 76
Mnnnno 83 100 89
Ijjkkk 83 95 79
Xyzz 83 95 64
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[] name=new String[n];
	    int[] maths=new int[n];
	    int[] physics=new int[n];
	    int[] chem=new int[n];
	    for(int i=0;i<n;i++){
	        name[i]=sc.next();
	        maths[i]=sc.nextInt();
	        physics[i]=sc.nextInt();
	        chem[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(maths[i]<maths[j]){
	                String a=name[i];
	                name[i]=name[j];
	                name[j]=a;

	                int t=maths[i];
	                maths[i]=maths[j];
	                maths[j]=t;

	                int p=physics[i];
	                physics[i]=physics[j];
	                physics[j]=p;

	                int q=chem[i];
	                chem[i]=chem[j];
	                chem[j]=q;
	            }else if(maths[i]==maths[j]){
	                if(physics[i]<physics[j]){
	                    String a=name[i];
	                    name[i]=name[j];
	                    name[j]=a;

                      int t=physics[i];
	                    physics[i]=physics[j];
	                    physics[j]=t;

                      int p=chem[i];
	                    chem[i]=chem[j];
	                    chem[j]=p;
	                }else if(physics[i]==physics[j]){
	                    if(chem[i]<chem[j]){
	                       String a=name[i];
	                       name[i]=name[j];
	                       name[j]=a;

                         int t=chem[i];
	                       chem[i]=chem[j];
	                       chem[j]=t;
	                    }else if(chem[i]==chem[j]){
	                        if(name[i].compareTo(name[j])>0){
	                            String a=name[i];
	                            name[i]=name[j];
	                            name[j]=a;
	                        }
	                    }
	                }
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        System.out.println(name[i]+" "+maths[i]+" "+physics[i]+" "+chem[i]);
	    }
    }
}
