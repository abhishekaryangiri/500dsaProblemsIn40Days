/*
 Egg Dropping Puzzle
 
 The following is a description of the instance of this famous puzzle involving n=2 eggs and a building with k=36 floors.
Suppose that we wish to know which stories in a 36-storey building are safe to drop eggs from, and which will cause the eggs to break on landing. We make a few assumptions:
…..An egg that survives a fall can be used again. 
…..A broken egg must be discarded. 
…..The effect of a fall is the same for all eggs. 
…..If an egg breaks when dropped, then it would break if dropped from a higher floor. 
…..If an egg survives a fall then it would survive a shorter fall. 
…..It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor do not cause an egg to break.
If only one egg is available and we wish to be sure of obtaining the right result, the experiment can be carried out in only one way. Drop the egg from the first-floor window; if it survives, drop it from the second-floor window. Continue upward until it breaks. In the worst case, this method may require 36 droppings. Suppose 2 eggs are available. What is the least number of egg-droppings that is guaranteed to work in all cases? 
The problem is not actually to find the critical floor, but merely to decide floors from which eggs should be dropped so that the total number of trials are minimized.

k ==> Number of floors 
n ==> Number of Eggs 
eggDrop(n, k) ==> Minimum number of trials needed to find the critical 
floor in worst case.
eggDrop(n, k) = 1 + min{max(eggDrop(n – 1, x – 1), eggDrop(n, k – x)), where x is in {1, 2, …, k}}
Concept of worst case: 
For example : 
Let there be ‘2’ eggs and ‘2’ floors then-:
If we try throwing from ‘1st’ floor: 
Number of tries in worst case= 1+max(0, 1) 
0=>If the egg breaks from first floor then it is threshold floor (best case possibility). 
1=>If the egg does not break from first floor we will now have ‘2’ eggs and 1 floor to test which will give answer as 
‘1’.(worst case possibility) 
We take the worst case possibility in account, so 1+max(0, 1)=2
If we try throwing from ‘2nd’ floor: 
Number of tries in worst case= 1+max(1, 0) 
1=>If the egg breaks from second floor then we will have 1 egg and 1 floor to find threshold floor.(Worst Case) 
0=>If egg does not break from second floor then it is threshold floor.(Best Case) 
We take worst case possibility for surety, so 1+max(1, 0)=2.
The final answer is min(1st, 2nd, 3rd….., kth floor) 
So answer here is ‘2’. 
 
 
 */

package loveDSA;

public class EggDropProb20 {
	/* Function to get minimum number of
    trials needed in worst case with n
    eggs and k floors */
    static int eggDrop(int n, int k)
    {
        // If there are no floors, then
        // no trials needed. OR if there
        // is one floor, one trial needed.
        if (k == 1 || k == 0)
            return k;
 
        // We need k trials for one egg
        // and k floors
        if (n == 1)
            return k;
 
        int min = Integer.MAX_VALUE;
        int x, res;
 
        // Consider all droppings from
        // 1st floor to kth floor and
        // return the minimum of these
        // values plus 1.
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1),
                           eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
 
        return min + 1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 2, k = 10;
        System.out.print("Minimum number of "
                         + "trials in worst case with "
                         + n + " eggs and " + k
                         + " floors is " + eggDrop(n, k));
    }
}
