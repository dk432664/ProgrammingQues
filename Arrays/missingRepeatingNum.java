package Arrays;

import java.util.Scanner;

public class missingRepeatingNum {

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
			for(int i=0; i<n; i++)
			{
				if(arr[Math.abs(arr[i])-1]<0)
				{
					System.out.println(Math.abs(arr[i]) + " ");
				}
				else
				{
					arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
				}
			}
			for(int i=0; i<n; i++)
			{
				if(arr[i]>0)
				{
					System.out.println((i+1)+ " ");
				}
			}
			
		}

	}

}
