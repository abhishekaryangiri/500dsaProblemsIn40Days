//Word Wrap Problem [VERY IMP].
//Given a sequence of words, and a limit on the number of characters that can be put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly. Assume that the length of each word is smaller than the line width.
//The word processors like MS Word do task of placing line breaks. The idea is to have balanced lines. In other words, not have few lines with lots of extra spaces and some lines with small amount of extra spaces. 

//The extra spaces includes spaces put at the end of every line except the last one.  
//The problem is to minimize the following total cost.
 //Cost of a line = (Number of extra spaces in the line)^3
 //Total Cost = Sum of costs for all lines

//For example, consider the following string and line width M = 15
 //"Geeks for Geeks presents word wrap problem" 
     
//Following is the optimized arrangement of words in 3 lines
//Geeks for Geeks
//presents word
//wrap problem 

//The total extra spaces in line 1, line 2 and line 3 are 0, 2 and 3 respectively. 
//So optimal value of total cost is 0 + 2*2*2 + 3*3*3 = 35
package loveDSA;

import java.util.Arrays;

public class $13WordWrap {
	 private int solveWordWrap(int[] nums, int k) {
	        int[][] memo = new int[nums.length][k + 1];
	        for (int i = 0; i < nums.length; i++) {
	            Arrays.fill(memo[i], -1);
	        }
	        return solveWordWrapUsingMemo(nums, nums.length, k, 0, k, memo);
	    }
	 
	    private int solveWordWrap(int[] words, int n, int length, int wordIndex, int remLength, int[][] memo) {
	 
	        //base case for last word
	        if (wordIndex == n - 1) {
	            memo[wordIndex][remLength] = words[wordIndex] < remLength ? 0 : square(remLength);
	            return memo[wordIndex][remLength];
	        }
	 
	        int currWord = words[wordIndex];
	        //if word can fit in the remaining line
	        if (currWord < remLength) {
	            return Math.min(
	                    //if word is kept on same line
	                    solveWordWrapUsingMemo(words, n, length, wordIndex + 1, remLength == length ? remLength - currWord : remLength - currWord - 1, memo),
	                    //if word is kept on next line
	                    square(remLength) + solveWordWrapUsingMemo(words, n, length, wordIndex + 1, length - currWord, memo)
	            );
	        } else {
	            //if word is kept on next line
	            return square(remLength) + solveWordWrapUsingMemo(words, n, length, wordIndex + 1, length - currWord, memo);
	        }
	    }
	 
	    private int solveWordWrapUsingMemo(int[] words, int n, int length, int wordIndex, int remLength, int[][] memo) {
	        if (memo[wordIndex][remLength] != -1) {
	            return memo[wordIndex][remLength];
	        }
	 
	        memo[wordIndex][remLength] = solveWordWrap(words, n, length, wordIndex, remLength, memo);
	        return memo[wordIndex][remLength];
	    }
	 
	    private int square(int n) {
	        return n * n;
	    }
	 
	    public static void main(String[] args) {
	        System.out.println(new $13WordWrap().solveWordWrap(new int[]{3, 2, 2, 5}, 6));
	    }
}
