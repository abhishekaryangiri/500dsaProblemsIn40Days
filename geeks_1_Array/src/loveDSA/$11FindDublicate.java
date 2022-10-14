//Find duplicate in an array of N+1 Integers
//Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

package loveDSA;

public class $11FindDublicate {
	 public static void main(String args[])
	    {
	        int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
	  
	        for (int i = 0; i < numRay.length; i++) {
	            numRay[numRay[i] % numRay.length]
	                = numRay[numRay[i] % numRay.length]
	                  + numRay.length;
	        }
	        System.out.println("The repeating elements are : ");
	        for (int i = 0; i < numRay.length; i++) {
	            if (numRay[i] >= numRay.length * 2) {
	                System.out.println(i + " ");
	            }
	        }
	    }
}
