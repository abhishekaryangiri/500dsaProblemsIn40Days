/*
  Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40


 */
package dsaSenapati;

import java.util.Scanner;

public class Basic18ConOctalToHexad {
	public static void main(String args[])
    {
        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a octal number : ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
     }
}
