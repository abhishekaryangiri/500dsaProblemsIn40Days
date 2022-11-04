
/*
 Count total set bits in first N Natural Numbers (all numbers from 1 to N)
 
 Given a positive integer N, the task is to count the total number of set bits in binary representation of all numbers from 1 to N. 

Examples: 

Input: N = 3
Output:  4
Explanation: Numbers from 1 to 3: {1, 2, 3}
Binary Representation of 1: 01 -> Set bits = 1
Binary Representation of 2: 10 -> Set bits = 1
Binary Representation of 3: 11 -> Set bits = 2
Total set bits from 1 till 3 = 1 + 1 + 2 = 4

Input: N = 6
Output: 9

Follow the steps below to understand how:

Traverse a loop from 1 to N
For each integer in 1 to N:
Convert the number to its binary representation
Add the count of 1s in the binary representation to the answer.
Return the total set bits count.

Follow the steps below to understand how:

Traverse a loop from 1 to N
For each integer in 1 to N:
Convert the number to its binary representation
Add the count of 1s in the binary representation to the answer.
Return the total set bits count.
 */
package loveDSA;

public class $4CountTotalSetBitIn1stNNatNum {
	// Returns count of set bits present
    //  in all numbers from 1 to n
    static int countSetBits(int n)
    {
        // initialize the result
        int bitCount = 0;
 
        for (int i = 1; i <= n; i++)
            bitCount += countSetBitsUtil(i);
 
        return bitCount;
    }
 
    // A utility function to count set bits
    // in a number x
    static int countSetBitsUtil(int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1)
            + countSetBitsUtil(x / 2);
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int n = 4;
        System.out.print("Total set bit count is ");
        System.out.print(countSetBits(n));
    }
}
