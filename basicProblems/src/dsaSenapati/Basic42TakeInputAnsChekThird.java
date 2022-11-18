/*
 Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. Go to the editor
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true

 */
package dsaSenapati;

import java.util.Scanner;

public class Basic42TakeInputAnsChekThird {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test(x, y, z,true));
		System.out.print("\n");
    }
    
    public static boolean test(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
}
