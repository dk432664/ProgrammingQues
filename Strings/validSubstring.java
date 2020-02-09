package Strings;

import java.util.Scanner;
import java.util.Stack;

public class validSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String sa=sc.next();
				System.out.println(count(sa));
		}
		

	}
	static int count(String s)
	{ int res=0;
		Stack<Integer> x=new Stack<>();
		x.push(-1);
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='(')
			{
				x.push(i);
			}
			else
			{
				x.pop();
				if(!x.empty())
				res=Math.max(res, i-x.peek());
				else
					x.push(i);
			}
		}
		return res;
	}

}
