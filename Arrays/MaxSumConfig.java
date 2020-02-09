package Arrays;

import java.util.Scanner;

public class MaxSumConfig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			int sum=0;
			int pivot=findPartition(arr,n);
			int diff=n-1-pivot;
			for(int i=0; i<n; i++)
			{
				sum+=((i+diff)%n)*arr[i];
			}
			System.out.println(sum);
			

	}

}
	static int findPartition(int arr[],int n)
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i]>arr[(i+1)%n])
			{
				return i;
			}
			
		}
		return 0;
		
	}
}
