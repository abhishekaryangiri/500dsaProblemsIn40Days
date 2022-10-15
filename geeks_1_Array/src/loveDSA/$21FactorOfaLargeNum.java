//Find factorial of a large number
//Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n. 
//Input: 100
//Output: 933262154439441526816992388562667004-
  //       907159682643816214685929638952175999-
 //        932299156089414639761565182862536979-
  //       208272237582511852109168640000000000-
 //        00000000000000

package loveDSA;

public class $21FactorOfaLargeNum {

    // This function finds factorial of
    // large numbers and prints them
    static void factorial(int n)
    {
        int res[] = new int[500];
 
        // Initialize result
        res[0] = 1;
        int res_size = 1;
 
        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);
 
        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }
 
    // This function multiplies x with the number
    // represented by res[]. res_size is size of res[] or
    // number of digits in the number represented by res[].
    // This function uses simple school mathematics for
    // multiplication. This function may value of res_size
    // and returns the new value of res_size
    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; // Initialize carry
 
        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
                                // 'prod' in res[]
            carry = prod / 10; // Put rest in carry
        }
 
        // Put carry in res and increase result size
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
 
    // Driver program
    public static void main(String args[])
    {
        factorial(100);
    }
}
