/*
 Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1
 
 */
package dsaSenapati;

import java.util.Arrays;

public class Basic90CreateAnArr {
	 public static void main(String[] args)
	 {
	    int n= 5;
		String[] arr_string = new String[n];
		
	    for(int i = 0; i < n; i++)
	        arr_string[i] = String.valueOf(i);                                  
		 System.out.println("New Array: "+Arrays.toString(arr_string)); 
		 }
}
