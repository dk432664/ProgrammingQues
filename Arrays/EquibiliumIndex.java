package Arrays;

import java.util.Scanner;

public class EquibiliumIndex {

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
			System.out.println(eqm(arr,n));

	}

}
	static int eqm(int arr[],int n)
	{
		int sum=0,leftsum=0;
		for(int i=0; i<n; i++)
		{
			sum+=arr[i];
			//Total sum of array element
		}
		for(int i=0; i<n; i++)
		{
			sum-=arr[i];
			if(leftsum==sum)
			{
				return i;
			}
			leftsum+=arr[i];
		}
		return -1;
	}
}
