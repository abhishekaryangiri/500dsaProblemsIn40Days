//Rearrange the array in alternating positive and negative items with O(1) extra space
//Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by a negative and vice-versa maintaining the order of appearance. The number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.

package loveDSA;

public class $19RearrangeArray {
	 // Utility function to right rotate all elements
    // between [outofplace, cur]
    void rightrotate(int arr[], int n, int outofplace,
                     int cur)
    {
        int tmp = arr[cur];
        for (int i = cur; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = tmp;
    }
 
    void rearrange(int arr[], int n)
    {
        int outofplace = -1;
 
        for (int index = 0; index < n; index++) {
            if (outofplace >= 0) {
                // find the item which must be moved into
                // the out-of-place entry if out-of-place
                // entry is positive and current entry is
                // negative OR if out-of-place entry is
                // negative and current entry is negative
                // then right rotate
                //
                // [...-3, -4, -5, 6...] -->   [...6, -3,
                // -4, -5...]
                //      ^                          ^
                //      |                          |
                //     outofplace      -->      outofplace
                //
                if (((arr[index] >= 0)
                     && (arr[outofplace] < 0))
                    || ((arr[index] < 0)
                        && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, index);
 
                    // the new out-of-place entry is now 2
                    // steps ahead
                    if (index - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }
 
            // if no entry has been flagged out-of-place
            if (outofplace == -1) {
                // check if current entry is out-of-place
                if (((arr[index] >= 0)
                     && ((index & 0x01) == 0))
                    || ((arr[index] < 0)
                        && (index & 0x01) == 1))
                    outofplace = index;
            }
        }
    }
 
    // A utility function to print
    // an array 'arr[]' of size 'n'
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
    	$19RearrangeArray rearrange = new $19RearrangeArray();
        /* int arr[n] = {-5, 3, 4, 5, -6,
                         -2, 8, 9, -1, -4};
        int arr[] = {-5, -3, -4, -5, -6,
                     2 , 8, 9, 1 , 4};
        int arr[] = {5, 3, 4, 2, 1,
                     -2 , -8, -9, -1 , -4};
        int arr[] = {-5, 3, -4, -7,
                     -1, -2 , -8, -9, 1 , -4};*/
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int n = arr.length;
 
        System.out.println("Given array is ");
        rearrange.printArray(arr, n);
 
        rearrange.rearrange(arr, n);
 
        System.out.println("RearrangeD array is ");
        rearrange.printArray(arr, n);
    }
}
