//Given a string s1 and a string s2, write a function to check whether s2 is a rotation of s1. 

//Input: S1 = ABCD, S2 = CDAB
//Output: Strings are rotations of each other

//Input: S1 = ABCD, S2 = ACBD
//Output: Strings are not rotations of each other
//
package loveDSA;

import java.util.ArrayList;

public class $5StrareRotOfEachOther {
	// java program to check if two strings are rotation of
    // each other or not
    static boolean checkString(String s1, String s2,
                               int indexFound, int Size)
    {
        for (int i = 0; i < Size; i++) {
 
            // check whether the character is equal or not
            if (s1.charAt(i)
                != s2.charAt((indexFound + i) % Size))
                return false;
 
            // %Size keeps (indexFound+i) in bounds,
            // since it ensures it's value is always less
            // than Size
        }
 
        return true;
    }
 
    // Driver code
    public static void main(String args[])
    {
        String s1 = "abcd";
        String s2 = "cdab";
 
        if (s1.length() != s2.length()) {
            System.out.println(
                "s2 is not a rotation on s1");
        }
        else {
 
            ArrayList<Integer> indexes = new ArrayList<
                Integer>(); // store occurrences of the
                            // first character of s1
 
            int Size = s1.length();
 
            char firstChar = s1.charAt(0);
 
            for (int i = 0; i < Size; i++) {
                if (s2.charAt(i) == firstChar) {
                    indexes.add(i);
                }
            }
 
            boolean isRotation = false;
 
            // check if the strings are rotation of each
            // other for every occurrence of firstChar in s2
            for (int idx : indexes) {
                isRotation = checkString(s1, s2, idx, Size);
 
                if (isRotation)
                    break;
            }
 
            if (isRotation)
                System.out.println(
                    "Strings are rotations of each other");
            else
                System.out.println(
                    "Strings are not rotations of each other");
        }
    }
}
