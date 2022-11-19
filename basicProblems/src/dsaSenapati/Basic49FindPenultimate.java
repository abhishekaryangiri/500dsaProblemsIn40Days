/*
 Write a Java program to find the penultimate (next to last) word of a sentence. 
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic49FindPenultimate {
	public static void main(String[] args){	
	     Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
		 String line = in.nextLine();
		 String[] words = line.split("[ ]+");
		 System.out.println("Penultimate word: "+words[words.length - 2]);
		 }	
}
