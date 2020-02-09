package Arrays;

import java.util.Scanner;

public class countZeros {

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
			System.out.println(countzeros(arr,n));
			
		}

	}
	static int firstzero(int arr[],int l,int h)
	{
		if(l<=h)
		{
			int mid=l+(h-l)/2;
			if((mid==0||arr[mid-1]==1)&&arr[mid]==0)
			{
				return mid;
			}
			if(arr[mid]==1)
			{
				return firstzero(arr,mid+1,h);
			}
			else
			{
				return firstzero(arr,l,mid-1);
			}
			
		}
		return -1;
	}
	static int countzeros(int arr[],int n)
	{
		int first=firstzero(arr,0,n-1);
		if(first==-1)
			return 0;
		return (n-first);
	}

}
