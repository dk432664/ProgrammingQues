package Strings;

import java.util.Arrays;
import java.util.Scanner;
//total distinct substring
public class DistinctSubstring {
     final static int MAX_CHAR=256;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			System.out.println(countdisSubstr(s));
		}
		

	}
static int countdisSubstr(String h)
{
	int res=0;
	// Create an array to store index 
    // of last 
	int last[]=new int[MAX_CHAR];
	Arrays.fill(last,-1);
	int dp[]=new int[h.length()+1];
	// Empty substring has only one subsequence 
	dp[0]=1;
	for(int i=1; i<=h.length(); i++)
	{
		dp[i]=2*dp[i-1];
		 // If current character has appeared 
        // before, then remove all subsequences 
        // ending with previous occurrence. 
		if(last[(int)h.charAt(i-1)]!=-1)
		
			dp[i]=dp[i]-dp[last[(int)h.charAt(i-1)]];
		//mark occ of current char
		last[(int)h.charAt(i-1)]=(i-1);
	}
	return dp[h.length()];
}
}
