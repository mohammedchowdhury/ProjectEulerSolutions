
public class Problem9 {

	public static void main(String[] args) {
		
//		A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//		a2 + b2 = c2
//		For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//		Find the product abc.

		int A=0,B=0,C=0 ; 
		
		for(int a=0 ;a<1000; a++) {
			for(int b=a; b<1000;b++) {
				for(int c=b; c<1000; c++) {
					if(a*a + b*b ==c*c) {
						if(a+b+c==1000) {
							A = a;
							B = b; 
							C = c; 
							break; 
							
						}
					}
				}
				
			}
		}
		
		System.out.println(A+" "+B+" "+C);
		System.out.println(A*B*C);
		
		
	}

}
