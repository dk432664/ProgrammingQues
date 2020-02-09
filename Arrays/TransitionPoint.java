package Arrays;

import java.util.Scanner;

public class TransitionPoint {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(transitionPoint(arr,n));
	}
	

	}
	static int transitionPoint(int arr[],int n)
	{int i=0;
             for( i=n-1;i>=0;i--){
                 if(arr[i]==0){
                     break;
                 }
             }
             return i+1;
        } 

}
