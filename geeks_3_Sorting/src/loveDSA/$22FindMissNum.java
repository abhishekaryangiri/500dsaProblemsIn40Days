//Find the missing number in Arithmetic Progression
//Given an array that represents elements of arithmetic progression in order. One element is missing in the progression, find the missing number. 

//Examples: 

//Input: arr[]  = {2, 4, 8, 10, 12, 14}
//Output: 6

//Input: arr[]  = {1, 6, 11, 16, 21, 31};
//Output: 26
package loveDSA;



public class $22FindMissNum {
	static int findMissing(int[] arr, int n)
    {
        int a, l, s, i, sum = 0, missingnumber;
        a = arr[0];
        l = arr[n - 1];
  
        /* Taking the sum of all the elements of the array
           including the missing element using formulae
           S(n) = n/2 (a+l)  where a is the first element
           and l is the last element */
  
        if ((a + l) % 2 == 0) /* ensuring this as n/2(a+l)
                     and (a+l)/2 would give different values
                     programmatically */
        {
            s = (a + l) / 2;
            s = s * (n + 1);
        }
        else {
            s = (n + 1) / 2;
            s = (a + l) * s;
        }
  
        // Taking the sum of all the elements of the
        // array excluding the missing element
  
        for (i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }
  
        missingnumber = s - sum;
  
        return missingnumber;
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 2, 4, 8, 10, 12, 14 };
        int n = arr.length;
        System.out.println("The missing element is "
                           + findMissing(arr, n));
    }
}