/*
 Maximize the number of segments of length p, q and r
 
 Given a rod of length L, the task is to cut the rod in such a way that the total number of segments of length p, q and r is maximized. The segments can only be of length p, q, and r. 

Examples: 

Input: l = 11, p = 2, q = 3, r = 5 
Output: 5 
Segments of 2, 2, 2, 2 and 3

Input: l = 7, p = 2, q = 5, r = 5 
Output: 2 
Segments of 2 and 5

Approach 1:

This can be visualized as a classical recursion problem , which further narrows down to memoization ( top-down ) method of Dynamic Programming. Initially , we have length l present with us , we’d have three size choices to cut from this , either we can make a cut of length p , or q , or r. Let’s say we made a cut of length p , so the remaining length would be l-p and similarly with cuts q & r resulting in remaining lengths l-q & l-r respectively. We will call recursive function for the remaining lengths and at any subsequent instance we’ll have these three choices. We will store the answer from all these recursive calls & take the maximum out of them +1 as at any instance we’ll have 1 cut from this particular call as well. Also , note that the recursive call would be made if and only if the available length is greater than length we want to cut i.e. suppose p=3 , and after certain recursive calls the available length is 2 only , so we can’t cut this line in lengths of p anymore


 */

package loveDSA;

import java.util.Arrays;
import java.util.Scanner;

public class MaxTheCut10 {
	 // Function to find the maximum number of cuts.
    static int[] dp;
 
    static int func(int l, int p, int q, int r)
    {
        if (l == 0)
            return 0; // Base Case
 
        if (dp[l] != -1) // If already memoized
            return dp[l];
 
        int a, b, c; // Intitialise a,b,& c with INT_MIN
        a = Integer.MIN_VALUE;
        b = Integer.MIN_VALUE;
        c = Integer.MIN_VALUE;
        if (p <= l) // If Possible to make a cut of length p
            a = func(l - p, p, q, r);
 
        if (q <= l) // If possible to make a cut of length q
            b = func(l - q, p, q, r);
 
        if (r <= l) // If possible to make a cut of length r
            c = func(l - r, p, q, r);
 
        return dp[l] = 1
                       + Math.max(Math.max(a, b),
                                  c); // Memoize & return
    }
 
    static int maximizeTheCuts(int l, int p, int q, int r)
    {
        Arrays.fill(dp, -1); // Set Lookup table to -1
        int ans = func(l, p, q, r); // Utility function call
 
        if (ans < 0)
            return 0; // If returned answer is negative ,
                      // that means cuts are not possible
        return ans;
    }
 
    public static void main(String[] args)
    {
        dp = new int[10005];
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ROD ");
        int l = scn.nextInt();
        System.out.println("ENTER THE VALUES OF p,q & r ");
        int p = scn.nextInt();
        int q = scn.nextInt();
        int r = scn.nextInt();
        System.out.println(
            "THE MAXIMUM NUMBER OF SEGMENTS THAT CAN BE CUT OF LENGTH p,q & r FROM A ROD OF LENGTH l are "
            + maximizeTheCuts(l, p, q, r));
    }
}
