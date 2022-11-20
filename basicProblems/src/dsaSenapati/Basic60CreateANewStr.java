/*
  Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. 
Test Data: Str1 = " "
Sample Output:

###
 */
package dsaSenapati;

public class Basic60CreateANewStr {
	public static void main(String[] args)
	 {
	    String str1 = "";    
		int len = str1.length();
		if(len >= 3)
			System.out.println( str1.substring(0, 3));
		else if(len == 1)
			System.out.println( (str1.charAt(0)+"##"));
		else
			System.out.println("###");
		}
}
