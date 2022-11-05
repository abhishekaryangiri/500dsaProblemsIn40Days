/*
 * Find position of the only set bit
 * 
 * Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. Position of set bit ‘1’ should be counted starting with 1 from the LSB side in the binary representation of the number.

 Source: Microsoft Interview | 18

Examples:-

Input:
N = 2
Output:
2
Explanation:
2 is represented as "10" in Binary.
As we see there's only one set bit
and it's in Position 2 and thus the
Output 2.

The idea is to start from the rightmost bit and one by one check value of every bit. Following is a detailed algorithm.
1) If number is power of two then and then only its binary representation contains only one ‘1’. That’s why check whether the given number is a power of 2 or not. If given number is not a power of 2, then print error message and exit.
2) Initialize two variables; i = 1 (for looping) and pos = 1 (to find position of set bit)
3) Inside loop, do bitwise AND of i and number ‘N’. If value of this operation is true, then “pos” bit is set, so break the loop and return position. Otherwise, increment “pos” by 1 and left shift i by 1 and repeat the procedure. 

 */
package loveDSA;

public class $6PositionOfFirstSet {
	 static boolean isPowerOfTwo(int n)
	    {
	        return (n > 0 && ((n & (n - 1)) == 0)) ? true : false;
	    }
	 
	    // Returns position of the only set bit in 'n'
	    static int findPosition(int n)
	    {
	        if (!isPowerOfTwo(n))
	            return -1;
	 
	        int i = 1, pos = 1;
	 
	        // Iterate through bits of n till we find a set bit
	        // i&n will be non-zero only when 'i' and 'n' have a set bit
	        // at same position
	        while ((i & n) == 0) {
	            // Unset current bit and set the next bit in 'i'
	            i = i << 1;
	 
	            // increment position
	            ++pos;
	        }
	 
	        return pos;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int n = 16;
	        int pos = findPosition(n);
	        if (pos == -1)
	            System.out.println("n = " + n + ", Invalid number");
	        else
	            System.out.println("n = " + n + ", Position " + pos);
	 
	        n = 12;
	        pos = findPosition(n);
	        if (pos == -1)
	            System.out.println("n = " + n + ", Invalid number");
	        else
	            System.out.println("n = " + n + ", Position " + pos);
	 
	        n = 128;
	        pos = findPosition(n);
	        if (pos == -1)
	            System.out.println("n = " + n + ", Invalid number");
	        else
	            System.out.println("n = " + n + ", Position " + pos);
	    }
}
