package Strings;

import java.util.Scanner;

public class longestEvenLengthSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	    	
	    	String sd=sc.next();
	    	int n=sd.length();
	    	System.out.println(evenLengthSubstring(sd,n));
	    }

	}
	static int evenLengthSubstring(String s,int n)
	{
		int ans=0;
		for(int i=0; i<=n-2; i++)
		{
			int l=i;
			int r=i+1;
			int lsum=0,rsum=0;
			while(r<n  && l>=0)
			{
				lsum+=s.charAt(l)-'0';
				rsum+=s.charAt(r)-'0';
				if(lsum==rsum)
				{
					ans=Math.max(ans, r-l+1);
				}
			}
			l--;
			r++;
		}
		return ans;
	}

}
