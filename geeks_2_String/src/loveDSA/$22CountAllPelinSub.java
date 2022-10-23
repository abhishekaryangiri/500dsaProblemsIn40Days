//Count All Palindromic Subsequence in a given String
//Find how many palindromic subsequences (need not necessarily be distinct) can be formed in a given string. Note that the empty string is not considered a palindrome. 

//Examples: 

//Input : str = "abcd"
//Output : 4
//Explanation :- palindromic  subsequence are : "a" ,"b", "c" ,"d" 

//Input : str = "aab"
//Output : 4
//Explanation :- palindromic subsequence are :"a", "a", "b", "aa"

package loveDSA;

public class $22CountAllPelinSub {
	  // Function return the total palindromic
    // subsequence
    static int countPS(String str)
    {
        int N = str.length();
 
        // create a 2D array to store the count
        // of palindromic subsequence
        int[][] cps = new int[N][N];
 
        // palindromic subsequence of length 1
        for (int i = 0; i < N; i++)
            cps[i][i] = 1;
 
        // check subsequence of length L is
        // palindrome or not
        for (int L = 2; L <= N; L++) {
            for (int i = 0; i <= N-L; i++) {
                int k = L + i - 1;
              if (str.charAt(i) == str.charAt(k)) {
                cps[i][k] = cps[i][k - 1]
                                    + cps[i + 1][k] + 1;
              }else{
                cps[i][k] = cps[i][k - 1]
                                    + cps[i + 1][k]
                                    - cps[i + 1][k - 1];
              }
            }
        }
 
        // return total palindromic subsequence
        return cps[0][N - 1];
    }
 
    // Driver program
    public static void main(String args[])
    {
        String str = "abcb";
        System.out.println("Total palindromic "
                           + "subsequence are : "
                           + countPS(str));
    }
}
