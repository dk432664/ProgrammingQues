package Strings;

import java.util.Scanner;

public class stringareRotationOfeachotherornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			StringBuffer bv=new StringBuffer();
			int r=0;
			if(s1.compareTo(s2)==0)
			{
				r=1;
			}
			else if(s1.length()==s2.length())
			{
				for(int j=0; j<s1.length(); j++)
				{
					bv.append(s1.substring(j)+s1.subSequence(0, j));
					if(bv.toString().compareTo(s2)==0)
					{
						r=1;
						break;
					}
					bv.setLength(0);
				}
			}
			System.out.println(r);
		}

	}

}
