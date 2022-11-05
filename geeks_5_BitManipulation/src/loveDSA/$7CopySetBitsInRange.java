
/*
 Copy set bits in a range
 
 Given two numbers x and y, and a range [l, r] where 1 <= l, r <= 32. The task is consider set bits of y in range [l, r] and set these bits in x also.
Examples : 

Input  : x = 10, y = 13, l = 2, r = 3
Output : x = 14
Binary representation of 10 is 1010 and 
that of y is 1101. There is one set bit
in y at 3'rd position (in given range). 
After we copy this bit to x, x becomes 1110
which is binary representation of 14.

Input  : x = 8, y = 7, l = 1, r = 2
Output : x = 11

Method 1 (One by one copy bits) 
We can one by one find set bits of y by traversing given range. For every set bit, we OR it to existing bit of x, so that the becomes set in x, if it was not set. Below is C++ implementation.

 */
package loveDSA;

public class $7CopySetBitsInRange {
	 
	// Copy set bits in range [l, r] from y to x.
	// Note that x is passed by reference and modified
	// by this function.
	static int copySetBits(int x, int y,
	                 int l, int r)
	{
	   // l and r must be between 1 to 32
	   // (assuming ints are stored using
	   //  32 bits)
	   if (l < 1 || r > 32)
	      return x;
	 
	   // Traverse in given range
	   for (int i = l; i <= r; i++)
	   {
	       // Find a mask (A number whose
	       // only set bit is at i'th position)
	       int mask = 1 << (i-1);
	 
	       // If i'th bit is set in y, set i'th
	       // bit in x also.
	       if ((y & mask)!=0)
	          x = x | mask;
	   }
	    
	   return x;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	   int x = 10, y = 13, l = 1, r = 32;
	  x = copySetBits(x, y, l, r);
	   System.out.print("Modified x is " +  x);
	}
}
