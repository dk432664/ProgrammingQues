package Arrays;

import java.util.Arrays;
import java.util.Scanner;

	

public class InversionArrays {
	
	static int mergeCount(int arr[],int l,int m,int r)
	{
		int left[]=Arrays.copyOfRange(arr,l,m+1);
		int right[]=Arrays.copyOfRange(arr, m+1, r+1);
		int i=0,j=0,k=l,swap=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[j])
			{
				arr[k++]=left[i++];
			}
			else
			{
				arr[k++]=right[j++];
				swap+=(m+1)-(l+i);
			}
		}
			while(i<left.length)
			{
				arr[k++]=left[i++];
			}
			while(j<right.length)
			{
				arr[k++]=right[j++];
			}
			
			return swap;
			
		
	}
	


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
			System.out.println(mergeSort(arr,0,arr.length-1));
			
		}

	}



	static int mergeSort(int arr[],int l,int r)
	{
		int count=0;
		if(l<r)
		{
			int m=(l+r)/2;
			count+=mergeSort(arr,l,m);
			count+=mergeSort(arr,m+1,r);
			count+=mergeCount(arr,l,m,r);
			
		}
		return count;
	}
}
