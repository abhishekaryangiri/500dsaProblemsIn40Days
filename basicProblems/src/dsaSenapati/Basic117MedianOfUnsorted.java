/*
 Write a Java program to calculate the median of a given unsorted array of integers.
Original array: [10, 2, 38, 22, 38, 23]
Median of the said array of integers: 30
Original array: [10, 2, 38, 23, 38, 23, 21]
Median of the said array of integers: 23
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic117MedianOfUnsorted {
	public static void main(String[] args)
	 {
	    int[] nums = {10,2,38,22,38,23};
	    System.out.println("Original array: "+Arrays.toString(nums));
	    System.out.println("Median of the said array of integers: "+getMedian(nums));
	    int[] nums1 = {10,2,38,23,38,23,21};
	    System.out.println("\nOriginal array: "+Arrays.toString(nums1));
	    System.out.println("Median of the said array of integers: "+getMedian(nums1));
	}
	 public static int getMedian(int[] array) {
	        if(array.length % 2 == 0) {
	            int mid = array.length / 2;
	            return (array[mid] + array[mid - 1]) / 2;
	        }
	        return array[array.length / 2];
	    }
}
