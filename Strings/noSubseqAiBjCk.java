package Strings;

import java.util.Scanner;

public class noSubseqAiBjCk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String s=sc.next();
		
		while(t-->0)
		{

			System.out.println(countsubSeq(s));
	       
	}

}
	static int countsubSeq(String s)
	{
		// Initialize counts of different subsequences 
        // caused by different combination of 'a' 
		int acount=0;
		// Initialize counts of different subsequences 
        // caused by different combination of 'a' and 
        // different combination of 'b' 
		int bcount=0;
		// Initialize counts of different subsequences 
        // caused by different combination of 'a', 'b' 
        // and 'c'. 
		int ccount=0;
		for(int i=0; i<s.length(); i++)
		{
			/* If current character is 'a', then 
            there are following possibilities : 
              a) Current character begins a new 
                 subsequence. 
              b) Current character is part of aCount 
                 subsequences. 
              c) Current character is not part of 
                 aCount subsequences. */
			if(s.charAt(i)=='a')
			{
				acount=1+(2*acount);
			}
			/* If current character is 'b', then 
            there are following possibilities : 
              a) Current character begins a new 
                 subsequence of b's with aCount 
                 subsequences. 
              b) Current character is part of bCount 
                 subsequences. 
              c) Current character is not part of 
                 bCount subsequences. */
			else if(s.charAt(i)=='b')
			{
				bcount=acount+(2*bcount);
			}
			/* If current character is 'c', then 
            there are following possibilities : 
              a) Current character begins a new 
                 subsequence of c's with bCount 
                 subsequences. 
              b) Current character is part of cCount 
                 subsequences. 
              c) Current character is not part of 
                 cCount subsequences. */
			else if(s.charAt(i)=='c')
			{
				ccount=bcount+(2*ccount);
			}
			
		}
		return ccount;
		
	}
}
