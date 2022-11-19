/*
  Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. 
  The length of the original string must be 3 and above. 
  Sample Output:

3.03.03.03.0 
 */
package dsaSenapati;

public class Basic57CreateANewStr {
	 public static void main(String[] args)
	 {
	   String main_string = "Java .18";
	      
	   String last_three_chars = main_string.substring(main_string.length() - 3);
	   System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
	  }
}
