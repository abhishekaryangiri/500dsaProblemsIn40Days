/*
 
 Calculate square of a number without using *, / and pow()
 
 Given an integer n, calculate the square of a number without using *, / and pow(). 

Examples : 

Input: n = 5
Output: 25

Input: 7
Output: 49

Input: n = 12
Output: 144
 */
package loveDSA;

public class $9SqrOfAnumber {

    public static int square(int n)
    {
 
        // handle negative input
        if (n < 0)
            n = -n;
 
        // Initialize result
        int res = n;
 
        // Add n to res n-1 times
        for (int i = 1; i < n; i++)
            res += n;
 
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + ", n^2 = " + square(n));
    }
}
