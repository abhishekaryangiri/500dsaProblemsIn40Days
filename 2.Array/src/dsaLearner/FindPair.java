	//Q: find pair with given sum in the Array-
// Using Bruite-Force
	//Input: [8, 7, 2, 5, 3, 1]  
	//--> target10
	//output: pair found (8, 2) or (7, 3)
	
	// input: [5, 2, 6, 8, 1, 9]
	//--> target 12
	//output: pair not found

package dsaLearner;
public class FindPair {
	public static void findPair(int[] nums, int target) {
		for(int i=0; i<nums.length-1; i++) 
		{
			for( int j=i+1; j<nums.length; j++)
			{
				if ( nums[i] + nums[j] == target)
				{
					System.out.printf("pair found(%d, %d) ", nums[i], nums[j]);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}
	public static void main(String[] args) {
		int [] nums = {8, 7, 2, 5, 3, 1};
		int target = 10;
		findPair( nums, target);
	}
}
//intitution: code from 11 - 32
//line 13: find a pair in a array with a given sum
// line 14 : consider each element except the last
// liine 16: start from ith elem till last elem
//line 18:  if the desired sum is found, print it
// line20: The %d specifies that the single variable is a decimal integer. The %n is a platform-independent newline character. The output is: The value of i is: 461012. The printf and format methods are overloaded.
//line 20: // printf formats the text by placing the placeholders into the first string
//placeholders are noted first with '%s' and then you list them in their order
//System.out.printf( "Test ( %s ): %s", 3.75, "ok" );
//will give: 
//Test ( 3.75 ): ok
//comlete placeholders you use for known variables:
//%f : float and double
//%d : int and long
//%c : char
//%b : boolean
//float f = 15.47f;
//long l = 765432L;
//char c = '@';
//boolean b = true;
//System.out.printf( "Test2 ( %f ): %d -> %c%b", f, l, c, b );
//will give: 
//Test2 ( 15,470000 ): 765432 -> @true
//number of decimals:
//%.4f : 4 decimals after the dot
//System.out.printf( "Test3 ( %.4f ): %d -> %c%b", f, l, c, b );
//will give:
//Test3 ( 15,4700 ): 765432 -> @true

