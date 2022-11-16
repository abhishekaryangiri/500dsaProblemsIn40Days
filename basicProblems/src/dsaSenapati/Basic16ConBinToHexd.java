/*
 Write a Java program to convert a binary number to hexadecimal number. Go to the editor
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D

Binary number: A binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 0(zero) and 1(one).

Hexadecimal number: This is a positional numeral system with a radix, or base, of 16. Hexadecimal uses sixteen distinct symbols, most often the symbols 0-9 to represent values zero to nine, and A, B, C, D, E, F (or alternatively a, b, c, d, e, f) to represent values ten to fifteen.

 */
package dsaSenapati;

import java.util.Scanner;

public class Basic16ConBinToHexd {
	public static void main(String[] args) 
	 {
	  int[] hex = new int[1000];
	  int i = 1, j = 0, rem, dec = 0, bin;
	  Scanner in = new Scanner(System.in);
	  System.out.print("Input a Binary Number: ");
	  bin = in.nextInt();
	  while (bin > 0) {
	   rem = bin % 2;
	   dec = dec + rem * i;
	   i = i * 2;
	   bin = bin / 10;
	  }
	   i = 0;
	  while (dec != 0) {
	   hex[i] = dec % 16;
	   dec = dec / 16;
	   i++;
	  }
	  System.out.print("HexaDecimal value: ");
	  for (j = i - 1; j >= 0; j--)
	  {
	   if (hex[j] > 9) 
	   {
	    System.out.print((char)(hex[j] + 55)+"\n");
	   } else
	   {
	    System.out.print(hex[j]+"\n");
	   }
	  }
	 }
}
