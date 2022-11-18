/*
  Write a Java program to find the size of a specified file. Go to the editor
Sample Output:

/home/students/abc.txt  : 0 bytes                                      
/home/students/test.txt : 0 bytes 
 * 
 */
package dsaSenapati;

import java.io.File;

public class Basic34FindSizeOfSpecFile {
	 public static void main(String[] args) {
		  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
		  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
		 }
}
