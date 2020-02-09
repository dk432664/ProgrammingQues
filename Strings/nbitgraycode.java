package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class nbitgraycode {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
    	Gcode(n);
    }

	}
       static void Gcode(int n)
       {
    	   if(n<=0)
    		   return;
    	   ArrayList<String> x=new ArrayList<>();
    	   x.add("0");
    	   x.add("1");
    	   int i,j;
    	   for( i=2; i<(1<<n); i=i<<1)
    	   {
    		   for( j=i-1; j>=0; j--)
    		   {
    			   x.add(x.get(j));
    		   }
    		   for(j=0; j<i; j++)
    		   {
    			   x.set(j,"0"+x.get(j));
    		   }
    		   for(j=i; j<2*i; j++)
    		   {
    			   x.set(j, "1"+x.get(j));
    		   }
    	   }
    	   for(i=0; i<x.size(); i++)
    	   {
    		   System.out.println(x.get(i));
    	   }
       }
}
