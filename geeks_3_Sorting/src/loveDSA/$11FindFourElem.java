//Find four elements that sum to a given value | Set 1 (n^3 solution)
//Given an array of integers, find all combination of four elements in the array whose sum is equal to a given value X. 
//For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23, then your function should print “3 5 7 8” (3 + 5 + 7 + 8 = 23).

package loveDSA;

public class $11FindFourElem {

    /* A naive solution to print all combination of 4 elements in A[]
       with sum equal to X */
    void findFourElements(int A[], int n, int X)
    {
        // Fix the first element and find other three
        for (int i = 0; i < n - 3; i++)
        {
            // Fix the second element and find other two
            for (int j = i + 1; j < n - 2; j++)
            {
                // Fix the third element and find the fourth
                for (int k = j + 1; k < n - 1; k++)
                {
                    // find the fourth
                    for (int l = k + 1; l < n; l++)
                    {
                        if (A[i] + A[j] + A[k] + A[l] == X)
                            System.out.print(A[i]+" "+A[j]+" "+A[k]
                                                                 +" "+A[l]);
                    }
                }
            }
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
    	$11FindFourElem findfour = new $11FindFourElem();
        int A[] = {10, 20, 30, 40, 1, 2};
        int n = A.length;
        int X = 91;
        findfour.findFourElements(A, n, X);
    }
}
