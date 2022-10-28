//Find the Minimum element in a Sorted and Rotated Array
//Find the Minimum element in a Sorted and Rotated Array
//Given a sorted array arr[] (may be distinct or may contain duplicates) of size N that is rotated at some unknown point, the task is to find the minimum element in it. 

//Examples: 

//Input: arr[] = {5, 6, 1, 2, 3, 4}
//Output: 1
//Explanation: 1 is the minimum element present in the array.

///Input: arr[] = {1, 2, 3, 4}
//Output: 1
package loveDSA;

public class $19PivotElem {
	 // Function to find the minimum value
	  static int findMin(int arr[], int n)
	  {
	    int min_ele = arr[0];
	 
	    // Traversing over array to
	    // find minimum element
	    for (int i = 0; i < n; i++) {
	      if (arr[i] < min_ele) {
	        min_ele = arr[i];
	      }
	    }
	 
	    return min_ele;
	  }
	 
	  public static void main (String[] args) {
	    int arr[] = { 5, 6, 1, 2, 3, 4 };
	    int N = arr.length;
	    System.out.println(findMin(arr, N));
	  }
}
