
public class Problem6 {

	public static void main(String[] args) {

		//		The sum of the squares of the first ten natural numbers is,
		//
		//		12 + 22 + ... + 102 = 385
		//		The square of the sum of the first ten natural numbers is,
		//
		//		(1 + 2 + ... + 10)2 = 552 = 3025
		//		Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
		//
		//		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


		int a = getpt1(100); 
		int b = getpt2(100); 
		System.out.println(b-a);

	}
	public static int getpt1(int n) {
		int total = 0;
		for(int a=0;a<=n; a++) {
			total = (int) (total + Math.pow(a, 2));
		}
		return total; 
	}

	public static int getpt2(int n) {
		int total = 0;

		for(int a=0;a<=n; a++) {
			total = total+a; 
		}
		total = (int) Math.pow(total, 2);
		return total; 
	}

}
