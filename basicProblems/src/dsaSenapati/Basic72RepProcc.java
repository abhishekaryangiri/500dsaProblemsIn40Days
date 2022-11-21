/*
 Program to start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic72RepProcc {
	public static void main(String[] args) {
		System.out.println("Input the value of n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;				
			}
			else {
				n = (3 * n + 1) / 2;				
			}
		}
		System.out.println("\nValue of n = "+n);
		in.close();
	}
}
