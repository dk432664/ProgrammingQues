package Arrays;

import java.util.Scanner;

public class SmallestSubarraySumGreaterX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			//System.out.println(smallestsub(arr,n,x));
			int i=0,j=1;
			int curr_sum=arr[0];
			//int start=0,end=0;
			int min_len=n;
			while(j<=n && i<=j )
			{
				if(curr_sum<=x)
				{
					if(j<n)
					{
						curr_sum+=arr[j];
						j++;
					}
				}
				else
				{
					int len=j-i;
					if(len<min_len)
					{
						min_len=len;
					}
					curr_sum-=arr[i];
					i++;
				}
		}
			System.out.println(min_len);

		}
		
		

	}
	
}
	
		
