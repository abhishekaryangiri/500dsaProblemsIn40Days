//Check whether a String is Palindrome or not
//A string is said to be palindrome if the reverse of the string is the same as the string. For example, “abba” is a palindrome because the reverse of “abba” will be equal to “abba” so both of these strings are equal and are said to be a palindrome, but “abbc” is not a palindrome.

//There are multiple methods to check palindromic strings such as:

//Using the standard (simple) method
//Using function in C
//Using String library function of reverse and compare in C
//Using Recursion
package loveDSA;

public class $2CheckPelindrom {
	public static void main(String[] args) {

	    String str = "Radar", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
}
