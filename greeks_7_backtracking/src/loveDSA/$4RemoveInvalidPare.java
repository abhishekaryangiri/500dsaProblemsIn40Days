/*
 Remove Invalid Parentheses
 
 An expression will be given which can contain open and close parentheses and optionally some characters, No other operator will be there in string. We need to remove minimum number of parentheses to make the input string valid. If more than one valid output are possible removing same number of parentheses then print all such output. 
Examples: 
 

Input  : str = “()())()” -
Output : ()()() (())()
There are two possible solutions
"()()()" and "(())()"

Input  : str = (v)())()
Output : (v)()()  (v())()


As we need to generate all possible output we will backtrack among all states by removing one opening or closing bracket and check if they are valid if invalid then add the removed bracket back and go for next state. We will use BFS for moving through states, use of BFS will assure removal of minimal number of brackets because we traverse into states level by level and each level corresponds to one extra bracket removal. Other than this BFS involve no recursion so overhead of passing parameters is also saved. 
Below code has a method isValidString to check validity of string, it counts open and closed parenthesis at each index ignoring non-parenthesis character. If at any instant count of close parenthesis becomes more than open then we return false else we keep update the count variable. 

 */

package loveDSA;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class $4RemoveInvalidPare {
	 
	// method checks if character is parenthesis(open
	// or closed)
	static boolean isParenthesis(char c)
	{
	    return ((c == '(') || (c == ')'));
	}
	 
	// method returns true if string contains valid
	// parenthesis
	static boolean isValidString(String str)
	{
	    int cnt = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == '(')
	            cnt++;
	        else if (str.charAt(i) == ')')
	            cnt--;
	        if (cnt < 0)
	            return false;
	    }
	    return (cnt == 0);
	}
	 
	// method to remove invalid parenthesis
	static void removeInvalidParenthesis(String str)
	{
	    if (str.isEmpty())
	        return;
	 
	    // visit set to ignore already visited string
	    HashSet<String> visit = new HashSet<String>();
	 
	    // queue to maintain BFS
	    Queue<String> q = new LinkedList<>();
	    String temp;
	    boolean level = false;
	 
	    // pushing given string as
	    // starting node into queue
	    q.add(str);
	    visit.add(str);
	    while (!q.isEmpty())
	    {
	        str = q.peek(); q.remove();
	        if (isValidString(str))
	        {
	            System.out.println(str);
	 
	            // If answer is found, make level true
	            // so that valid string of only that level
	            // are processed.
	            level = true;
	        }
	        if (level)
	            continue;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (!isParenthesis(str.charAt(i)))
	                continue;
	 
	            // Removing parenthesis from str and
	            // pushing into queue,if not visited already
	            temp = str.substring(0, i) + str.substring(i + 1);
	            if (!visit.contains(temp))
	            {
	                q.add(temp);
	                visit.add(temp);
	            }
	        }
	    }
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    String expression = "()())()";
	    removeInvalidParenthesis(expression);
	 
	    expression = "()v)";
	    removeInvalidParenthesis(expression);
	}
}
