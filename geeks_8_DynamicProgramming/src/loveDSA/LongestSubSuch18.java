
/*
 Longest subsequence such that difference between adjacents is one
 
 Given an array of n size, the task is to find the longest subsequence such that difference between adjacents is one. 

Examples: 

Input :  arr[] = {10, 9, 4, 5, 4, 8, 6}
Output :  3
As longest subsequences with difference 1 are, "10, 9, 8", 
"4, 5, 4" and "4, 5, 6"

Input :  arr[] = {1, 2, 3, 2, 3, 7, 2, 1}
Output :  7
As longest consecutive sequence is "1, 2, 3, 2, 3, 2, 1"

Let arr[0..n-1] be the input array and 
dp[i] be the length of the longest subsequence (with
differences one) ending at index i such that arr[i] 
is the last element of the subsequence.

Then, dp[i] can be recursively written as:
dp[i] = 1 + max(dp[j]) where 0 < j < i and 
       [arr[j] = arr[i] -1  or arr[j] = arr[i] + 1]
dp[i] = 1, if no such j exists.

To find the result for a given array, we need 
to return max(dp[i]) where 0 < i < n.


 */
package loveDSA;

public class LongestSubSuch18 {
	// Function to find the length of longest
    // subsequence
    static int longestSubseqWithDiffOne(int arr[],
                                        int n)
    {
        // Initialize the dp[] array with 1 as a
        // single element will be of 1 length
        int dp[] = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = 1;
 
        // Start traversing the given array
        for (int i = 1; i < n; i++) {
            // Compare with all the previous
            // elements
            for (int j = 0; j < i; j++) {
                // If the element is consecutive
                // then consider this subsequence
                // and update dp[i] if required.
                if ((arr[i] == arr[j] + 1) || (arr[i] == arr[j] - 1))
 
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
 
        // Longest length will be the maximum
        // value of dp array.
        int result = 1;
        for (int i = 0; i < n; i++)
            if (result < dp[i])
                result = dp[i];
        return result;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // Longest subsequence with one
        // difference is
        // {1, 2, 3, 4, 3, 2}
        int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
        int n = arr.length;
        System.out.println(longestSubseqWithDiffOne(
            arr, n));
    }
}
