//Allocate minimum number of pages
//Given a number of pages in N different books and M students. The books are arranged in ascending order of the number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum. 

//Example : 

//Input : pages[] = {12, 34, 67, 90} , m = 2
//Output : 113
//Explanation: There are 2 number of students. Books can be distributed in following fashion : 
//1) [12] and [34, 67, 90]
//Max number of pages is allocated to student ‘2’ with 34 + 67 + 90 = 191 pages
//2) [12, 34] and [67, 90] Max number of pages is allocated to student ‘2’ with 67 + 90 = 157 pages 
//3) [12, 34, 67] and [90] Max number of pages is allocated to student ‘1’ with 12 + 34 + 67 = 113 pages

//Of the 3 cases, Option 3 has the minimum pages = 113.
package loveDSA;

public class $21AllocateMinNumOfPage {
	// Utility method to check if current minimum value
    // is feasible or not.
    static boolean isPossible(int arr[], int n, int m,
                              int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;
 
        // iterate over all books
        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            if (curr_sum > curr_min) {
                studentsRequired++; // increment student
                                    // count
 
                curr_sum = arr[i]; // update curr_sum
            }
        }
 
        return studentsRequired <= m;
    }
 
    // method to find minimum pages
    static int findPages(int arr[], int n, int m)
    {
        int sum = 0;
 
        // return -1 if no. of books is less than
        // no. of students
        if (n < m)
            return -1;
 
        // Count total number of pages
        for (int i = 0; i < n; i++)
            sum += arr[i];
 
        // initialize start as arr[n-1] pages(minimum answer
        // possible) and end as total pages(maximum answer
        // possible)
        int start = arr[n - 1], end = sum;
        int result = Integer.MAX_VALUE;
 
        // traverse until start <= end
        while (start <= end) {
            // check if it is possible to distribute
            // books by using mid is current minimum
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, m, mid)) {
                // update result to current distribution
                // as it's the best we have found till now.
                result = mid;
 
                // as we are finding minimum so,
                end = mid - 1;
            }
 
            else
                // if not possible, means pages should be
                // increased ,so update start = mid + 1
                start = mid + 1;
        }
 
        // at-last return minimum no. of  pages
        return result;
    }
 
    // Driver Method
    public static void main(String[] args)
    {
 
        int arr[] = { 12, 34, 67,
                      90 }; // Number of pages in books
 
        int m = 2; // No. of students
 
        System.out.println("Minimum number of pages = "
                           + findPages(arr, arr.length, m));
    }
}
