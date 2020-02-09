package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nutsBolts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n=sc.nextInt();
			char nut[]=new char[n];
			char bolt[]=new char[n];
			for(int i=0; i<nut.length; i++)
			{
				nut[i]=sc.next().charAt(0);
			}
			for(int i=0; i<bolt.length; i++)
			{
				bolt[i]=sc.next().charAt(0);
			}
			match(nut,bolt);
		}

	}
	public static void match(char nut[],char bolt[])
	{
		Arrays.sort(nut);
		Arrays.sort(bolt);
		ArrayList<Character> v=new ArrayList<>();
		int count=0;
		for(int i=0; i<nut.length; i++)
		{
			if(count==nut.length)
			{
				break;
				
			}
			while(bolt[count]<=nut[i])
			{
				if(bolt[count]==nut[i])
				{
					v.add(bolt[count]);
					count++;
					break;
				}
				count++;
				if(count==nut.length)
				{
					break;
				}
			}
		}
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i) +  " ");
			
		}
		System.out.println();
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i) +  " ");
			
		}
		System.out.println();
	}

}
