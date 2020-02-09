package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingarraysSumBeEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0)
		{
			int n=sc.nextInt();
	        int m=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[m];
			
			for(int i=0; i<n; i++)
			{
				arr1[i]=sc.nextInt();
			}
			for(int i=0; i<m; i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			Swap(arr1,n,arr2,m);

	}
		

	}
	static int getSum(int X[],int n)
	{
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum+=X[i];
			
		}
		return sum;
	}
	
	static int getTarget(int arr1[],int n,int arr2[],int m)
	{
		int sum1=getSum(arr1,n);
		int sum2=getSum(arr2,m);
		if((sum1-sum2)%2!=0)
		{
			return 0;
		}
		return ((sum1-sum2)/2);
	}
	static void Swap(int arr1[],int n,int arr2[],int m)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int target=getTarget(arr1,n,arr2,m);
		if(target==0)
		{
			return;
		}
		int i=0,j=0;
		while(i<n && j<m)
		{
			int diff=arr1[i]-arr2[j];
			if(diff==target)
			{
				System.out.println(arr1[i]+ " " + arr2[i]);
				return;
			}
			else if(diff<target)
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		
	}

}
