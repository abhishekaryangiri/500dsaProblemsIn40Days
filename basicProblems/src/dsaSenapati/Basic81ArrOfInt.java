
/*
 Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic81ArrOfInt {
	 public static void main(String[] args)
	 {
	    //int[] nums = {10, 10, 2, 4, 9};
		int[] nums = {10, 10, 2, 4, 20, 20};  
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Original Array: "+Arrays.toString(nums)); 
		    
	    boolean found1010 = false;
	    boolean found2020 = false;
	      
	    for(int i = 0; i < nums.length - 1; i++) {
	        if(nums[i] == 10 && nums[i+1] == 10)
	            found1010 = true;
	                        
	        if(nums[i] == 20 && nums[i+1] == 20)
	            found2020 = true;
	    }
	   
		System.out.printf( String.valueOf(found1010 != found2020));	
		System.out.printf("\n");
	  }
}
