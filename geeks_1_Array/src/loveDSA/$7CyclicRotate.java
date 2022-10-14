//Write a program to cyclically rotate an array by one.
//1) Store last element in a variable say x. 
//2) Shift all elements one position ahead. 
//3) Replace first element of array with x.
package loveDSA;
import java.util.Arrays;
public class $7CyclicRotate {
	static int arr[] = new int[]{1, 2, 3, 4, 5};
    
    // Method for rotation
    static void rotate()
    {
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
     
    /* Driver program */
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
         
        rotate();
         
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}
