package Strings;

import java.util.Scanner;

public class Substringwithequalend {
	final static int  MAX_CHAR=26;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			String sa=sc.next();
			System.out.println(subsequence(sa));
		}

	}
    static int subsequence(String s)
    {
    	int res=0;
    	int count[]=new int[MAX_CHAR];
    	for(int i=0; i<s.length(); i++)
    	{
    		count[s.charAt(i)-'a']++;
    	}
    	for(int i=0;i<MAX_CHAR; i++ )
    	{
    		res+=(count[i]*(count[i]+1)/2);
    	}
    	return res;
    }
}
