//Count Inversion
//Traverse through the array, and for every index, find the number of smaller elements on its right side of the array. This can be done using a nested loop. Sum up the counts for all indices in the array and print the sum.
//Traverse through the array from start to end
//For every element, find the count of elements smaller than the current number up to that index using another loop.
//Sum up the count of inversion for every index.
//Print the count of inversions.
package loveDSA;

public class $15CountInversion {
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
