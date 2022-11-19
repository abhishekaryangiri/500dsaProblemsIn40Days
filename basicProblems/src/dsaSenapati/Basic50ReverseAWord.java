/*
 . Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic50ReverseAWord {
	public static void main(String[] args){	
	     Scanner in = new Scanner(System.in);
	     System.out.print("\nInput a word: ");
		 String word = in.nextLine();
		 word = word.trim();
		 String result = ""; 
	     char[] ch=word.toCharArray();  
		 for (int i = ch.length - 1; i >= 0; i--) {
				 result += ch[i];
			 }
		 System.out.println("Reverse word: "+result.trim()); 
		 }		
}
