//Search a Word in a 2D Grid of characters.
//Given a 2D grid of characters and a word, find all occurrences of the given word in the grid. A word can be matched in all 8 directions at any point. Word is said to be found in a direction if all characters match in this direction (not in zig-zag form).
//he 8 directions are, Horizontally Left, Horizontally Right, Vertically Up, Vertically Down and 4 Diagonal directions.
//Example: 

//Input:  grid[][] = {"GEEKSFORGEEKS",
  //                  "GEEKSQUIZGEEK",
    //                "IDEQAPRACTICE"};
    //    word = "GEEKS"

//Output: pattern found at 0, 0
  //      pattern found at 0, 8
  //      pattern found at 1, 0
//Explanation: 'GEEKS' can be found as prefix of
//1st 2 rows and suffix of first row

package loveDSA;

public class $25SearchAWord {
	 // Rows and columns in the given grid
    static int R, C;
 
    // For searching in all 8 direction
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
    // This function searches in all
    // 8-direction from point
    // (row, col) in grid[][]
    static boolean search2D(char[][] grid, int row,
                            int col, String word)
    {
        // If first character of word
        // doesn't match with
        // given starting point in grid.
        if (grid[row][col] != word.charAt(0))
            return false;
 
        int len = word.length();
 
        // Search word in all 8 directions
        // starting from (row, col)
        for (int dir = 0; dir < 8; dir++) {
            // Initialize starting point
            // for current direction
            int k, rd = row + x[dir], cd = col + y[dir];
 
            // First character is already checked,
            // match remaining characters
            for (k = 1; k < len; k++) {
                // If out of bound break
                if (rd >= R || rd < 0 || cd >= C || cd < 0)
                    break;
 
                // If not matched, break
                if (grid[rd][cd] != word.charAt(k))
                    break;
 
                // Moving in particular direction
                rd += x[dir];
                cd += y[dir];
            }
 
            // If all character matched,
            // then value of must
            // be equal to length of word
            if (k == len)
                return true;
        }
        return false;
    }
 
    // Searches given word in a given
    // matrix in all 8 directions
    static void patternSearch(
        char[][] grid,
        String word)
    {
        // Consider every point as starting
        // point and search given word
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (grid[row][col]==word.charAt(0)  &&
                    search2D(grid, row, col, word))
                        System.out.println(
                            "pattern found at " + row + ", " + col);
            }
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        R = 3;
        C = 13;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        patternSearch(grid, "GEEKS");
        System.out.println();
        patternSearch(grid, "EEE");
    }
}
