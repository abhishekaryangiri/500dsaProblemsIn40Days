//Longest Common Subsequence | DP-4
//LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3. 
//LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4. 
package loveDSA;

public class $31LongestComSub {
	  
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	int lcs( char[] X, char[] Y, int m, int n ) 
	{ 
	    if (m == 0 || n == 0) 
	    return 0; 
	    if (X[m-1] == Y[n-1]) 
	    return 1 + lcs(X, Y, m-1, n-1); 
	    else
	    return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n)); 
	} 
	  
	/* Utility function to get max of 2 integers */
	int max(int a, int b) 
	{ 
	    return (a > b)? a : b; 
	} 
	  
	public static void main(String[] args) 
	{ 
		$31LongestComSub lcs = new $31LongestComSub(); 
	    String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	  
	    System.out.println("Length of LCS is" + " " + 
	                                lcs.lcs( X, Y, m, n ) ); 
	} 
}
