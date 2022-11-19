/*
  Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5  
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic54CalModuleOfTwoNum {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
	}
}
