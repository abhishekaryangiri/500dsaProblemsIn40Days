//Smallest window that contains all characters of string itself
//Given a string, find the smallest window length with all distinct characters of the given string. For eg. str = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca” .
//Examples: 

//Input: aabcbcdbca
//Output: dbca
//Explanation: 
//Possible substrings= {aabcbcd, abcbcd, 
//bcdbca, dbca....}
//Of the set of possible substrings 'dbca' 
//is the shortest substring having all the 
//distinct characters of given string.
package loveDSA;

import java.util.HashMap;

public class $33SmallestWivdo {
	   // Function to find smallest window containing
    // all distinct characters
    public static String findSubString(String str)
    {
        int n = str.length();
       
        // Count all distinct characters.
        int dist_count = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(str.charAt(i)))
            {
                Integer a = mp.get(str.charAt(i));
                mp.put(str.charAt(i),a+1);                  
            }
          else
          {
                 mp.put(str.charAt(i), 1);
            }
        }
        dist_count = mp.size();
        int size = Integer.MAX_VALUE;
        String res = "";
       
        // Now follow the algorithm discussed in below
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            int visited[] = new int[256];
            for(int j = 0; j < 256; j++)
              visited[j] = 0;
            String sub_str = "";
            for (int j = i; j < n; j++)
            {
                if (visited[str.charAt(j)] == 0)
                {
                    count++;
                    visited[str.charAt(j)] = 1;
                }
                sub_str += str.charAt(j);
                if (count == dist_count)
                    break;
            }
            if (sub_str.length() < size && count == dist_count)
            {
                res = sub_str;
                size=res.length();
            }
        }
        return res;
    }
   
  // Driver code
    public static void main (String[] args)
    {
        String str = "aabcbcdbca";
        System.out.println("Smallest window containing all distinct"+
                " characters is: "+ findSubString(str)) ;
    }
}
