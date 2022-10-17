//Search an element in a Matrix
//Given an n x n matrix and an integer x, find the position of x in the matrix if it is present. Otherwise, print “Element not found”. Every row and column of the matrix is sorted in increasing order. The designed algorithm should have linear time complexity

//Examples: 

//Input: mat[4][4] = { {10, 20, 30, 40},  x = 29
                 //              {15, 25, 35, 45},
                //               {27, 29, 37, 48},
               //              {32, 33, 39, 50}}
 
//Output: Found at (2, 1)

package loveDSA;

public class $36SearchInARow {
	  static int search(int[][] mat, int n, int x)
	    {
	        if (n == 0)
	            return -1;
	 
	        // traverse through the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	                // if the element is found
	                if (mat[i][j] == x) {
	                    System.out.print("Element found at ("
	                                     + i + ", " + j
	                                     + ")\n");
	                    return 1;
	                }
	        }
	 
	        System.out.print(" Element not found");
	        return 0;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int mat[][] = { { 10, 20, 30, 40 },
	                        { 15, 25, 35, 45 },
	                        { 27, 29, 37, 48 },
	                        { 32, 33, 39, 50 } };
	 
	        // Function call
	        search(mat, 4, 29);
	    }
}
