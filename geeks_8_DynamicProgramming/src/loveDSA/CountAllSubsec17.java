/*
 Count all subsequences having product less than K
 
 Given a positive array, find the number of subsequences having product smaller than or equal to K.
Examples: 

Input : [1, 2, 3, 4] 
        k = 10
Output :11 
Explanation: The subsequences are {1}, {2}, {3}, {4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {1, 2, 3}, {1, 2, 4}

Input  : [4, 8, 7, 2] 
         k = 50
Output : 9

This problem can be solved using dynamic programming where dp[i][j] = number of subsequences having product less than i using first j terms of the array. Which can be obtained by : number of subsequences using first j-1 terms + number of subsequences that can be formed using j-th term. 


 * 
 */
package loveDSA;

import java.util.ArrayList;

public class CountAllSubsec17 {
	 // Function to count numbers of such
    // subsequences having product less than k.
    public static int productSubSeqCount(ArrayList<Integer> arr,
                                                 int k)
    {
        int n = arr.size();
        int dp[][]=new int[k + 1][n + 1];
         
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
         
                // number of subsequence using j-1 terms
                dp[i][j] = dp[i][j - 1];
         
                // if arr[j-1] > i it will surely make
                // product greater thus it won't contribute
                // then
                if (arr.get(j-1) <= i && arr.get(j-1) > 0)
     
                    // number of subsequence using 1 to j-1
                    // terms and j-th term
                    dp[i][j] += dp[i/arr.get(j - 1)][j - 1] + 1;
            }
        }
        return dp[k][n];
    }
     
    // Driver code
    public static void main(String args[])
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        int k = 10;
        System.out.println(productSubSeqCount(A, k));
    }
}
