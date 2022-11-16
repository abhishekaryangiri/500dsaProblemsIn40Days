/*
 . Write a Java program to convert a decimal number to octal number. Go to the editor
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17

Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.

Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 */
package dsaSenapati;

import java.util.Scanner;

public class Basic14ConDeciToOctal {
	 public static void main(String args[])
	    {
	            int dec_num, rem, quot, i=1, j;
	        int oct_num[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Input a Decimal Number: ");
	        dec_num = scan.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            oct_num[i++] = quot%8;
	            quot = quot/8;
	        }
			
	        System.out.print("Octal number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct_num[j]);
	        }
			System.out.print("\n");
	    }
}
