/*
Input:
SkillRack
Output:
FxvyyEnpx
Explanation:
The first half of the alphabets are a, b, c, d, e, f, g, h, i, j, k, l and m.
The second half of the alphabets are n, o, p, q, r, s, t, u, v, w, x, y and z.
After replacing the first half alphabet with the corresponding alphabet in the second half of the alphabets and vice versa, the string becomes FxvyyEnpx.
Hence the output is FxvyyEnpx
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String firsthalf="abcdefghijklm";
		String secondhalf="nopqrstuvwxyz";
		for(int i=0;i<s.length();i++)
		{
		    char str=s.charAt(i);
		    if(Character.isUpperCase(str))
		    {
		        if(firsthalf.indexOf(Character.toLowerCase(str))!=-1)
		        {
		            System.out.print(Character.toUpperCase(secondhalf.charAt(firsthalf.indexOf(Character.toLowerCase(str)))));
		        }
		        else
		        {
		            System.out.print(Character.toUpperCase(firsthalf.charAt(secondhalf.indexOf(Character.toLowerCase(str)))));
		        }
		    }
		    else if(Character.isLowerCase(str))
		    {
		        if(firsthalf.indexOf(str)!=-1)
		        {
		            System.out.print(secondhalf.charAt(firsthalf.indexOf(str)));
		        }
		        else
		        {
		            System.out.print(firsthalf.charAt(secondhalf.indexOf(str)));
		        }
		    }
		    if(str==' ')
		    {
		        System.out.print(" ");
		    }
		}


	}
}
