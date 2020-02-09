package Strings;

import java.util.Scanner;

public class longestSubstringcontain1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int l=0,m=0;
			String s1=sc.next();
	         for(int i=0; i<s1.length(); i++)
	         {
	        	 if(s1.charAt(i)=='1')
	        	 {
	        		 l++;
	        	 }
	        	 else
	        	 {
	        		 m=Math.max(l, m);
	        		 l=0;
	        	 }
	         }
	         System.out.println(Math.max(l, m));

	}
	}
}
