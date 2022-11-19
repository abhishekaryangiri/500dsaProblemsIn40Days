/*
 . Write a Java program to convert a given string into lowercase. 
Sample Output:

Input a String: MEN WILL BE MEN         
men will be men
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic48ConvStringIntoLowerCase {
	public static void main(String[] args){	
	     Scanner in = new Scanner(System.in);
	     System.out.print("Input a String: ");
		 String line = in.nextLine();
		 line = line.toLowerCase();
		 System.out.println(line); 
		 }			
}
