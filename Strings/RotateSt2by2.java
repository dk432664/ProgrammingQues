package Strings;

import java.util.Scanner;

public class RotateSt2by2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			System.out.println(rotate(s1,s2));
			
		}

	}
	static boolean rotate(String a,String b)
	{
		if(a.length()!=b.length())
		{
			return false;
		}
		int n=b.length();
		String clock="";
		String anti="";
		clock+=b.substring(2)+b.substring(0,2);
		anti+=b.substring(n-2,n)+b.substring(0,n-2);
		return (a.equals(clock)|| a.equals(anti));
		
	}

}
