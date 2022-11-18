/*
 Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
Sample Output:

Input seconds: 86399                                                   
23:59:59
 */
package dsaSenapati;

import java.util.Scanner;

public class Bsic44ConverSecToHour {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
	    	int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
		System.out.print("\n");
    }
}
