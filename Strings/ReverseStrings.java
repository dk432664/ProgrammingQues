package Strings;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String str=sc.next();
		char [] s=str.toCharArray();
		//int n=str.length();
		int n=s.length;
		while(t-->0)
		{
			for(int i=n-1; i>=0; i--)
			{
				System.out.print(s[i]);
			}
			System.out.println();
			//System.out.println(substr(s,n));
		}

	}

}
