//Move all the negative elements to one side of the array
//An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
//// Java program to move all negative numbers to the
// beginning and all positive numbers to the end with
// constant extra space
package loveDSA;
import java.util.*;
public class $5MoveAllNegElem {

    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }

}
