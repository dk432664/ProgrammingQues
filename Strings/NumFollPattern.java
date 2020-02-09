package Strings;

import java.util.Scanner;
import java.util.Stack;

public class NumFollPattern {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	String sd=sc.next();
    	int num=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<=sd.length(); i++)
        {
        	st.push(num++);
        	if(i>=sd.length())
        	{
        		continue;
        	}
        	if(sd.charAt(i)=='I' || st.size()==0)
        	{
        		while(!st.isEmpty())
        		{
        			System.out.print(st.peek());
        			st.pop();
        			
        		}
        	}
        }
        while(!st.isEmpty())
        {
        	System.out.print(st.peek());
			st.pop();
        	
        }
        System.out.println();
		

	}

}
}