/*
 Write a Java program that accepts two double variables and test if both strictly
  between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic142AcceptTwoDouVar {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
        double n1 = in.nextDouble();
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}
