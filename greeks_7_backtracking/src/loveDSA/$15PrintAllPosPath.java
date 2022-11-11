/*
 *Print all possible paths from top left to bottom right of a mXn matrix
 *
 
 The problem is to print all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down.

Examples : 

Input : 1 2 3
        4 5 6
Output : 1 4 5 6
         1 2 5 6
         1 2 3 6

Input : 1 2 
        3 4
Output : 1 2 4
         1 3 4
The algorithm is a simple recursive algorithm, from each cell first print all paths by going down and then print all paths by going right. Do this recursively for each cell encountered.

Following are implementation of the above algorithm.


 */

package loveDSA;

import java.util.ArrayList;
import java.util.List;

public class $15PrintAllPosPath {

	  
    private static void printMatrix(int mat[][], int m, int n,
                                    int i, int j, List<Integer> list)
    {
          //return if i or j crosses matrix size
        if(i > m || j > n)
            return;
        list.add(mat[i][j]);
        if(i == m && j == n){
            System.out.println(list);
        }
        printMatrix(mat, m, n, i+1, j, list);
        printMatrix(mat, m, n, i, j+1, list);
        list.remove(list.size()-1);
         
         
    }
     
    // Driver code
    public static void main(String[] args)
    {
        int m = 2;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 } };
          List<Integer> list = new ArrayList<>();
        printMatrix(mat, m-1, n-1, 0, 0, list);
    }
}
