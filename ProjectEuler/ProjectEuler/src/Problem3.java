import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {

		LargestPrimeFactor(600851475143L); 

		System.out.println(isPrime(29)); 



	}
	public static void LargestPrimeFactor(long n) {
		
		ArrayList<Long> num = new ArrayList<>();
	
		for(long a=0;a<=n;a++) {
			if(isPrime(a)==true) {
				if(n%a==0) {
					n = n/a; 
					num.add(a); 
					System.out.println(a);
				}
				
			}
		}


	}
	public static boolean isPrime(long x) {
		for(int a=2;a<x;a++) {
			if(x%a==0) {
				//System.out.println("Not Prime");
				return false;  
			}

			if(a==(x-1)) {
				//System.out.println("Prime");
				return true; 
			}
		}
		return false; 
	}

}
