/*
 Write a Java program to convert a string to an integer in Java. Go to the editor
Sample Output:

Input a number(string): 25                                             
The integer value is: 25
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic40ConvertStringIntoInt {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input a number(string): ");
	        String str1 = in.nextLine();
			int result = Integer.parseInt(str1);
	        System.out.printf("The integer value is: %d",result);
			System.out.printf("\n");
	    }
}
