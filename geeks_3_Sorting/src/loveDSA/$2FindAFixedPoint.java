//Find a Fixed Point (Value equal to index) in a given array
//Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative. 
//Examples: 
 

 // Input: arr[] = {-10, -5, 0, 3, 7}
  //Output: 3  // arr[3] == 3 

 // Input: arr[] = {0, 2, 5, 8, 17}
  //Output: 0  // arr[0] == 0 


  //Input: arr[] = {-10, -5, 3, 4, 7, 9}
 // Output: -1  // No Fixed Point
package loveDSA;

public class $2FindAFixedPoint {
	static int linearSearch(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == i)
                return i;
        }
 
        /* If no fixed point present
           then return -1 */
        return -1;
    }
    // main function
    public static void main(String args[])
    {
        int arr[] = { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
        int n = arr.length;
        System.out.println("Fixed Point is "
                           + linearSearch(arr, n));
    }
}
