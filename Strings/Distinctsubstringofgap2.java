package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class Distinctsubstringofgap2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			HashSet<String> sa=new HashSet<>();
			for(int i=0; i<s.length()-1;i++ )
			{
				String tem=s.substring(i,i+2);
				sa.add(tem);
			}
			System.out.println(sa.size());
		}
		

	}

}
