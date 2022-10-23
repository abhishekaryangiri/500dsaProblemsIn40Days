//Minimum characters to be added at front to make string palindrome
//Given string str we need to tell minimum characters to be added in front of the string to make string palindrome.

//Examples: 

//Input  : str = "ABC"
//Output : 2
///We can make above string palindrome as "CBABC"
//by adding 'B' and 'C' at front.


package loveDSA;

public class $35MinChar {

	// function for checking string is palindrome or not
	    static boolean ispalindrome(String s) {
	        int l = s.length();
	 
	        for (int i = 0, j = l - 1; i <= j; i++, j--) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	// Driver code
	    public static void main(String[] args) {
	        String s = "BABABAA";
	        int cnt = 0;
	        int flag = 0;
	 
	        while (s.length() > 0) {
	            // if string becomes palindrome then break
	            if (ispalindrome(s)) {
	                flag = 1;
	                break;
	            } else {
	                cnt++;
	 
	                // erase the last element of the string
	                s = s.substring(0, s.length() - 1);
	                //s.erase(s.begin() + s.length() - 1);
	            }
	        }
	 
	        // print the number of insertion at front
	        if (flag == 1) {
	            System.out.println(cnt);
	        }
	    }
}
