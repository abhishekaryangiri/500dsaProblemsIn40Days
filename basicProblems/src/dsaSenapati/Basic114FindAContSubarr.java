/*
 Write a Java program to find a contiguous subarray with largest sum from a given array of integers.
Note: In computer science, the maximum subarray problem is the task of finding the contiguous 
subarray within a one-dimensional array of numbers which has the largest sum. 

For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with
 the largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least
 */
package dsaSenapati;

public class Basic114FindAContSubarr {
	public static void main(String[] args) {
	      int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	      System.out.print(max_SubArray(nums)); 
	}
	 public static int max_SubArray(int[] nums) {
	        if (nums.length < 1) {
	            return 0;
	        }
	        int max = nums[0];
	        int max_Begin = 0;
	        int max_End = 0;
	        int begin = 0;
	        int end = 0;
	        int sum = 0;
	        while (end < nums.length) {
	            sum += nums[end];
	            if (sum < 0) {
	                sum = 0;
	                begin = end + 1;
	            } else {
	                if (sum > max) {
	                    max = sum;
	                    max_Begin = begin;
	                    max_End = end;
	                }
	            }
	            end++;
	        }
	        return max;
	    }
}
