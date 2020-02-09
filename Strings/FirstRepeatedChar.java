package Strings;

import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		String s=sc.next();
		first(s);
		
	}

	}
	static void  first(String sa)
	{ int i;
		for( i=0; i<sa.length(); i++)
		{
			if(sa.charAt(i)==sa.charAt(i+1))
			
				break;
		}	
			
			
		
		 System.out.print((sa.charAt(i+1)));
	}

}
