
public class Problem7 {

	public static void main(String[] args) {
		//		By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
		//		What is the 10 001st prime number?


		findPrime(); 

	}


	public static void findPrime() {
		
		long counter = 0L; 
		long n = 2L;
		
		while(counter<10001) {
			if(isPrime(n)==true) {
				counter++; 
				System.out.println(n);
			}
			n++; 
			
		}
	
		

//		for(int a=2; a<15; a++) {
//
//			if(isPrime(a)==true ){
//				System.out.println(a);
//			}
//
//		}


	}





	public static boolean isPrime(long a2) {

		for(int a=2; a<a2; a++) {
			if(a2%a==0) {
				return false; 
			}
		}

		return true; 
	}

}
