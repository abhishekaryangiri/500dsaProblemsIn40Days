//Minimum no. of operations required to make an array palindrome
//Input: arr[] = {121, 131, 20} 
//Output: Array is not a PalinArray 
//For the given array, element 20 is not a palindrome. Thus the array is not a PalinArray.

///Input: arr[] = {111, 121, 222, 333, 444} 
//Output: Array is a PalinArray 
//For the given array, all the elements of the array are palindromes. Thus the array is a PalinArray. 

package loveDSA;

public class $32AllElementIsPalindromic {
	 // Function to check if palindrome or not
    static boolean isPalindrome(int N)
    {
        String str = "" + N;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }
 
    // Function to check
    // if an array is PalinArray or not
    static boolean isPalinArray(int[] arr, int n)
    {
        // Traversing each element of the array
        // and check if it is palindrome or not
        for (int i = 0; i < n; i++) {
            boolean ans = isPalindrome(arr[i]);
            if (ans == false)
                return false;
        }
        return true;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int[] arr = { 121, 131, 20 };
 
        // length of array
        int n = arr.length;
 
        boolean res = isPalinArray(arr, n);
        if (res == true)
            System.out.println("Array is a PalinArray");
        else
            System.out.println("Array is not a PalinArray");
    }
}
