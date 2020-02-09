package Strings;

import java.util.Scanner;

public class Merginestrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			System.out.println(merge(s1,s2));
		}

	}
   static String merge(String s1,String s2)
   {
	   StringBuffer x=new StringBuffer();
	   for(int i=0; i<s1.length()|| i<s2.length(); i++)
	   {
		   if(i<s1.length())
		   {
			   x.append(s1.charAt(i));
		   }
		   if(i<s2.length())
		   {
			   x.append(s2.charAt(i));
		   }
	   }
	   return x.toString();
   }
}
