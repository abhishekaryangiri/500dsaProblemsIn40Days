//Count Inversions in an array | (Using Merge Sort)
//Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum. 

//Given an array a[]. The task is to find the inversion count of a[]. Wher two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

//Examples: 

//Input: arr[] = {8, 4, 2, 1}
//Output: 6
//Explanation: Given array has six inversions: (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).

//Input: arr[] = {1, 20, 6, 4, 5}
//Output: 5
//Explanation: Given array has five inversions: (20, 6), (20, 4), (20, 5), (6, 4), (6, 5).
package loveDSA;

public class $24InversionCount {
	 static int arr[] = new int[] { 1, 20, 6, 4, 5 };
	 
	    static int getInvCount(int n)
	    {
	        int inv_count = 0;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = i + 1; j < n; j++)
	                if (arr[i] > arr[j])
	                    inv_count++;
	 
	        return inv_count;
	    }
	 
	    // Driver method to test the above function
	    public static void main(String[] args)
	    {
	        System.out.println("Number of inversions are "
	                           + getInvCount(arr.length));
	    }
}
