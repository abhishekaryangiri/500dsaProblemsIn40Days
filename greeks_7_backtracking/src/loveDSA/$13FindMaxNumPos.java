/*
 Find Maximum number possible by doing at-most K swaps
 
 
 Given two positive integers M and K, find the maximum integer possible by doing at-most K swap operations on its digits.

Examples: 

Input: M = 254, K = 1
Output: 524
Explanation: Swap 5 with 2 so number becomes 524

Input: M = 254, K = 2
Output: 542
Explanation: Swap 5 with 2 so number becomes 524, Swap 4 with 2 so number becomes 542


Input: M = 68543, K = 1 
Output: 86543
Explanation: Swap 8 with 6 so number becomes 86543

Input: M = 7599, K = 2
Output: 9975
Explanation: Swap 9 with 5 so number becomes 7995, Swap 9 with 7 so number becomes 9975

Input: M = 76543, K = 1 
Output: 76543
Explanation: No swap is required.

Input: M = 129814999, K = 4
Output: 999984211
Explanation: Swap 9 with 1 so number becomes 929814991, Swap 9 with 2 so number becomes 999814291, Swap 9 with 8 so number becomes 999914281, Swap 1 with 8 so number becomes 999984211


Naive solution for the Largest number in K swaps:
The idea is to consider every digit and swap it with digits following it one at a time and see if it leads to the maximum number. The process is repeated K times. The code can be further optimized, if the current digit is swapped with a digit less than the following digit.

Follow the below steps to Implement the idea:

Create a global variable that will store the maximum string or number.
Define a recursive function that takes the string as a number and value of k
Run a nested loop, the outer loop from 0 to the length of string -1, and the inner loop from i+1 to the end of the string.
Swap the ith and jth character and check if the string is now maximum and update the maximum string.
Call the function recursively with parameters: string and k-1.
Now again swap back the ith and jth character.


 */

package loveDSA;

public class $13FindMaxNumPos {
	   
	static String max;
	// Function to find maximum
	// integer possible by
	// doing at-most K swap
	// operations on its digits
	static void findMaximumNum(char[] str,
	                           int k)
	{
	  // Return if no swaps left
	  if (k == 0)
	    return;
	 
	  int n = str.length;
	 
	  // Consider every digit
	  for (int i = 0; i < n - 1; i++)
	  {
	    // Compare it with all digits
	    // after it
	    for (int j = i + 1; j < n; j++)
	    {
	      // if digit at position i
	      // is less than digit
	      // at position j, swap it
	      // and check for maximum
	      // number so far and recurse
	      // for remaining swaps
	      if (str[i] < str[j])
	      {
	        // swap str[i] with
	        // str[j]
	        char t = str[i];
	        str[i] = str[j];
	        str[j] = t;
	 
	        // If current num is more
	        // than maximum so far
	        if (String.valueOf(str).compareTo(max) > 0)
	          max = String.valueOf(str);
	 
	        // recurse of the other
	        // k - 1 swaps
	        findMaximumNum(str, k - 1);
	 
	        // Backtrack
	        char c = str[i];
	        str[i] = str[j];
	        str[j] = c;
	      }
	    }
	  }
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	  String str = "129814999";
	  int k = 4;
	  max = str;
	  findMaximumNum(str.toCharArray(), k);
	  System.out.print(max + "\n");
	}
}
