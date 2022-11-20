/*
 Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. 
 Test Data: Str1 = abcd
Str2 = abcd
Sample Output:

ythonutorial
 */
package dsaSenapati;

public class Basic59ConcatinationOfTwoStr {
	public static void main(String[] args)
	 {
	    String str1 = "Abhishek";    
		String str2 = "Aryan"; 
		
		System.out.println(str1.substring(1) + str2.substring(1));
		} 
}
