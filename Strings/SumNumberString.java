package Strings;

import java.util.Scanner;

public class SumNumberString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		
		
		while(t-->0)
		{
			String s= sc.next();
				int res=findsum(s);
			
			System.out.println(res);
		}
	}
	static int findsum(String s)
	{
		String s2=" ";
		int sum=0;
		for(int j=0; j<s.length(); j++)
		{
			// if current character is a digit 
			if(Character.isDigit(s.charAt(j))==true)
			{
				s2+=s.charAt(j);
			}
			// if current character is an alphabet  
			else
			{
				sum+=Integer.parseInt(s2);
				s2=" ";
			}
			
			
				
			}
		return sum+Integer.parseInt(s2);
         }
		
}

