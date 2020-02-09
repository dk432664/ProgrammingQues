package Arrays;

import java.util.Scanner;

public class MaxDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//int max=Integer.MIN_VALUE;
		
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			int diff=arr[1]-arr[0];
			int curr_sum=diff;
			int max_sum=curr_sum;
			for(int i=1; i<n-1; i++)
			{
				diff=arr[i+1]-arr[i];
				if(curr_sum>0)
				{
					curr_sum+=diff;
				}
				else
				{
					curr_sum=diff;
				}
				if(curr_sum>max_sum)
				{
					max_sum=curr_sum;
				}
				
				
			}
			System.out.println(max_sum);

	}

}
}