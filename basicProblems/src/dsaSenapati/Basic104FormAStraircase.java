/*
 Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic104FormAStraircase {
	public static void main(String[] arg) {
		  Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}       	
		}
}
