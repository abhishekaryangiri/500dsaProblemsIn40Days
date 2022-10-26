//Find a pair with the given difference
//Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n. 
//Examples: 

//Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
//Output: Pair Found: (2, 80)

//Input: arr[] = {90, 70, 20, 80, 50}, n = 45
//Output: No Such Pair
package loveDSA;

public class $10FindPair {
	// The function assumes that the array is sorted
    static boolean findPair(int arr[],int n)
    {
        int size = arr.length;
 
        // Initialize positions of two elements
        int i = 0, j = 1;
 
        // Search for a pair
        while (i < size && j < size)
        {
            if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n))
            {
                System.out.print("Pair Found: "+
                                 "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
 
        System.out.print("No such pair");
        return false;
    }
 
    // Driver program to test above function
    public static void main (String[] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int n = -60;
        findPair(arr,n);
    }
}
