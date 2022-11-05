/*
 Program to find whether a given number is power of 2
 
 Given a positive integer n, write a function to find if it is a power of 2 or not

Examples: 

Input : n = 4
Output : Yes
Explanation: 22 = 4

Input : n = 32
Output : Yes
Explanation: 25 = 32

A simple method for this is to simply take the log of the number on base 2 and if you get an integer then the number is the power of 2

 */

package loveDSA;

public class $5PowerOfTwo {
	 /* Function to check if x is power of 2*/
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Function call
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
