import java.util.ArrayList;
import java.util.Hashtable;

import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.Sides;

public class main {





	static ArrayList<Long> listofPrimes = new ArrayList<Long>();  // variable needs to be reset 
	static long size = 0;  // reset after
	static Hashtable<Long, Long> divisor = new Hashtable<Long,Long>(); //reset  after


	public static void main(String[] args) {	

		long ss = 1L;
		long incr = 1; 
		long temp = 2; 

		while((ss<500)) {

			incr = incr+temp; 

			temp= temp+1; 
			
			
			generatePrimes(incr);
			ss= 2L+listofPrimes.size();

			System.out.println(divisor.toString());
			
			listofPrimes.clear();
			size=0; 
			divisor.clear();



			

			System.out.println(incr);

		}

	}

	public static void generatePrimes(long n) {
		long x=2; 
		long copy = n; 
		while(n!=1) {

			//long a = n%x; 

			if(n%x==0) {
				listofPrimes.add(x); 
				n = n/x; 
			}
			else {
				x++; 
			}
		}


		int z=1;  //size of the max size possible; 
		int c=1; 
		for(int a=1; a<listofPrimes.size(); a++) {
			c =c*2; 
			z = z+c; 
		}

		size = z; 
		bitstring(); 
	}

	public static void bitstring() {

		//System.out.println(size);

		for(int a=1; a<=size; a++) {

			String temp = binary(a); 
			//System.out.println(temp);

			long aa = 1L; 
			for(long num = 0; num<temp.length();num++) {
				if(temp.charAt((int) num)=='1') {
					aa = aa*listofPrimes.get((int) num); 
				}
			}

			divisor.put(aa, aa); 

		}

	}


	public static String binary(int n) {	
		String x = ""; // we store the answer here
		while(n>0){
			long temp = n%2; 
			x = temp + x; 
			n = n/2; 
		}

		String temp = "";  // padding the string 
		for(int a=0; a<listofPrimes.size()-x.length();a++){
			temp = temp+"0"; 
		}
		x = temp+x; 
		return x;

	}

	public static boolean isDivisor(long currentNum2,long a) {
		if(currentNum2%a==0) {
			return true; 
		}
		return false;	
	}




}
