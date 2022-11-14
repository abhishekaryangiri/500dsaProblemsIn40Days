/*
 nums = [8, 7, 2, 5, 3, 1]
target = 10
 
Output:
 
Pair found (8, 2)
or
Pair found (7, 3)
 
 
Input:
 
nums = [5, 2, 6, 8, 1, 9]
target = 12
 
Output: Pair not found
 */

package loveDSA;

import java.util.Arrays;

public class FindPairWithGivenSum1 {

    // Function to find a pair in an array with a given sum using sorting
    public static void findPair(int[] nums, int target)
    {
        // sort the array in ascending order
        Arrays.sort(nums);
 
        // maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;
 
        // reduce the search space `nums[low…high]` at each iteration of the loop
 
        // loop till the search space is exhausted
        while (low < high)
        {
            // sum found
            if (nums[low] + nums[high] == target)
            {
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }
 
            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
 
        findPair(nums, target);
    }
}
