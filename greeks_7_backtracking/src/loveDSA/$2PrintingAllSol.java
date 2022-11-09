/*
 Printing all solutions in N-Queen Problem
 
 The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. For example, following is a solution for 4 Queen problem.
 
 the task is to print all solutions in N-Queen Problem. Each solution contains distinct board configurations of the N-queens’ placement, where the solutions are a permutation of [1,2,3..n] in increasing order, here the number in the ith place denotes that the ith-column queen is placed in the row with that number. For the example above solution is written as [[2 4 1 3 ] [3 1 4 2 ]]. The solution discussed here is an extension of the same approach
 
 
 
 The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

1) Start in the leftmost column
2) If all queens are placed
    return true
3) Try all rows in the current column.  Do following
   for every tried row.
    a) If the queen can be placed safely in this row
       then mark this [row, column] as part of the 
       solution and recursively check if placing  
       queen here leads to a solution.
    b) If placing queen in [row, column] leads to a
       solution then return true.
    c) If placing queen doesn't lead to a solution 
       then unmark this [row, column] (Backtrack) 
       and go to step (a) to try other rows.
3) If all rows have been tried and nothing worked, 
   return false to trigger backtracking.
A modification is that we can find whether we have a previously placed queen in a column or in left diagonal or in right diagonal in O(1) time. We can observe that 

For all cells in a particular left diagonal , their row + col  = constant.
For all cells in a particular right diagonal, their row – col + n – 1 = constant.

 */

package loveDSA;

import java.util.ArrayList;
import java.util.List;

public class $2PrintingAllSol {

	  /* This function solves the N Queen problem using
	    Backtracking. It mainly uses solveNQUtil() to
	    solve the problem.
	    */
	    static List<List<Integer>> nQueen(int n) {
	       // cols[i] = true if there is a queen previously placed at ith column
	        cols = new boolean[n];
	        // leftDiagonal[i] = true if there is a queen previously placed at
	          // i = (row + col )th left diagonal
	        leftDiagonal = new boolean[2*n];
	          // rightDiagonal[i] = true if there is a queen previously placed at
	          // i = (row - col + n - 1)th rightDiagonal diagonal
	        rightDiagonal = new boolean[2*n];
	        result  = new ArrayList<>();
	        List<Integer> temp = new ArrayList<>();
	        for(int i=0;i<n;i++)temp.add(0);
	        solveNQUtil(result,n,0,temp);
	         
	        return result;
	    }
	    private static void solveNQUtil(List<List<Integer>> result,int n,int row,List<Integer> comb){
	        if(row==n){
	          // if row==n it means we have successfully placed all n queens.
	          // hence add current arrangement to our answer
	          // comb represent current combination
	            result.add(new ArrayList<>(comb));
	            return;
	        }
	        for(int col = 0;col<n;col++){
	           // if we have a queen previously placed in the current column
	           // or in current left or right diagonal we continue
	            if(cols[col] || leftDiagonal[row+col] || rightDiagonal[row-col+n])
	                continue;
	           // otherwise we place a queen at cell[row][col] and
	           //make current column, left diagonal and right diagonal true
	            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = true;
	            comb.set(col,row+1);
	            // then we goto next row
	            solveNQUtil(result,n,row+1,comb);
	            // then we backtrack and remove our currently placed queen
	            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = false;
	        }
	    }
	  static List<List<Integer> > result
	        = new ArrayList<List<Integer> >();
	   static boolean[] cols,leftDiagonal,rightDiagonal;
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int n = 4;
	 
	        List<List<Integer> > res = nQueen(n);
	        System.out.println(res);
	    }
}
