/*
 * Program for nth catalan number
 * 
 * 
 Catalan numbers are defined as a mathematical sequence that consists of positive integers, which can be used to find the number of possibilities of various combinations. 

The nth term in the sequence denoted Cn, is found in the following formula: \frac{(2n)!}{(n + 1)! n!)}      

The first few Catalan numbers for n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …  

Catalan numbers occur in many interesting counting problems like the following.

Count the number of expressions containing n pairs of parentheses that are correctly matched. For n = 3, possible expressions are ((())), ()(()), ()()(), (())(), (()()).
Count the number of possible Binary Search Trees with n keys (See this)
Count the number of full binary trees (A rooted binary tree is full if every vertex has either two children or no children) with n+1 leaves.
Given a number n, return the number of ways you can draw n chords in a circle with 2 x n points such that no 2 chords intersect.

Follow the steps below to implement the above recursive formula

Base condition for the recursive approach, when n <= 1, return 1
Iterate from i = 0 to i < n
Make a recursive call catalan(i) and catalan(n – i – 1) and keep adding the product of both into res.
Return the res.



 */

package loveDSA;

public class $4ProgramForNthCatalanNum {
	 // A recursive function to find nth catalan number
	 
    int catalan(int n)
    {
        int res = 0;
 
        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
    	$4ProgramForNthCatalanNum cn = new $4ProgramForNthCatalanNum();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");
        }
    }
}
