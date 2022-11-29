/*
 Write a Java program to find the kth smallest and largest element in a given array. 
 Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
K'th smallest element of the said array:
3
K'th largest element of the said array:
25
 */
package dsaSenapati;

import java.util.Arrays;
import java.util.Collections;

public class Basic150KthSmallAndLArgestEl {
	 public static void main(String[] args) 
	    {
	        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
	        int k = 2;
			System.out.println("Original Array: ");
			System.out.println(Arrays.toString(arr));
			System.out.println("K'th smallest element of the said array: ");
	        Arrays.sort(arr);       		
	        System.out.print(arr[k-1] + " ");
			System.out.println("\nK'th largest element of the said array:");          
	        Arrays.sort(arr, Collections.reverseOrder());  		
	        System.out.print(arr[k-1] + " ");
		}
}
