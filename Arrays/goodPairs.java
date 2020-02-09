package Arrays;

import java.util.Scanner;

public class goodPairs {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 int count=0;
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
			 for(int j=i+1; j<n; j++)
			 { 
				 if(arr[i]!=arr[j])
				 
					 count++;
			 } 
		 } 
			 
		 System.out.println(count);
	 }

	}

}
