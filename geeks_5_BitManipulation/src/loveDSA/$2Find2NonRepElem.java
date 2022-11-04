/*
Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2

Given an array in which all numbers except two are repeated once. (i.e. we have 2n+2 numbers and n numbers are occurring twice and remaining two have occurred once). Find those two numbers in the most efficient way. 
First, sort all the elements. In the sorted array, by comparing adjacent elements we can easily get the non-repeating elements. 
*/

package loveDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class $2Find2NonRepElem {
	 static ArrayList<Integer> get2NonRepeatingNos(int nums[], int n)
	  {
	 
	    Arrays.sort(nums);
	 
	    ArrayList<Integer> ans = new ArrayList<>();
	    for (int i = 0; i < n - 1; i = i + 2) {
	      if (nums[i] != nums[i + 1]) {
	        ans.add(nums[i]);
	        i = i - 1;
	      }
	    }
	 
	    if (ans.size() == 1)
	      ans.add(nums[n - 1]);
	 
	    return ans;
	  }
	 
	  /* Driver code */
	  public static void main(String[] args) {
	    int arr[] = { 2, 3, 7, 9, 11, 2, 3, 11 };
	    int n = arr.length;
	    ArrayList<Integer> ans = get2NonRepeatingNos(arr, n);
	    System.out.print("The non-repeating elements are ");
	    System.out.println(ans.get(0) + " and " + ans.get(1));
	  }
}
