import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
//		The following iterative sequence is defined for the set of positive integers:
//
//			n → n/2 (n is even)
//			n → 3n + 1 (n is odd)
//
//			Using the rule above and starting with 13, we generate the following sequence:
//
//			13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//			It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//			Which starting number, under one million, produces the longest chain?
		
		ArrayList<Long> chainLength = new ArrayList<Long>(); 
		
		long bigNum = 1; 
		long maxChainSize = 1; 
				
		for(long a=1; a<1000000; a++) {			
			long t = a; 
			chainLength.add(t); 
			//System.out.print(t+" ");
			while(t!=1) {
				if(t%2==0) {
					t = t/2; 
					//System.out.print(t+" ");
					chainLength.add(t); 
				}
				else {
					t = t*3+1; 
					//System.out.print(t+" ");
					chainLength.add(t); 
				}					
			}			
			//System.out.println();
			
			if(chainLength.size()>maxChainSize) {
				maxChainSize = chainLength.size(); 
				bigNum = a; 
			}
			//System.out.println("size of chain " + chainLength.size());
			chainLength.clear();

		}
		System.out.println(bigNum);
		
		

	}

}
