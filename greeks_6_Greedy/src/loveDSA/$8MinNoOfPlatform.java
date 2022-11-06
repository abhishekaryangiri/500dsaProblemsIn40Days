/*
 Minimum Number of Platforms Required for a Railway/Bus Station
 
 Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits. We are given two arrays that represent the arrival and departure times of trains that stop.

Examples: 

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
Output: 3 
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00} 
Output: 1 
Explanation: Only one platform is needed. 

Naive Approach: 

The idea is to take every interval one by one and find the number of intervals that overlap with it. Keep track of the maximum number of intervals that overlap with an interval. Finally, return the maximum value.

Illustration:

Follow the steps mentioned below:

Run two nested loops from start to end.
For every iteration of the outer loop, find the count of intervals that intersect with the current interval except itself.
Update the answer with the maximum count of overlap in each iteration of the outer loop.
Print the answer.


 */

package loveDSA;

public class $8MinNoOfPlatform {
	 // Returns minimum number of platforms required
    public static int findPlatform(int arr[], int dep[],
                                   int n)
    {
 
        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
 
        // run a nested  loop to find overlap
        for (int i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;
 
            for (int j = 0; j < n; j++) {
                if (i != j)
                    // check for overlap
                    if (arr[i] >= arr[j]
                        && dep[j] >= arr[i])
                        plat_needed++;
            }
 
            // update result
            result = Math.max(result, plat_needed);
        }
 
        return result;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 100, 300, 500 };
        int dep[] = { 900, 400, 600 };
        int n = 3;
        System.out.println(findPlatform(arr, dep, n));
    }
}
