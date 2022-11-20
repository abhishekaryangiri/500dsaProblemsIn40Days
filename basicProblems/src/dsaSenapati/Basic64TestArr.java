/*
 . Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. 
Sample Output:

Original Array: [5, 7]                                                 
true 
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic64TestArr {
	 public static void main(String[] args)
	 {
	    int[] array_nums = {5, 7};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		if(array_nums[0] == 4 || array_nums[0] == 7)
			System.out.println("True");
		else
	    System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
		 
	 }
}
