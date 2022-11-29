/*
 Write a Java program to find the k largest elements in a given array. Elements in the 
 array can be in any order. 

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17
 */
package dsaSenapati;

import java.util.Arrays;
import java.util.Collections;

public class Basic148FindKthElem {
	public static void main(String[] args) 
    {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr, Collections.reverseOrder());         
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
      }
}
