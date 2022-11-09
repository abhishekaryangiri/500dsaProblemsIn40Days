/*
 Word Break Problem using Backtracking
 
 Given a valid sentence without any spaces between the words and a dictionary of valid English words, find all possible ways to break the sentence into individual dictionary words.

Example:

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  and, cream, icecream, man, go, mango}

Input: "ilikesamsungmobile"
Output: i like sam sung mobile
        i like samsung mobile

Input: "ilikeicecreamandmango"
Output: i like ice cream and man go
        i like ice cream and mango
        i like icecream and man go
        i like icecream and mango
        
        We start scanning the sentence from the left. As we find a valid word, we need to check whether the rest of the sentence can make valid words or not. Because in some situations the first found word from the left side can leave a remaining portion that is not further separable. So, in that case, we should come back and leave the currently found word and keep on searching for the next word. And this process is recursive because to find out whether the right portion is separable or not, we need the same logic. So we will use recursion and backtracking to solve this problem. To keep track of the found words we will use a stack. Whenever the right portion of the string does not make valid words, we pop the top string from the stack and continue finding.

Below is the implementation of the above idea:


 */

package loveDSA;

import java.util.Arrays;
import java.util.List;

public class $3WordBreakProb {
	// Prints all possible word breaks of given string
	  static void wordBreak(int n, List<String> dict, String s)
	  {
	    String ans="";
	    wordBreakUtil(n, s, dict, ans);
	  }
	 
	  static void wordBreakUtil(int n, String s, List<String> dict, String ans)
	  {
	    for(int i = 1; i <= n; i++)
	    {
	 
	      // Extract substring from 0 to i in prefix
	      String prefix=s.substring(0, i);
	 
	      // If dictionary contains this prefix, then
	      // we check for remaining string. Otherwise
	      // we ignore this prefix (there is no else for
	      // this if) and try next
	      if(dict.contains(prefix))
	      {
	        // If no more elements are there, print it
	        if(i == n)
	        {
	 
	          // Add this element to previous prefix
	          ans += prefix;
	          System.out.println(ans);
	          return;
	        }
	        wordBreakUtil(n - i, s.substring(i,n), dict, ans+prefix+" ");
	      }
	    }
	  }
	 
	  // main function
	  public static void main(String args[])
	  {
	    String str1 = "iloveicecreamandmango"; // for first test case
	    String str2 ="ilovesamsungmobile";     // for second test case
	    int n1 = str1.length();                 // length of first string
	    int n2 = str2.length();                 // length of second string
	 
	    // List of strings in dictionary
	    List <String> dict= Arrays.asList("mobile","samsung","sam","sung",
	                                      "man","mango", "icecream","and",
	                                      "go","i","love","ice","cream");        
	    System.out.println("First Test:");
	 
	    // call to the method
	    wordBreak(n1,dict,str1);
	    System.out.println("\nSecond Test:");
	 
	    // call to the method
	    wordBreak(n2,dict,str2);
	  }
}
