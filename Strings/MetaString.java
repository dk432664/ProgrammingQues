package Strings;

import java.util.Scanner;

public class MetaString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			System.out.println(match(s1,s2)?"YES":"NO");

	}

}
	static boolean match(String a,String b)
	{
		if(a.length()!=b.length())
		{
			return false;
		}
		int prev=-1,curr=-1;
		int count=0;
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)!=b.charAt(i))
			{
				count++;
			if(count>2)
				return false;
			prev=curr;
			curr=i;
		}
		}
		return (count==2 && a.charAt(prev)==b.charAt(curr)&&
				a.charAt(curr)==b.charAt(prev));
	}
}