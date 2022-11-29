/*
 Write a Java program to divide the two given integers using subtraction operator.

Expected Output:
Input the dividend: 625
Input the divider: 25
Result: 25.0
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic153DivideTwoGivInt {
	public static float divide_using_subtraction(int dividend, int divider) {
		if (divider == 0) {
	       return 0;
		}	   
	    float result = 0;
	    while (dividend > divider) {
	      dividend -= divider;
	      result++;
	    }
	    float decimalPart = (float) dividend / (float) divider;
	    result += decimalPart;
	    return result;
	  }	
		
	    public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	        System.out.print("Input the dividend: ");
	        int dividend = in.nextInt();
			System.out.print("Input the divider: ");
	        int divider = in.nextInt();
			System.out.println("\nResult: " + divide_using_subtraction(dividend,divider));		
			}
}
