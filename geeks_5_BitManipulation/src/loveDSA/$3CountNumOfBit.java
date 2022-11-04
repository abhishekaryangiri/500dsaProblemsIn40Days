/*
Count number of bits to be flipped to convert A to B

Given two numbers A and B. Write a program to count the number of bits needed to be flipped to convert A to B. 

Examples: 

Input: A = 10, B = 20
Output: 4
Explanation: Binary representation of A is 00001010
Binary representation of B is 00010100
We need to flip highlighted four bits in A to make it B.

Input: A = 7, B = 10
Output: 3
Explanation: Binary representation of A is 00000111
Binary representation of B is 00001010
We need to flip highlighted three bits in A to make it B.

Follow the given steps to solve the problem:

Calculate the XOR of A and B
Count the set bits in the above-calculated XOR result
Return the count
*/
package loveDSA;

public class $3CountNumOfBit {
	// Function that count set bits
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
 
    // Function that return count of
    // flipped number
    public static int FlippedCount(int a, int b)
    {
        // Return count of set bits in
        // a XOR b
        return countSetBits(a ^ b);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
       
          // Function call
        System.out.print(FlippedCount(a, b));
    }
}
