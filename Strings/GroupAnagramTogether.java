package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagramTogether {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		
		//String str=sc.next();
		//String str2=sc.next();
		
		while(t-->0)
		{
			int n=Integer.parseInt(sc.nextLine());
			HashMap<String,Integer> ma=new HashMap<>();
			String [] w=sc.nextLine().split(" ");
			for(int i=0; i<n; i++)
			{
				char [] s=w[i].toCharArray();
				Arrays.sort(s);
				String key=String.valueOf(s);
				if(ma.containsKey(key))
				{
					ma.put(key, ma.get(key)+1);
				}
				else
				{
					ma.put(key,1);
				}
			}
			ArrayList<Integer> res=new ArrayList<>();
			for(Map.Entry<String, Integer> e:ma.entrySet())
			{
				res.add(e.getValue());
			}
			Collections.sort(res);
			for(int i=0; i<res.size(); i++)
			{
				System.out.print(res.get(i) + " ");
			}
          System.out.println();
	}

	}

}
