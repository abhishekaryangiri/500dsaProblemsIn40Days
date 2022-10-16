
//Find a triplet that sum to a given value
//Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false.
//Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
//Output: 12, 3, 9 
//Explanation: There is a triplet (12, 3 and 9) present 
//in the array whose sum is 24. 
//Input: array = {1, 2, 3, 4, 5}, sum = 9 
//Output: 5, 3, 1 
//Explanation: There is a triplet (5, 3 and 1) present 
//in the array whose sum is 9.
package loveDSA;

public class $26FindTriplet {
	 boolean find3Numbers(int A[], int arr_size, int sum)
	    {
	        int l, r;
	 
	        // Fix the first element as A[i]
	        for (int i = 0; i < arr_size - 2; i++) {
	 
	            // Fix the second element as A[j]
	            for (int j = i + 1; j < arr_size - 1; j++) {
	 
	                // Now look for the third number
	                for (int k = j + 1; k < arr_size; k++) {
	                    if (A[i] + A[j] + A[k] == sum) {
	                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
	                        return true;
	                    }
	                }
	            }
	        }
	 
	        // If we reach here, then no triplet was found
	        return false;
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args)
	    {
	    	$26FindTriplet triplet = new $26FindTriplet();
	        int A[] = { 1, 4, 45, 6, 10, 8 };
	        int sum = 22;
	        int arr_size = A.length;
	 
	        triplet.find3Numbers(A, arr_size, sum);
	    }
}
