/*
Example Input/Output 1:
Input:
NNNNWWWWWSSSEEEEE
Output:
YES
Explanation:
Here S="NNNNWWWWWSSSEEEEE". Initially, the robot is present at the centre (0, 0). N -> (0, 1) N -> (0, 2) N -> (0, 3) N -> (0, 4) W -> (-1, 4) W -> (-2, 4) W -> (-3, 4) W -> (-4, 4) W -> (-5, 4) S -> (-5, 3) S -> (-5, 2) S -> (-5, 1) E -> (-4, 1) E -> (-3, 1) E -> (-2, 1) E -> (-1, 1) E -> (0, 1) Here the robot crosses its path at (0, 1). So YES is printed as the output.
Example Input/Output 2:
Input:
EEENNNNNNWWWWWSSSSWWWW
Output:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int X[]=new int[ch.length];
		int Y[]=new int[ch.length];
		int x1=0;
		int y1=0;
		int t=0;
		int n=ch.length;
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='N')
		    {
		        y1++;
		    }
		    else if(ch[i]=='S')
		    {
		        y1--;
		    }
		    else if(ch[i]=='E')
		    {
		        x1++;
		    }
		    else if(ch[i]=='W')
		    {
		        x1--;

		    }
		    X[i]=x1;
		    Y[i]=y1;
		}
		for(int i=0;i<n;i++)
		{

		    for(int j=0;j<n;j++)
		    {
		        if(i==j)
		        continue;
		        if(X[i]==X[j] && Y[i]==Y[j])
		        t++;

		    }
		    if(X[i]==0 && Y[i]==0)
		    t++;
		}
		if(t>0)
		System.out.print("YES");
		else
		System.out.print("NO");

	}
}



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		int x=0,y=0,ind=1;
		String[] strs = new String[path.length()+1];
		strs[0]="0-0";
		for(char ch:path.toCharArray()){
		    switch(ch){
		        case 'N':
		            y++;
		            break;
		        case 'S':
		            y--;
		            break;
		        case 'W':
		            x--;
		            break;
		        case 'E':
		            x++;
		        default :
		            break;
		    }
		    strs[ind++]=x+"-"+y;
		}
		for(String str:strs){
		    if(Collections.frequency(Arrays.asList(strs),str)>1)
		    {
		        System.out.print("YES");
		        System.exit(0);
		    }
		}
		System.out.print("NO");
	}
}
