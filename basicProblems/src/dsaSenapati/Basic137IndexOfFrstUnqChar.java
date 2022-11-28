
/*
 Write a Java program to find the index of the first unique character in a given string, 
 assume that there is at least one unique character in the string. 
Sample Output:
Original String: wresource
First unique character of the above: 0
 */
package dsaSenapati;

public class Basic137IndexOfFrstUnqChar {
	public static void main(String[] args) {
		String s = "wresource";
		System.out.println("Original String: "+s);
        System.out.println("First unique character of the above: "+first_Uniq_Char(s));
    }

    public static int first_Uniq_Char(String s) {
         int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
	}
}
