package Arrays;

import java.util.Scanner;

public class FindPeak {

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
			System.out.println(peak(arr,0,n-1,n));

	}

}
	static int peak(int arr[],int l,int h,int n)
	{
		int mid=l+(h-l)/2;
		if((mid==0 || arr[mid-1]<=arr[mid])&&(mid==n-1 ||
				arr[mid]>=arr[mid+1]))
		{
			return mid;
		}
		else if(mid>0 && arr[mid]<arr[mid-1])
		{
			return peak(arr,l,mid-1,n);
		}
		else
		{
			return peak(arr,mid+1,h,n);
		}
	}
}