/*
 Write a Java program to reverse the content of a sentence
  (assume a single space between two words) without reverse every word. 

Input a string: The quick brown fox jumps over the lazy dog
Result: dog lazy the over jumps fox brown quick The
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic158ReverseTheContent {
	public static String reverse_str_word(String input_sentence) {
	    if (input_sentence == null) {
	      throw new IllegalArgumentException("Input param can't be null.");
	    }
	    StringBuilder stringBuilder = new StringBuilder();
	    String[] words = input_sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	      stringBuilder.append(words[i]);
	      if (i != 0) {
	        stringBuilder.append(" ");
	      }
	    }
	    return stringBuilder.toString();
	  }
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input a string: ");
			String input = scanner.nextLine();
			System.out.println("\nResult: " + reverse_str_word(input));		
			}
}
