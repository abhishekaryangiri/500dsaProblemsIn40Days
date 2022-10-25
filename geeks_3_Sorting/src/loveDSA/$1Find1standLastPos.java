//Find first and last positions of an element in a sorted array
//Given a sorted array arr[] with possibly duplicate elements, the task is to find indexes of the first and last occurrences of an element x in the given array. 

//Examples: 

//Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}, x = 5
//Output : First Occurrence = 2
//              Last Occurrence = 5
package loveDSA;

public class $1Find1standLastPos {
	  // Function for finding first and last occurrence
    // of an elements
    public static void findFirstAndLast(int arr[], int x)
    {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "
                               + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 8;
        findFirstAndLast(arr, x);
    }
}
