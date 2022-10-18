//Reverse a String
//Given a string, write a recursive program to reverse it.
package loveDSA;

import java.util.Stack;

public class $1ReveStr {
	 public static String recursiveReverse(char []str)
	 {
	   Stack<Character> st = new Stack<>();
	   for(int i=0; i<str.length; i++)
	        st.push(str[i]);
	 
	   for (int i=0; i<str.length; i++) {
	    str[i] = st.peek();
	    st.pop();
	   }    
	   return String.valueOf(str);// converting character array to string
	 }
	 
	// Driver program
	   public static void main(String []args)
	   {
	      String str = "geeksforgeeks";
	      str = recursiveReverse(str.toCharArray());// passing character array as parameter
	      System.out.println(str);
	   }
}
