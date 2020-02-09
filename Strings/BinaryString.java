package Strings;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String str=sc.next();
		char [] s=str.toCharArray();
		int n=str.length();
		while(t-->0)
		{System.out.println(substr(s,n));
		}

	}
	static int substr(char[] sd,int n)
	{
		int res=0;
		for(int i=0; i<n; i++)
		{
			if(sd[i]=='1')
				res++;
		}
		return res*((res-1)/2);
	}

}
