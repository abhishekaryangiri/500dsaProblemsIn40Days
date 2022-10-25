//Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

//Examples : 

//Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
//Output : 4
//Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

//Input : {3, 3, 4, 2, 4, 4, 2, 4}
//Output : No Majority Element
//Explanation: There is no element whose frequency is greater than the half of the size of the array size.

package loveDSA;

public class $8MajorityElem {

    // Function to find Majority element
    // in an array
    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
 
            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
 
        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("No Majority Element");
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
 
        // Function calling
        findMajority(arr, n);
    }
}
