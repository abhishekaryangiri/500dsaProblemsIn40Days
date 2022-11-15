//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

package dsaSenapati;

import java.util.Scanner;

public class Basic5MultiOperation {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	   
	  System.out.print("Input first number: ");
	  int num1 = in.nextInt();
	   
	  System.out.print("Input second number: ");
	  int num2 = in.nextInt();
	   
	 
	  System.out.println(num1 + " + " + num2 + " = " + 
	  (num1 + num2));
	   
	  System.out.println(num1 + " - " + num2 + " = " + 
	  (num1 - num2));
	   
	  System.out.println(num1 + " x " + num2 + " = " + 
	  (num1 * num2));
	   
	  System.out.println(num1 + " / " + num2 + " = " + 
	  (num1 / num2));
	 
	  System.out.println(num1 + " mod " + num2 + " = " + 
	  (num1 % num2));
}
}
