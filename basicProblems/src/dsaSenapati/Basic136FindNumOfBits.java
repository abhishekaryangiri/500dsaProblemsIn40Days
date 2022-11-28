/*
 Write a Java program to find the number of bits required to flip to convert two given integers. 
Sample Output:
2
 */
package dsaSenapati;

public class Basic136FindNumOfBits {
	public static void main(String[] args) {
        System.out.println(bitSwapRequired(27, 23));
    }

      public static int bitSwapRequired(int x, int y) {
        int ctr = 0;
        for (int z = x ^ y; z != 0; z = z >>> 1) {
            ctr += z & 1;
        }
        return ctr;
    }
}
