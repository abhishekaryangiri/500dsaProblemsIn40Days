/*
 Longest Repeated Subsequence
 
 Given a string, print the longest repeating subsequence such that the two subsequence don’t have same string character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.
 
 Examples: 

Input: str = "aabb"
Output: "ab"

Input: str = "aab"
Output: "a"
The two subsequence are 'a'(first) and 'a' 
(second). Note that 'b' cannot be considered 
as part of subsequence as it would be at same
index in both.


 */

package loveDSA;

public class LongestRepSub12(String str) {
	int n = str.length();
	   
    // Create and initialize DP table
    int dp[][] = new int[n+1][n+1];
    for (int i=0; i<=n; i++)
        for (int j=0; j<=n; j++)
            dp[i][j] = 0;
   
    // Fill dp table (similar to LCS loops)
    for (int i=1; i<=n; i++)
    {
        for (int j=1; j<=n; j++)
        {
            // If characters match and indexes are
            // not same
            if (str.charAt(i-1)== str.charAt(j-1) && i != j)
                dp[i][j] =  1 + dp[i-1][j-1];         
                        
            // If characters do not match
            else
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
        }
}
