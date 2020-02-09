package Arrays;

import java.util.Scanner;

public class MaximumSubArray {

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
			
         int mlen=-1,sum=0,mstart=-1;
         int start=0,cur_sum=0;
         for(int i=0; i<n; i++)
         {
        	 if(arr[i]<0)
        	 {
        		 cur_sum=0;
        		 start=i+1;
        		 continue;
        	 }
        	 else
        	 {
        		 cur_sum+=arr[i];
        		 if(cur_sum>sum)
        		 {
        			 sum=cur_sum;
        			 mstart=start;
        			 mlen=i-start+1;
        		 }
        		 else if(cur_sum==sum && mlen<(i-start+1))
        		 {
        			 sum=cur_sum;
        			 mstart=start;
        			 mlen=i-start+1;
        		 }
        	 }
         }
         for(int i=0; i<mlen; i++)
         {
        	 System.out.print(arr[mstart+i]+ " ");
        	 System.out.print(sum);
         }
         
         System.out.println();
	}

}
}
