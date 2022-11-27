/*
  Write a Java program to find the new length of a given sorted array where 
  duplicate elements appeared at most twice.
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
The length of the original array is: 13
After removing duplicates, the new length of the array is: 10
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic120FindNewLenght2 {
	static int remove_Duplicates_twice(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int index = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index] || (nums[i] == nums[index] && nums[i] != nums[index - 1])) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

  /* Driver program to test above functions */
     public static void main(String[] args)
    {
        int[] nums = {1,1,2,3,3,3,4,5,6,7,7,7,7};
        System.out.println("Original array: "+Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);
        System.out.println("After removing duplicates, the new length of the array is: " + remove_Duplicates_twice(nums));
    }
}
