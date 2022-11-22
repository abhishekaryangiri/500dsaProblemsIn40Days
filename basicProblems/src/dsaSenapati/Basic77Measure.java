/*
 Write a Java program to measure how long some code takes to execute in nanoseconds
 */
package dsaSenapati;

public class Basic77Measure {
	 public static void main(String[] args)
	 {    
	    long startTime = System.nanoTime(); 
		// Sample program
		// Display the first 10 natural numbers.
		int i;
		System.out.println ("The first 10 natural numbers are:\n");
		for (i=1;i<=10;i++)
		{      
			System.out.println (i);
		}
			long estimatedTime = System.nanoTime() - startTime;
		System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);
	  }
}
