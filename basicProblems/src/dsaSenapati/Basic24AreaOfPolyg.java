/*
 Write a Java program to compute the area of a polygon. 
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */
package dsaSenapati;

import java.util.Scanner;

public class Basic24AreaOfPolyg {
	   
	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Input the number of sides on the polygon: ");
	        int ns = input.nextInt();
	        System.out.print("Input the length of one of the sides: ");
	        double side = input.nextDouble();
	        System.out.print("The area is: " + polygonArea(ns, side)+"\n");
	    }
	    public static double polygonArea(int ns, double side) {
	        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	    }
}
