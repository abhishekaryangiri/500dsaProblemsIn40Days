/*
  Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. 
  
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
 */
package dsaSenapati;

public class Basic62LengthOfArrGreater {
	 public static void main(String[] args)
	 {
	    int[] num_array = {50, -20, 0, 30, 40, 60, 10};
	    
		System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
	 }
}
