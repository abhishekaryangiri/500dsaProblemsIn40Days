/*
 LCS (Longest Common Subsequence) of three strings
 
 Given 3 strings of all having length < 100,the task is to find the longest common sub-sequence in all three given sequences.

Examples: 

Input : str1 = "geeks"  
        str2 = "geeksfor"  
        str3 = "geeksforgeeks"
Output : 5
Longest common subsequence is "geeks"
i.e., length = 5

Input : str1 = "abcd1e2"  
        str2 = "bc12ea"  
        str3 = "bd1ea"
Output : 3
Longest common subsequence is "b1e" 
i.e. length = 3.

This problem is simply an extension of LCS
Let the input sequences be X[0..m-1], Y[0..n-1] and Z[0..o-1] of lengths m, n and o respectively. And let L(X[0..m-1], Y[0..n-1], Z[0..o-1]) be the lengths of LCS of the three sequences X, Y and Z. 

The idea is to take a 3D array to store the 
length of common subsequence in all 3 given 
sequences i. e., L[m + 1][n + 1][o + 1]

1- If any of the string is empty then there
   is no common subsequence at all then
           L[i][j][k] = 0

2- If the characters of all sequences match
   (or X[i] == Y[j] ==Z[k]) then
        L[i][j][k] = 1 + L[i-1][j-1][k-1]

3- If the characters of both sequences do 
   not match (or X[i] != Y[j] || X[i] != Z[k] 
   || Y[j] !=Z[k]) then
        L[i][j][k] = max(L[i-1][j][k], 
                         L[i][j-1][k], 
                         L[i][j][k-1])
                         
                         
 */

package loveDSA;

public class LCS15 {
	   
    /* Returns length of LCS for X[0..m-1], Y[0..n-1]
       and Z[0..o-1] */
    static int lcsOf3(String X, String Y, String Z, int m,
                                   int n, int o)
    {
        int[][][] L = new int[m+1][n+1][o+1];
      
        /* Following steps build L[m+1][n+1][o+1] in
           bottom up fashion. Note that L[i][j][k]
           contains length of LCS of X[0..i-1] and
           Y[0..j-1]  and Z[0.....k-1]*/
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                for (int k=0; k<=o; k++)
                {
                    if (i == 0 || j == 0||k==0)
                        L[i][j][k] = 0;
      
                    else if (X.charAt(i - 1) == Y.charAt(j - 1)
                                && X.charAt(i - 1)==Z.charAt(k - 1))
                        L[i][j][k] = L[i-1][j-1][k-1] + 1;
      
                    else
                        L[i][j][k] = Math.max(Math.max(L[i-1][j][k],
                                             L[i][j-1][k]),
                                         L[i][j][k-1]);
                }
            }
        }
      
        /* L[m][n][o] contains length of LCS for
          X[0..n-1] and Y[0..m-1] and Z[0..o-1]*/
        return L[m][n][o];
    }
      
    /* Driver program to test above function */
    public static void main(String args[])
    {
        String X = "AGGT12";
        String Y = "12TXAYB";
        String Z = "12XBA";
      
        int m = X.length();
        int n = Y.length();
        int o = Z.length();
      
        System.out.println("Length of LCS is " +
                                lcsOf3(X, Y,Z, m, n, o));
      
    }
}
