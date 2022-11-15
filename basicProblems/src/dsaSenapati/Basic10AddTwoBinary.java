//Add two binary numbers
//In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).

//Test Data:
//Input first binary number: 100010
//Input second binary number: 110010
package dsaSenapati;

import java.util.Scanner;

public class Basic10AddTwoBinary {
	public static void main(String[] args)
	 {
	  long binary1, binary2;
	  int i = 0, remainder = 0;
	  int[] sum = new int[20];
	  Scanner in = new Scanner(System.in);

	  System.out.print("Input first binary number: ");
	  binary1 = in.nextLong();
	  System.out.print("Input second binary number: ");
	  binary2 = in.nextLong();

	  while (binary1 != 0 || binary2 != 0) 
	  {
	   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
	   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
	   binary1 = binary1 / 10;
	   binary2 = binary2 / 10;
	  }
	  if (remainder != 0) {
	   sum[i++] = remainder;
	  }
	  --i;
	  System.out.print("Sum of two binary numbers: ");
	  while (i >= 0) {
	   System.out.print(sum[i--]);
	  }
	   System.out.print("\n");  
	 }

}
