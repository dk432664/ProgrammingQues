package Strings;

import java.util.Scanner;

public class RearrangeString {
    static final int MAX_CHAR=26;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			String sa=sc.next();
			System.out.print(rearrange(sa));
			
		}
		System.out.println();
		

	}
	static String  rearrange(String s)
	{
		int char_count[]=new int[MAX_CHAR];
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			// Count occurrence of uppercase alphabets 
			if(Character.isUpperCase(s.charAt(i))==true)
			{
				char_count[s.charAt(i)-'A']++;
			}
			else
			{
				sum+=(s.charAt(i)-'0');
			}
			
		}
		String res="";
		// Traverse for all characters A to Z 
		for(int i=0; i<MAX_CHAR; i++)
		{
			char ch=(char)('A'+i);
			 // Append the current character 
            // in the string no. of times it 
            //  occurs in the given string 
			while(char_count[i]--!=0)
			{
				res=res+ch;
			}
		}
			 // Append the sum of integers 
			if(sum>0)
			{
				res+=sum;
			}
			
		
		return res;
	}

}
