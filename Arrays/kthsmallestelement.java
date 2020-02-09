package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kthsmallestelement {

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
			Arrays.sort(arr);
			int k=sc.nextInt();
			if(k<=n)
			{
				System.out.println(arr[k-1]);
			}
			else
			{
				System.out.println("Not possible");
			}
		}

	}

}
