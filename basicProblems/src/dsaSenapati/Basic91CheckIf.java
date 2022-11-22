/*
 Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
 */
package dsaSenapati;

public class Basic91CheckIf {
	 public static void main(String[] args)
	 {
		  int[] array_nums = {10, 70, 80, 50, 20, 13, 50};
	      boolean testd = false;
		  int result=0;
		  int x = 10;
		  int y = 20;
	    
	    for(int i = 0; i < array_nums.length; i++) {
	        if(array_nums[i] == x)
	            testd = true;
	                    
	        if(testd && array_nums[i] == y)
			{
	         System.out.printf( String.valueOf(true));	
	         result = 1		 ;
			}
	    }
	     if (result==0)                             
		   {	 
	         System.out.printf( String.valueOf(false));
		    }
			System.out.printf("\n");
	    }
}
