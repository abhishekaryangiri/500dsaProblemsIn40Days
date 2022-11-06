/*
 Greedy Algorithm to find Minimum number of Coins
 
 Given a value of V Rs and an infinite supply of each of the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, The task is to find the minimum number of coins and/or notes needed to make the change?

Examples:  

Input: V = 70
Output: 2
Explanation: We need a 50 Rs note and a 20 Rs note.

Input: V = 121
Output: 3
Explanation: We need a 100 Rs note, a 20 Rs note, and a 1 Rs coin.
The intuition would be to take coins with greater value first. This can reduce the total number of coins needed. Start from the largest possible denomination and keep adding denominations while the remaining value is greater than 0. 

Follow the steps below to implement the idea: 

Sort the array of coins in decreasing order.
Initialize ans vector as empty.
Find the largest denomination that is smaller than remaining amount and while it is smaller than the remaining amount:
Add found denomination to ans. Subtract value of found denomination from amount.
If amount becomes 0, then print ans.

 */
package loveDSA;

import java.util.Vector;

public class $6greedyAlgoToFindMin {

    // All denominations of Indian Currency
    static int deno[] = {1, 2, 5, 10, 20,
    50, 100, 500, 1000};
    static int n = deno.length;
 
    static void findMin(int V)
    {
        // Initialize result
        Vector<Integer> ans = new Vector<>();
 
        // Traverse through all denomination
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations
            while (V >= deno[i])
            {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }
 
        // Print result
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                " " + ans.elementAt(i));
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 93;
        System.out.print(
            "Following is minimal number "
            +"of change for " + n + ": ");
        findMin(n);
    }
}
