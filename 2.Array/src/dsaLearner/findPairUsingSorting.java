	//Q: find pair with given sum in the Array-
// Using Sorting
	//Input: [8, 7, 2, 5, 3, 1]  
	//--> target10
	//output: pair found (8, 2) or (7, 3)
	
	// input: [5, 2, 6, 8, 1, 9]
	//--> target 12
	//output: pair not found

package dsaLearner;

import java.util.Arrays;

public class findPairUsingSorting {
	public static void findPairBySorting( int[] nums, int target)
	{
		Arrays.sort(nums);
		int low = 0;
		int high = nums.length-1;
		while( low < high)
		{
			if ( nums[low] + nums[high] == target)
			{
				System.out.printf("Pair found (%d, %d) ",  nums[low], nums[high]);
				return;
			}
			if (nums[low] + nums[high] < target)
			{
				low++;
			}
			else {
				high--;
			}
		}
		System.out.println("Pair not found");
	}
public static void main(String[] args) {
	int[] nums = { 8, 7, 2, 5, 3, 1 };
	int target = 10;
	findPairBySorting(nums, target);
}
}
//intuition: code from 11 to 43
//line 16: function  to find a pair with a given sum using sorting
//19, 20: maintain two indices pointing to endpoint of the array
//21:  loop till the search spaces is exhausted
//23:  sum found
//30 & 33: increment:low index of total in less than the desired sum  dec.: high index of the total is ,ore than the desired sum


