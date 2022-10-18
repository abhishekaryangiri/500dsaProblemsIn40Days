//.Find Duplicate characters in a string
//Write an efficient program to print all the duplicates and their counts in the input string 

//Method 1: Using hashing

//Algorithm: Let input string be “geeksforgeeks” 

//Construct character count array from the input string.
//count[‘e’] = 4 
//count[‘g’] = 2
//count[‘k’] = 2 
//Print all the indexes from the constructed array which have values greater than 1.

package loveDSA;

public class $4DublicateCharInStr {
	 static final int NO_OF_CHARS = 256;
	 
	    /* Fills count array with
	       frequency of characters */
	    static void fillCharCounts(String str,
	                                   int[] count)
	    {
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)]++;
	    }
	 
	    /* Print duplicates present
	      in the passed string */
	    static void printDups(String str)
	    {
	        // Create an array of size
	        // 256 and fill count of
	        // every character in it
	        int count[] = new int[NO_OF_CHARS];
	        fillCharCounts(str, count);
	 
	        for (int i = 0; i < NO_OF_CHARS; i++)
	            if (count[i] > 1)
	                System.out.println((char)(i) +
	                          ", count = " + count[i]);
	    }
	 
	    // Driver Method
	    public static void main(String[] args)
	    {
	        String str = "test string";
	        printDups(str);
	    }
}
