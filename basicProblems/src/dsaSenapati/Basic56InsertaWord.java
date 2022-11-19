/*
Write a Java program to insert a word in the middle of the another string. 
Insert "Tutorial" in the middle of "java 1.2", so result will be java tut 18
Sample Output:

Python Tutorial 3.0
 */
package dsaSenapati;

public class Basic56InsertaWord {
	public static void main(String[] args)
	 {
	   String main_string = "Java 1.8";
	   String word = "Tutorial";
	   System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
		}
}
