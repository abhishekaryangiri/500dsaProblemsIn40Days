//Find the missing and repeating number
//Given an unsorted array of size n. Array elements are in the range of 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

//Examples: 

//Input: arr[] = {3, 1, 3}
//Output: Missing = 2, Repeating = 3
//Explanation: In the array, 2 is missing and 3 occurs twice 

//Input: arr[] = {4, 3, 6, 2, 1, 1}
//Output: Missing = 5, Repeating = 1

package loveDSA;

public class $77FindMissAndRepNum {

    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");
 
        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }
 
        System.out.print("and the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
}
