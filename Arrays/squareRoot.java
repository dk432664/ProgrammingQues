package Arrays;

import java.util.Scanner;

public class squareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long a=sc.nextInt();
			System.out.println(floorsqrt(a));
		}

	}
	static long floorsqrt(long x)
	{
		if(x==0||x==1)
		{
			return x;
		}
		long start=1, end=x, ans=0;
		while(start<=end)
		{
			long mid=(start+end)/2;
			if(mid*mid==x)
				return mid;
			if(mid*mid<x)
			{
				start=mid+1;
				ans=mid;
			}
			else
			{
				end=mid-1;
			}
			
		}
		return ans;
	}

}
