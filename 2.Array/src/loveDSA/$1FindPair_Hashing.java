	//Q: find pair with given sum in the Array-
// Using Hashing
	//Input: [8, 7, 2, 5, 3, 1]  
	//--> target10
	//output: pair found (8, 2) or (7, 3)
	
	// input: [5, 2, 6, 8, 1, 9]
	//--> target 12
	//output: pair not found
package loveDSA;

import java.util.HashMap;
import java.util.Map;

public class $1FindPair_Hashing {
public static void findPairUsingHashing(int[] nums, int target) 
{
	Map<Integer, Integer>map = new HashMap<>( );
	for ( int i=0; i< nums.length; i++)
	{
		if( map.containsKey(target - nums[i]))
		{
			System.out.printf("Pair found (%d, %d) ", nums[map.get(target - nums[i])], nums[i]);
			return;
		}
		map.put(nums[i], i);
	}
		System.out.println("Pair not found");
	}
public static void main(String[] args) {
	int [] nums = { 8, 7, 2, 5, 3, 1 };
	int target = 10;
	findPairUsingHashing(nums, target);
	}
}
//intuition: 10-35
//18: create an empty hash Map
//19: do for each element
//21 check if pair exist, if the diff. is seen before , print the pair
//26 store index of the current element in the map