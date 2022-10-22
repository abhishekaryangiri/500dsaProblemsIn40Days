
//Longest prefix which is also suffix
//
//packGiven a string s, find the length of the longest prefix, which is also a suffix. The prefix and suffix should not overlap.


//Examples: 

//Input : aabcdaabc
//Output : 4
//The string "aabc" is the longest
//prefix which is also suffix.

//Input : abcab
//Output : 2

//Input : aaaa
//Output : 2age loveDSA;

public class $19KMPAlgorithm {
	static int longestPrefixSuffix(String s)
    {
        int n = s.length();
     
        int lps[] = new int[n];
         
        // lps[0] is always 0
        lps[0] = 0;
     
        // length of the previous
        // longest prefix suffix
        int len = 0;
     
        // the loop calculates lps[i]
        // for i = 1 to n-1
        int i = 1;
        while (i < n)
        {
            if (s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
             
             // (pat[i] != pat[len])
            else
            {
                // This is tricky. Consider
                // the example. AAACAAAA
                // and i = 7. The idea is
                // similar to search step.
                if (len != 0)
                {
                    len = lps[len-1];
     
                    // Also, note that we do
                    // not increment i here
                }
                 
                // if (len == 0)
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
     
        int res = lps[n-1];
     
        // Since we are looking for
        // non overlapping parts.
        return (res > n/2)? n/2 : res;
    }
     
    // Driver program
    public static void main (String[] args)
    {
        String s = "abcab";
        System.out.println(longestPrefixSuffix(s));
    }
}
