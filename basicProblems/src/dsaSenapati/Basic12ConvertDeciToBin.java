/*
 Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 

Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.

Binary number: In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).

 */
package dsaSenapati;

import java.util.Scanner;

public class Basic12ConvertDeciToBin {
	   public static void main(String args[])
	    {
	        int dec_num, quot, i=1, j;
	        int bin_num[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Input a Decimal Number : ");
	        dec_num = scan.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            bin_num[i++] = quot%2;
	            quot = quot/2;
	        }
			
	        System.out.print("Binary number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bin_num[j]);
	        }
	        System.out.print("\n");
	    }
}
