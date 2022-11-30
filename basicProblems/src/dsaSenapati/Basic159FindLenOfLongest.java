/*
 Write a Java program to find the length of the longest consecutive sequence of a given array of integers.
Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
7
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic159FindLenOfLongest {
	public static int longest_sequence(int[] nums) {
	    if (nums == null) {
	      throw new IllegalArgumentException("Null array..!");
	    }
	    if (nums.length == 0) {
	      return 0;
	    }
	    boolean flag = false;
	    int result = 0;
	    int start = 0, end = 0;
	    for (int i = 1; i < nums.length; i++) {
	      if (nums[i - 1] < nums[i]) {
	        end = i;
	      } else {
	        start = i;
	      }
	      if (end - start > result) {
	        flag = true;
	        result = end - start;
	      }
	    }
	    if (flag) 
		{
	      return result + 1;
	    } 
		else 
		{
	      return result;
	    }
	 }

	   public static void main(String[] args) {
	        int[] nums = { 1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2 };
			System.out.println("\nOriginal array: "+Arrays.toString(nums));  
			System.out.println(longest_sequence(nums));		
			}
}
