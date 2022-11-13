/*
 Longest Increasing Subsequence | DP-3
 
 Now, let us discuss the Longest Increasing Subsequence (LIS) problem as an example problem that can be solved using Dynamic Programming. 

The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}. 

Input: arr[] = {3, 10, 2, 1, 20}
Output: Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output: Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}


 */
package loveDSA;

public class LongestInc13 {
	static int max_ref; // stores the LIS
	 
    /* To make use of recursive calls, this function must
    return two things: 1) Length of LIS ending with element
    arr[n-1]. We use max_ending_here for this purpose 2)
    Overall maximum as the LIS may end with an element
       before arr[n-1] max_ref is used this purpose.
    The value of LIS of full array of size n is stored in
    *max_ref which is our final result */
    static int _lis(int arr[], int n)
    {
        // base case
        if (n == 1)
            return 1;
 
        // 'max_ending_here' is length of LIS ending with
        // arr[n-1]
        int res, max_ending_here = 1;
 
        /* Recursively get all LIS ending with arr[0],
           arr[1] ... arr[n-2]. If   arr[i-1] is smaller
           than arr[n-1], and max ending with arr[n-1] needs
           to be updated, then update it */
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1]
                && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
 
        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
 
        // Return length of LIS ending with arr[n-1]
        return max_ending_here;
    }
 
    // The wrapper function for _lis()
    static int lis(int arr[], int n)
    {
        // The max variable holds the result
        max_ref = 1;
 
        // The function _lis() stores its result in max
        _lis(arr, n);
 
        // returns max
        return max_ref;
    }
 
    // driver program to test above functions
    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n)
                           + "\n");
    }
}
