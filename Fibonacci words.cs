/*
Input:
6
Output:
a b ba bab babba babbabab
*/
using System;

namespace Hello
{
	class Hello
	{
		public static void Main (string[] args)
		{
			int n=Convert.ToInt32(Console.ReadLine());
			string n1="a",n2="b",n3="";
		    Console.Write((n==1)?n1+" ":n1+" "+n2+" ");
			for(int i=2;i<n;i++)
			{
			    n3=n2+n1;
			    Console.Write(n3+" ");
			    n1=n2;
			    n2=n3;
			}
		}
	}
}
