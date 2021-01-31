/*
Input:
5
Efg Def
Ijk Xyz
Mno Abc
Pqr Abc
Stu Def
Output:
3
Abc 2
Def 2
Xyz 1
Explanation:
The persons Efg and Stu belong to the family Def. The person Ijk belongs to the family Xyz. The persons Mno and Pqr belong to the family Abc. The total number of families is 3. So it is printed in the first line. After sorting the families based on the given conditions, their names and the number of persons are printed as the output. Abc 2 Def 2 Xyz 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String f[]=new String[n];
		String l[]=new String[n];
		int fam[]=new int[n];
		String fami[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    f[i]=in.next();
		    l[i]=in.next();
		}
		int k=0,p=0;
		for(int i=0;i<n;i++)
		{
		    int c=1;
		    for(int j=i+1;j<n;j++)
		    {
		        if(l[i].equals(l[j]))
		        {
		            c++;
		            l[j]="";
		        }
		    }
		    if(!l[i].equals(""))
		    {
		        fami[k++]=l[i];
		        fam[p++]=c;
		    }

		}
		System.out.println(k);
		for(int i=0;i<k;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(fam[i]<fam[j])
		        {
		            int temp=fam[i];
		            fam[i]=fam[j];
		            fam[j]=temp;
		            String t=fami[i];
		            fami[i]=fami[j];
		            fami[j]=t;
		        }
		        else if(fam[i]==fam[j])
		        {
		            if(fami[i].compareTo(fami[j])>0)
		            {
		                String t=fami[i];
		                fami[i]=fami[j];
		                fami[j]=t;
		            }
		        }
		    }
		    System.out.println(fami[i]+" "+fam[i]);
		}

	}
}
