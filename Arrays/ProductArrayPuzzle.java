package Arrays;

import java.util.Scanner;

public class ProductArrayPuzzle {

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
			int prod[]=new int[n];
			int temp=1;
			for(int j=0; j<n; j++)
			{
				prod[j]=1;
			}
			
			for(int i=0; i<n; i++)
			{
				prod[i]=temp;
				temp*=arr[i];
			}
			temp=1;
			for(int i=n-1; i>=0; i--)
			{
				prod[i]*=temp;
				temp*=arr[i];
			}
			for(int i=0; i<n; i++)
			{
				System.out.print(prod[i] + " ");
			}
			System.out.println();
		}

	}

}
