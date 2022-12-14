//Minimum Swaps for Bracket Balancing
//You are given a string of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the form S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters. Calculate the minimum number of swaps necessary to make a string balanced.

//Examples: 

//Input  : []][][
//Output : 2
//First swap: Position 3 and 4
//[][]][
//Second swap: Position 5 and 6
//[][][]

package loveDSA;

import java.util.Vector;

public class $30MinSwap {

    
	// Function to calculate swaps required
	public static long swapCount(String s)
	{
	     
	    // Keep track of '['
	    Vector<Integer> pos = new Vector<Integer>();
	    for(int i = 0; i < s.length(); ++i)
	        if (s.charAt(i) == '[')
	            pos.add(i);
	             
	    // To count number of encountered '['
	    int count = 0;
	     
	    // To track position of next '[' in pos
	    int p = 0; 
	     
	    // To store result
	    long sum = 0;
	     
	    char[] S = s.toCharArray();
	     
	    for(int i = 0; i < s.length(); ++i)
	    {
	         
	        // Increment count and move p
	        // to next position
	        if (S[i] == '[')
	        {
	            ++count;
	            ++p;
	        }
	        else if (S[i] == ']')
	            --count;
	  
	        // We have encountered an
	        // unbalanced part of string
	        if (count < 0)
	        {
	             
	            // Increment sum by number of
	            // swaps required i.e. position
	            // of next '[' - current position
	            sum += pos.get(p) - i;
	            char temp = S[i];
	            S[i] = S[pos.get(p)];
	            S[pos.get(p)] = temp;
	            ++p;
	  
	            // Reset count to 1
	            count = 1;
	        }
	    }
	    return sum;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    String s = "[]][][";
	    System.out.println(swapCount(s));
	  
	    s = "[[][]]";
	    System.out.println(swapCount(s));
	}
}
