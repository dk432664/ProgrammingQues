package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondmostrepeatedSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int f=Integer.MIN_VALUE;
			int s=Integer.MIN_VALUE;
			String sa;
			HashMap<String,Integer> ma=new HashMap<>();
			for(int i=0; i<n; i++)
			{
				 sa=sc.next();
				
				if(!ma.containsKey(sa))
				{
					ma.put(sa, 1);
				}
				else
				{
					ma.put(sa, ma.get(sa)+1); 
				}
			}
			for(Map.Entry<String,Integer> e : ma.entrySet())
			{
				if(e.getValue()>f)
				{
					s=f;
					f=e.getValue();
				}
				if(e.getValue()>s)
				{
					s=e.getValue();
				}
			}
			for(Map.Entry<String,Integer> e : ma.entrySet())
			{
				if(e.getValue()==s)
				{
				System.out.println(e.getKey());
				break;
				}
				
			}
			
		}

	}

}
