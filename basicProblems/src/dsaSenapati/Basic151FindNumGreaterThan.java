/*
 Write a Java program to find the numbers greater than the average of the numbers 
 of a given array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25
100
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic151FindNumGreaterThan {
	public static void main(String[] args) 
    {
      Integer nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
      int sum = 0;
	  System.out.println("Original Array: ");
	  System.out.println(Arrays.toString(nums));
	  for(int i = 0; i < nums.length; i++) {      
      sum = sum + nums[i];
    }
      double average = sum / nums.length;
      System.out.println("The average of the said array is: " + average);
      System.out.println("The numbers in the said array that are greater than the average are: ");
      for(int i = 0; i < nums.length; i++) {
      if(nums[i] > average) {
        System.out.println(nums[i]);
      }
    }
	}
}
