//Program to generate all possible valid IP addresses from given string
//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//A valid IP address must be in the form of A.B.C.D, where A, B, C, and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.

//Examples :

//Input: 25525511135
//Output: [“255.255.11.135”, “255.255.111.35”]
//Explanation:
//These are the only valid possible
//IP addresses.

//Input: "25505011535"
//Output: []
//Explanation: 
//We cannot generate a valid IP
//address with this string.

package loveDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class $32GenAllValidID {
	// Function to restore Ip Addresses
    public static ArrayList<String>
    restoreIpAddresses(String A)
    {
        if (A.length() < 3 || A.length() > 12)
            return new ArrayList<>();
        return convert(A);
    }
 
    private static ArrayList<String>
    convert(String s)
    {
        ArrayList<String> l = new ArrayList<>();
        int size = s.length();
 
        String snew = s;
 
        for (int i = 1; i < size - 2;
             i++) {
            for (int j = i + 1;
                 j < size - 1; j++) {
                for (int k = j + 1;
                     k < size; k++) {
                    snew
                        = snew.substring(0, k) + "."
                          + snew.substring(k);
                    snew
                        = snew.substring(0, j) + "."
                          + snew.substring(j);
                    snew
                        = snew.substring(0, i) + "."
                          + snew.substring(i);
 
                    if (isValid(snew)) {
                        l.add(snew);
                    }
                    snew = s;
                }
            }
        }
 
        Collections.sort(l, new Comparator<String>() {
            public int compare(String o1, String o2)
            {
                String a1[] = o1.split("[.]");
                String a2[] = o2.split("[.]");
 
                int result = -1;
                for (int i = 0; i < 4
                                && result != 0;
                     i++) {
                    result = a1[i].compareTo(a2[i]);
                }
                return result;
            }
        });
        return l;
    }
 
    private static boolean isValid(String ip)
    {
        String a[] = ip.split("[.]");
        for (String s : a) {
            int i = Integer.parseInt(s);
            if (s.length() > 3 || i < 0 || i > 255) {
                return false;
            }
            if (s.length() > 1 && i == 0)
                return false;
            if (s.length() > 1 && i != 0
                && s.charAt(0) == '0')
                return false;
        }
 
        return true;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        System.out.println(
            restoreIpAddresses(
                "25525511135")
                .toString());
    }
}
