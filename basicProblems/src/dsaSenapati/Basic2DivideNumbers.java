//Divide two numbers and print on the screen
package dsaSenapati;

import java.util.Scanner;

public class Basic2DivideNumbers {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int a = input.nextInt();
    System.out.print("Input the second number: ");
    int b = input.nextInt();
    int d = (a/b);
    System.out.println();
    System.out.println("The division of a and b is:" +d);
}
}
