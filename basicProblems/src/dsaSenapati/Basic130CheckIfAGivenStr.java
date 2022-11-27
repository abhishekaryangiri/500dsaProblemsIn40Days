/*
 Write a Java program to check if a given string has all unique characters. 
Sample Output: Original String : xyyz
String has all unique characters: false
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic130CheckIfAGivenStr {
	 /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
		//String str = "xyz";
		String str = "xyyz";
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+is_Unique_str(str));
	}
}
