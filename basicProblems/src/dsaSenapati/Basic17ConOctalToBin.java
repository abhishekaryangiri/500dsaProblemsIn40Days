/*
 Write a Java program to convert a octal number to a binary number. 
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111 

Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.

Binary number: A binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).

 */
package dsaSenapati;

import java.util.Scanner;

public class Basic17ConOctalToBin {
	public static void main(String[] args) 
	 {
	  Scanner in = new Scanner(System.in);
	  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
	  long octal_num, tempoctal_num, binary_num, place;
	  int rem;
	  System.out.print("Input any octal number: ");
	  octal_num = in.nextLong();
	  tempoctal_num = octal_num;
	  binary_num = 0;
	  place = 1;
	  while (tempoctal_num != 0)
	  {
	   rem = (int)(tempoctal_num % 10);
	   binary_num = octal_numvalues[rem] * place + binary_num;
	   tempoctal_num /= 10;
	   place *= 1000;
	  }
	  System.out.print("Equivalent binary number: " + binary_num+"\n");
	 }
}
