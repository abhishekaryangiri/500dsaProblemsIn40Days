/*
 Gold Mine Problem
 
 Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner is at first column but can be at any row. He can move only (right->,right up /,right down\) that is from a given cell, the miner can move to the cell diagonally up towards the right or diagonally down towards the right. Find out maximum amount of gold he can collect. 
Examples: 
 

Input : mat[][] = {{1, 3, 3},
                   {2, 1, 4},
                  {0, 6, 4}};
Output : 12 
{(1,0)->(2,1)->(1,2)}

Input: mat[][] = { {1, 3, 1, 5},
                   {2, 2, 4, 1},
                   {5, 0, 2, 3},
                   {0, 6, 1, 2}};
Output : 16
(2,0) -> (1,1) -> (1,2) -> (0,3) OR
(2,0) -> (3,1) -> (2,2) -> (2,3)

Input : mat[][] = {{10, 33, 13, 15},
                  {22, 21, 04, 1},
                  {5, 0, 2, 3},
                  {0, 6, 14, 2}};
Output : 83



 */

package loveDSA;

public class GoldMineProb8 {
	static int collectGold(int[][] gold, int x, int y,
            int n, int m)
{

// Base condition.
if ((x < 0) || (x == n) || (y == m)) {
return 0;
}

// Right upper diagonal
int rightUpperDiagonal
= collectGold(gold, x - 1, y + 1, n, m);

// right
int right = collectGold(gold, x, y + 1, n, m);

// Lower right diagonal
int rightLowerDiagonal
= collectGold(gold, x + 1, y + 1, n, m);

// Return the maximum and store the value
return gold[x][y]
+ Math.max(Math.max(rightUpperDiagonal,
             rightLowerDiagonal),
    right);
}

static int getMaxGold(int[][] gold, int n, int m)
{
int maxGold = 0;

for (int i = 0; i < n; i++) {

// Recursive function call for  ith row.
int goldCollected
= collectGold(gold, i, 0, n, m);
maxGold = Math.max(maxGold, goldCollected);
}

return maxGold;
}
public static void main(String[] args)
{
int[][] gold = { { 1, 3, 1, 5 },
       { 2, 2, 4, 1 },
       { 5, 0, 2, 3 },
       { 0, 6, 1, 2 } };
int m = 4, n = 4;
System.out.println(getMaxGold(gold, n, m));
}
}
