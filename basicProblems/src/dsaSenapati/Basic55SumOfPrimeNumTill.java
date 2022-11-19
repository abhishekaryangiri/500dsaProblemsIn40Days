/*
  Write a Java program to compute the sum of the first 50 prime numbers. 
Sample Output:

Sum of the first 50 prime numbers: 1060 
 */
package dsaSenapati;

public class Basic55SumOfPrimeNumTill {
	 public static void main(String[] args)
	 {
	    int sum = 1;
		 int ctr = 0; 
		 int n = 0; 
	    	
			while (ctr < 100) {
				n++; 
				if (n % 2 != 0) { 
				// check if the number is even
					if (is_Prime(n)) {
						sum += n; 					
					}
				}
	                    ctr++; 	
			}
			System.out.println("\nSum of the prime numbers till 50: "+sum); 	
		 }
		
	   	public static boolean is_Prime(int n) {
			for (int i = 3; i * i <= n; i+= 2) {
				if (n % i == 0) {
					return false; 
				}
			}
			return true;
		}
}
