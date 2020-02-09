package Arrays;

import java.util.Scanner;

public class ColumnIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0)
		{
			int n=sc.nextInt();
	        int m=sc.nextInt();
			int arr1[][]=new int[n][m];
			
			
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					arr1[i][j]=sc.nextInt();
				}
				}
				
			
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
			if(arr1[i][j]==0)
				{
				System.out.print(j);
				}
				
			}
			}
			

	}

}
}
