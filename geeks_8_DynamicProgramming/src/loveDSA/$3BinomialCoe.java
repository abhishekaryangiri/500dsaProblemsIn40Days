/*
 A binomial coefficient C(n, k) can be defined as the coefficient of x^k in the expansion of (1 + x)^n.

A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from among n objects more formally, the number of k-element subsets (or k-combinations) of a n-element set.

The Problem 
Write a function that takes two parameters n and k and returns the value of Binomial Coefficient C(n, k). For example, your function should return 6 for n = 4 and k = 2, and it should return 10 for n = 5 and k = 2.



1) Optimal Substructure 
The value of C(n, k) can be recursively calculated using the following standard formula for Binomial Coefficients.  

   C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1
Following is a simple recursive implementation that simply follows the recursive structure mentioned above.


 */

package loveDSA;

public class $3BinomialCoe {
	 // Returns value of Binomial
    // Coefficient C(n, k)
    static int binomialCoeff(int n, int k)
    {
 
        // Base Cases
        if (k > n)
            return 0;
        if (k == 0 || k == n)
            return 1;
 
        // Recur
        return binomialCoeff(n - 1, k - 1)
            + binomialCoeff(n - 1, k);
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 5, k = 2;
        System.out.printf("Value of C(%d, %d) is %d ", n, k,
                          binomialCoeff(n, k));
    }
}
