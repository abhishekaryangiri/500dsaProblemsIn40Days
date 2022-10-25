//Square root of an integer
//Given an integer X, find its square root. If X is not a perfect square, then return floor(√x).

//Examples : 

//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2.

//Input: x = 11
//Output: 3
//Explanation:  The square root of 11 lies in between 3 and 4 so floor of the square root is 3.

package loveDSA;

public class $4SquareRoot {
	 // Returns floor of square root of x
    static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;
 
        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;
 
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int x = 11;
        System.out.print(floorSqrt(x));
    }
}
