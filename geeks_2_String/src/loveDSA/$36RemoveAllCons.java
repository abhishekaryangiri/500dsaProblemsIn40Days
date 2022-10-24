//Given a string S, The task is to remove all the consecutive duplicate characters of the string and return the resultant string. 

//Note: that this problem is different from Recursively remove all adjacent duplicates. Here we keep one character and remove all subsequent same characters.

//xamples: 

//Input: S= “aaaaabbbbbb”
//Output: ab
//

//Input: S = “geeksforgeeks”
//Output: geksforgeks

//Input: S = “aabccba”
//Output: abcba
package loveDSA;

public class $36RemoveAllCons {
	public static String
    removeConsecutiveDuplicates(String input)
    {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates(
                input.substring(1));
        else
            return input.charAt(0)
                + removeConsecutiveDuplicates(
                       input.substring(1));
    }
    public static void main(String[] args)
    {
        String S1 = "geeksforgeeks";
        System.out.println(removeConsecutiveDuplicates(S1));
 
        String S2 = "aabcca";
        System.out.println(removeConsecutiveDuplicates(S2));
    }
}
