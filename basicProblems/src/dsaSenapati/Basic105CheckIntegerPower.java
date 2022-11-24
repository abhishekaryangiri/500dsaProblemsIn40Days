/*
 Write a Java program to check whether a given integer is a power of 4 or not
 Given num = 64, return true. Given num = 6, return false.
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic105CheckIntegerPower {
	 public static void main(String[] arg) 
	 {
	   int test = 0;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input a positive integer: ");
	   int n = in.nextInt(); 
       if (n < 1) {
			 System.out.print(Boolean.toString(false));
			 test = 1;
		}
		if ((n & (n - 1)) != 0) {
			System.out.print(Boolean.toString(false));
			test = 1;
		}
		if (test==0)
		{
			System.out.print(Boolean.toString((n & 0x55555555) != 0));      	
		}
		System.out.print("\n");
	}	
}
