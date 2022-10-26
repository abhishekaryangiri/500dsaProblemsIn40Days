//Count triplets with sum smaller than a given value
//Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. The expected Time Complexity is O(n2).
//Examples: 
 

//Input : arr[] = {-2, 0, 1, 3}
  //      sum = 2.
//Output : 2
//Explanation :  Below are triplets with sum less than 2
 //              (-2, 0, 1) and (-2, 0, 3) 

///Input : arr[] = {5, 1, 3, 4, 7}
//        sum = 12.
package loveDSA;

public class $13CountTripletWithSum {
	 static int arr[] = new int[]{5, 1, 3, 4, 7};
     
	    static int countTriplets(int n, int sum)
	    {
	        // Initialize result
	        int ans = 0;
	      
	        // Fix the first element as A[i]
	        for (int i = 0; i < n-2; i++)
	        {
	           // Fix the second element as A[j]
	           for (int j = i+1; j < n-1; j++)
	           {
	               // Now look for the third number
	               for (int k = j+1; k < n; k++)
	                   if (arr[i] + arr[j] + arr[k] < sum)
	                       ans++;
	           }
	        }
	      
	        return ans;
	    }
	     
	    // Driver method to test the above function
	    public static void main(String[] args)
	    {
	        int sum = 12;
	        System.out.println(countTriplets(arr.length, sum));
	    }
}
