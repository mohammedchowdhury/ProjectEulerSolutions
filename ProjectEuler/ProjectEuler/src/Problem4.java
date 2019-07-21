
public class Problem4 {

	public static void main(String[] args) {
		//		A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		//				Find the largest palindrome made from the product of two 3-digit numbers.



		generatePalindrome(); 
		
		
	}

	public static void generatePalindrome() {
		
		int large = 0; 
		for(int a=999;a>99;a--) {
			for(int b=999;b>99;b--) {
				
				int ans = b*a; 
				if(isPalindrome(ans)==true) {
					int t = a*b; 
					if(t>large) {
						large = t; 
					}
//					System.out.println(a+"  "+b);
//					System.out.println(a*b);
					//break; 
				}
				
			}
		}
		System.out.println(large);


	}

	public static boolean  isPalindrome(int ans){

		String a = ans+""; 
		String temp = ""; 

		for(int z=a.length()-1; z>-1;z--) {
			temp = temp+ a.charAt(z); 
		}
		if(a.compareTo(temp)==0) {
			return true; 
		}
		return false; 
	}

}
