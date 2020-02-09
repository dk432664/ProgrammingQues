package Strings;

import java.util.Scanner;

public class ReverseEachWordString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0)
		{
          String sd=sc.next();
          String [] w=sd.split("\\.");
          for(int i=0; i<w.length; i++)
          {
        	  StringBuffer bf=new StringBuffer(w[i]);
        	  System.out.print(bf.reverse());
        	  if(i<w.length-1)
        		  System.out.print(".");
        	  
          }
          System.out.println();
	}

	}

}
