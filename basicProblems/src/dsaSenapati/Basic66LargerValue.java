/*
 Write a Java program to get the larger value between first and last element of an array (length 3) of integers .
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic66LargerValue {
	public static void main(String[] args)
	 {
	    int[] array_nums = {20, 30, 40};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		if(array_nums[2] >= max_val)
			max_val = array_nums[2];
		System.out.println("Larger value between first and last element: "+max_val); 	 
	 }
}
