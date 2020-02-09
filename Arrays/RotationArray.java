package Arrays;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int d=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			StringBuffer v=new StringBuffer();
			for(int i=d; i<n; i++)
			{
				v.append(arr[i] +  " ");
			}
			for(int i=0; i<d; i++)
			{
				v.append(arr[i] +  " ");
			}
			System.out.println(v);
			
		}

	}

}
