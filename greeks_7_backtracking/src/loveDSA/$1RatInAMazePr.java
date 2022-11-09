/*
 
 Consider a rat placed at (0, 0) in a square matrix m[ ][ ] of order n and has to reach the destination at (n-1, n-1). The task is to find a sorted array of strings denoting all the possible directions which the rat can take to reach the destination at (n-1, n-1). The directions in which the rat can move are ‘U'(up), ‘D'(down), ‘L’ (left), ‘R’ (right).

Examples: 

Input : N = 4 
1 0 0 0 
1 1 0 1 
0 1 0 0 
0 1 1 1
Output :
DRDDRR

Start from the initial index (i.e. (0,0)) and look for the valid moves through the adjacent cells in the order Down->Left->Right->Up (so as to get the sorted paths) in the grid.
If the move is possible, then move to that cell while storing the character corresponding to the move(D,L,R,U) and again start looking for the valid move until the last index (i.e. (n-1,n-1)) is reached.
Also, keep on marking the cells as visited and when we traversed all the paths possible from that cell, then unmark that cell for other different paths and remove the character from the path formed.
As the last index of the grid(bottom right) is reached, then store the traversed path.
 */


package loveDSA;

import java.util.Vector;

public class $1RatInAMazePr {
	// Vector to store all the possible paths
	static Vector<String> possiblePaths = new Vector<>();
	static String path = "";
	static final int MAX =  5;
	 
	// Function returns true if the
	// move taken is valid else
	// it will return false.
	static boolean isSafe(int row, int col, int m[][],
	                      int n, boolean visited[][])
	{
	    if (row == -1 || row == n || col == -1 ||
	         col == n || visited[row][col] ||
	                     m[row][col] == 0)
	        return false;
	 
	    return true;
	}
	 
	// Function to print all the possible
	// paths from (0, 0) to (n-1, n-1).
	static void printPathUtil(int row, int col, int m[][],
	                          int n, boolean visited[][])
	{
	     
	    // This will check the initial point
	    // (i.e. (0, 0)) to start the paths.
	    if (row == -1 || row == n || col == -1 ||
	         col == n || visited[row][col] ||
	                     m[row][col] == 0)
	        return;
	 
	    // If reach the last cell (n-1, n-1)
	    // then store the path and return
	    if (row == n - 1 && col == n - 1)
	    {
	        possiblePaths.add(path);
	        return;
	    }
	 
	    // Mark the cell as visited
	    visited[row][col] = true;
	 
	    // Try for all the 4 directions (down, left,
	    // right, up) in the given order to get the
	    // paths in lexicographical order
	 
	    // Check if downward move is valid
	    if (isSafe(row + 1, col, m, n, visited))
	    {
	        path += 'D';
	        printPathUtil(row + 1, col, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }
	 
	    // Check if the left move is valid
	    if (isSafe(row, col - 1, m, n, visited))
	    {
	        path += 'L';
	        printPathUtil(row, col - 1, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }
	 
	    // Check if the right move is valid
	    if (isSafe(row, col + 1, m, n, visited))
	    {
	        path += 'R';
	        printPathUtil(row, col + 1, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }
	 
	    // Check if the upper move is valid
	    if (isSafe(row - 1, col, m, n, visited))
	    {
	        path += 'U';
	        printPathUtil(row - 1, col, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }
	 
	    // Mark the cell as unvisited for
	    // other possible paths
	    visited[row][col] = false;
	}
	 
	// Function to store and print
	// all the valid paths
	static void printPath(int m[][], int n)
	{
	    boolean [][]visited = new boolean[n][MAX];
	     
	    // Call the utility function to
	    // find the valid paths
	    printPathUtil(0, 0, m, n, visited);
	 
	    // Print all possible paths
	    for(int i = 0; i < possiblePaths.size(); i++)
	        System.out.print(possiblePaths.get(i) + " ");
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int m[][] = { { 1, 0, 0, 0, 0 },
	                  { 1, 1, 1, 1, 1 },
	                  { 1, 1, 1, 0, 1 },
	                  { 0, 0, 0, 0, 1 },
	                  { 0, 0, 0, 0, 1 } };
	    int n = m.length;
	     
	    printPath(m, n);
	}
}
