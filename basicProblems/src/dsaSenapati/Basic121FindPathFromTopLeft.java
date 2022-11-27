/*
 Write a Java program to find a path from top left to bottom in right direction which minimizes the sum of all numbers along its path. 
Note: Move either down or right at any point in time.
Sample Output: Sum of all numbers along its path: 13
 */
package dsaSenapati;

public class Basic121FindPathFromTopLeft {
	public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                   if (i == 0 && j == 0) {
                    temp[i][j] = grid[i][j];
                    continue;
                } 
                // Compute temp
                int from_up = i == 0 ? Integer.MAX_VALUE : temp[i - 1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
                temp[i][j] = Math.min(from_up, from_left) + grid[i][j];               
            }
        }
       return temp[m - 1][n - 1];
    }
    /* Driver program to test above functions */
    public static void main(String[] args) {
     
		int[][] grid = new int[][] {{7,4,2},
		                            {0,5,6},
    		                        {3,1,2}};
		                          
		System.out.println("Sum of all numbers along its path: "+minPathSum(grid));
	}	
}
