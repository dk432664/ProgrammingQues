package Strings;

import java.util.Scanner;

public class ConsecutiveElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			
			System.out.print(s.charAt(0));
			for(int i=1; i<s.length(); i++)
			{
				if(s.charAt(i)==s.charAt(i-1))
				{
					continue;
				}
				else
				{
					System.out.print(s.charAt(i));
				}
			}

	}

}
}