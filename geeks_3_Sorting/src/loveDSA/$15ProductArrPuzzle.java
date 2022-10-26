//A product array puzzle | Set 2 (O(1) Space)
//Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).

//Example: 

///Input: arr[] = {10, 3, 5, 6, 2}
//Output: prod[] = {180, 600, 360, 300, 900}
//The elements of output array are 
//{3*5*6*2, 10*5*6*2, 10*3*6*2, 
//10*3*5*2, 10*3*5*6}
package loveDSA;

public class $15ProductArrPuzzle {

    // epsilon value to maintain precision
    static final double EPS = 1e-9;
 
    static void productPuzzle(int a[], int n)
    {
        // to hold sum of all values
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.log10(a[i]);
 
        // output product for each index
        // anti log to find original product value
        for (int i = 0; i < n; i++)
            System.out.print(
                (int)(EPS
                      + Math.pow(
                            10.00, sum
                                       - Math.log10(a[i])))
                + " ");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int a[] = { 10, 3, 5, 6, 2 };
        int n = a.length;
        System.out.println("The product array is: ");
        productPuzzle(a, n);
    }
}
