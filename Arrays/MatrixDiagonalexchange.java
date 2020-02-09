package Arrays;

import java.util.Scanner;

public class MatrixDiagonalexchange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int sum=0;
		int sum2=0;
		while(t-->0)
		{
			int r=sc.nextInt();
			int s=sc.nextInt();
			int arr[][]=new int[r][s];
			int arr1[][]=new int[s][r];
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<s; j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			//transpose
			for(int i=0; i<s; i++)
			{
				for(int j=0; j<r; j++)
				{
					arr1[i][j]=arr[j][i];
				}
				
			}
			//------------------------------------------------
			
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<s; j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			//transpose
			System.out.println("Transpose");
			for(int i=0; i<s; i++)
			{
				for(int j=0; j<r; j++)
				{
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
			// ------------------------------------
			//diagonal sum
			
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<s; j++)
				{
					if(i==j)
					{
						sum+=arr[i][j];
					}
			
				}
				
			}
			System.out.println(sum);
			System.out.println("right diagonal element sum");
			//right diagonal element sum
			        int i1,j1;
					for( i1=0,  j1=s-1; i1<r && j1>=0; i1++, j1--)
					{
						sum2+=arr[i1][j1];
					}
			System.out.println(sum2);
				
				
				
			
			
			
			System.out.println("Diagonal element interchanged");
			for(int i=0; i<r; i++)
			{
				if(r%2==0) {
				if(i!=r/2) {
				int tem=arr[0][0];
				arr[0][0]=arr[r-1][s-1];
				arr[r-1][s-1]=tem;
				int tem2=arr[0][s-1];
				arr[0][s-1]=arr[r-1][0];
				arr[r-1][0]=tem2;
			}
				}
				else
				{
					int tem=arr[0][0];
					arr[0][0]=arr[r-1][s-1];
					arr[r-1][s-1]=tem;
					int tem2=arr[0][s-1];
					arr[0][s-1]=arr[r-1][0];
					arr[r-1][0]=tem2;
				}
			}
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<s; j++)
				{
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
				
			}
			
			
			
		}
		
         
	}

}
