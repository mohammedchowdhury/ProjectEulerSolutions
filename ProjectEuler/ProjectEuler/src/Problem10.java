
public class Problem10 {

	public static void main(String[] args) {
		//		The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		//
		//		Find the sum of all the primes below two million.
		
		findSumOfPrimes(2000000); 
		

	}
	
	//public static void 
	
	public static void findSumOfPrimes(int a){
		
		long n = 0L; 
		
		for(int z=3;z<=a;z=z+2) {
			if(isPrime(z)) {
			System.out.println(z);
			n = n+z; 
			}
			
		}
		System.out.println(n+2);
		
		
	}
	
	public static boolean isPrime(long a2) {

		for(int a=2; a<a2/2; a++) {
			if(a2%a==0) {
				return false; 
			}
		}

		return true; 
	}

}
