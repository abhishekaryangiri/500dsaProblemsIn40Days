/*
 Permutation refers to the process of arranging all the members of a given set to form a sequence. The number of permutations on a set of n elements is given by n! , where “!” represents factorial. 

The Permutation Coefficient represented by P(n, k) is used to represent the number of ways to obtain an ordered subset having k elements from a set of n elements.
Mathematically it’s given as: 

P(10, 2) = 90
P(10, 3) = 720
P(10, 0) = 1
P(10, 1) = 10
The coefficient can also be computed recursively using the below recursive formula:  

P(n, k) = P(n-1, k) + k* P(n-1, k-1)   
If we observe closely, we can analyze that the problem has overlapping substructure, hence we can apply dynamic programming here. Below is a program implementing the same idea. 


 */

package loveDSA;

public class $5PermutationCoe {
	 // Returns value of Permutation
    // Coefficient P(n, k)
    static int permutationCoeff(int n,
                                int k)
    {
        int P[][] = new int[n + 2][k + 2];
     
        // Calculate value of Permutation
        // Coefficient in bottom up manner
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0;
                j <= Math.min(i, k);
                j++)
            {
                // Base Cases
                if (j == 0)
                    P[i][j] = 1;
     
                // Calculate value using previously
                // stored values
                else
                    P[i][j] = P[i - 1][j] +
                            (j * P[i - 1][j - 1]);
     
                // This step is important
                // as P(i,j)=0 for j>i
                P[i][j + 1] = 0;
            }
        }
        return P[n][k];
    }
     
    // Driver Code
    public static void main(String args[])
    {
        int n = 10, k = 2;
        System.out.println("Value of P( " + n + ","+ k +")" +
                        " is " + permutationCoeff(n, k) );
    }
}
