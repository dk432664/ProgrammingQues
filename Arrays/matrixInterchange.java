package Arrays;

import java.util.Scanner;

public class matrixInterchange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int r;
	int c;
	
	while(t-->0)
	{

		 r=sc.nextInt();
		 c=sc.nextInt();
		 int arr[][]=new int[r][c];

		for(int i=0; i<r; i++)
		{
			for(int  j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			
				}
			}
		
		for(int  i=0; i<r; i++)
		{
			for(int  j=0; j<c; j++)
			{
				
			
				System.out.print(arr[i][j]  +  "  ");
				
				
			}
			System.out.println();
			
		}
		System.out.println("After Swapping");
		//after swapping matrix is
		for(int k=0; k<r; k++)
		{
			int temp=arr[k][0];
			arr[k][0]=arr[k][c-1];
			arr[k][c-1]=temp;
		}
		for(int  i=0; i<r; i++)
		{
			for(int  j=0; j<c; j++)
			{
				
			
				System.out.print(arr[i][j]  +  "  ");
				
				
			}
			System.out.println();
			
		}
		
		
		
	}
	

	}

}
