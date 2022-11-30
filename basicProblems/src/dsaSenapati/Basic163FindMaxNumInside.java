/*
 Write a Java program to find the maximum number inside the number in the window (size k) at
  each moving in a given array of integers with duplicate numbers. 
  Move the window from the start of the array.
Sample output:
{|1, 2, 3|, 4, 5, 6, 7, 8, 8} -> Return maximum 3
{1, |2, 3, 4|, 5, 6, 7, 8, 8} -> Return maximum 4
{1, 2, |3, 4, 5|, 6, 7, 8, 8} -> Return maximum 5
{1, 2, 3, |4, 5, 6|, 7, 8, 8} -> Return maximum 6
{1, 2, 3, 4, |5, 6, 7|, 8, 8} -> Return maximum 7
{1, 2, 3, 4, 5, |6, 7, 8|, 8} -> Return maximum 8
{1, 2, 3, 4, 5, 6, |7, 8, 8|} -> Return maximum 8
Result array {3, 4, 5, 6, 7, 8, 8}

Expected Output:

Original array: [1, 2, 3, 4, 5, 6, 7, 8, 8]

Value of k: 3

Result: 
2
3
4
5
6
7
8
 */
package dsaSenapati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Basic163FindMaxNumInside {
	 public static void main(String[] args) {
	       	int[] main_array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
			int k = 3;
			System.out.println("\nOriginal array: "+Arrays.toString(main_array));  
			System.out.println("\nValue of k: "+k);  
	        System.out.println("\nResult: ");   
	        ArrayList result = max_slide_window(main_array,k);
	        for (int i = 0; i < result.size(); i++) {
	            System.out.println(result.get(i));
	        }
	    }
	  public static ArrayList max_slide_window(int[] main_array, int k) {
	    	ArrayList rst_arra = new ArrayList();
	    	if (main_array == null || main_array.length == 0 || k < 0) {
	    		return rst_arra;
	    	}
	    	Deque deque_num = new LinkedList();
	    	for (int i = 0; i < k; i++) {
	    		while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
	    			deque_num.pollLast();
	    		}
	    		deque_num.offerLast(i);
	    	}

	    	for (int i = k; i < main_array.length; i++) {
	    		rst_arra.add(main_array[deque_num.peekFirst()]);
	    		if (!deque_num.isEmpty() && deque_num.peekFirst() <= i - k) {
	    			deque_num.pollFirst();
	    		}
	    		while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
	    			deque_num.pollLast();
	    		}
	    		deque_num.offerLast(i);
	    	}
	    	rst_arra.add(main_array[deque_num.peekFirst()]);
	    	return rst_arra;
	    }
}
