/*
 Write a Java program to find all of the longest word in a given dictionary.
Example-1:
{
"cat",
"flag",
"green",
"country",
"w3resource"
}
Result: "w3resource"
Example-2:
{
"cat",
"dog",
"red",
"is",
"am"
}
Result: "cat", "dog", "red"
 */
package dsaSenapati;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic126FindLongestWord {
	static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }
    
public static void main(String[] args) {
		//String [] dict = {"cat", "flag", "green", "country", "w3resource"};
		String [] dict = {"cat", "dog", "red", "is", "am"};
		System.out.println("Original dictionary : "+Arrays.toString(dict));
		System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));
	}
}
