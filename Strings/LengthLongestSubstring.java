package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthLongestSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	    	String sd=sc.next();

	     int substringsize=0;
	     ArrayList<Character> c=new ArrayList<>();
	     for(int i=0; i<sd.length(); i++)
	     {
	    	 c.clear();
	    	 c.add(sd.charAt(i));
	    	 for(int j=i+1; j<sd.length(); j++)
	    	 {
	    		 if(!c.contains(sd.charAt(j)))
	    		 {
	    			 c.add(sd.charAt(j));
	    		 }
	    		 else
	    		 {
	    			 break;
	    		 }
	    	 }
	    		 int arrlen=c.size();
	    		 if(arrlen>substringsize)
	    		 {
	    			 substringsize=arrlen;
	    		 }
	    	 }
	     System.out.println(substringsize);
	    	
	     }
	    }

}
