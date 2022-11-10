/*
 m Coloring Problem | Backtracking-5
 
 Given an undirected graph and a number m, determine if the graph can be colored with at most m colors such that no two adjacent vertices of the graph are colored with the same color

Note: Here coloring of a graph means the assignment of colors to all vertices

Following is an example of a graph that can be colored with 3 different colors:

Input:  graph = {0, 1, 1, 1},
                         {1, 0, 1, 0},
                         {1, 1, 0, 1},
                         {1, 0, 1, 0}
Output: Solution Exists: Following are the assigned colors: 1  2  3  2
Explanation: By coloring the vertices 
                      with following colors, adjacent 
                      vertices does not have same colors

Input: graph = {1, 1, 1, 1},
                         {1, 1, 1, 1},
                         {1, 1, 1, 1},
                         {1, 1, 1, 1}

Output: Solution does not exist
Explanation: No solution exits 

Follow the given steps to solve the problem:

Create a recursive function that takes the current index, number of vertices and output color array
If the current index is equal to number of vertices. Check if the output color configuration is safe, i.e check if the adjacent vertices do not have same color. If the conditions are met, print the configuration and break
Assign a color to a vertex (1 to m)
For every assigned color recursively call the function with next index and number of vertices
If any recursive function returns true break the loop and returns true.


 */

package loveDSA;

public class $6MColoring {
	// Number of vertices in the graph
    static int V = 4;
 
    /* A utility function to print solution */
    static void printSolution(int[] color)
    {
        System.out.println(
            "Solution Exists:"
            + " Following are the assigned colors ");
        for (int i = 0; i < V; i++)
            System.out.print("  " + color[i]);
        System.out.println();
    }
 
    // check if the colored
    // graph is safe or not
    static boolean isSafe(boolean[][] graph, int[] color)
    {
        // check for every edge
        for (int i = 0; i < V; i++)
            for (int j = i + 1; j < V; j++)
                if (graph[i][j] && color[j] == color[i])
                    return false;
        return true;
    }
 
    /* This function solves the m Coloring
      problem using recursion. It returns
      false if the m colours cannot be assigned,
      otherwise, return true and prints
      assignments of colours to all vertices.
      Please note that there may be more than
      one solutions, this function prints one
      of the feasible solutions.*/
    static boolean graphColoring(boolean[][] graph, int m,
                                 int i, int[] color)
    {
        // if current index reached end
        if (i == V) {
 
            // if coloring is safe
            if (isSafe(graph, color)) {
 
                // Print the solution
                printSolution(color);
                return true;
            }
            return false;
        }
 
        // Assign each color from 1 to m
        for (int j = 1; j <= m; j++) {
            color[i] = j;
 
            // Recur of the rest vertices
            if (graphColoring(graph, m, i + 1, color))
                return true;
            color[i] = 0;
        }
        return false;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        /* Create following graph and
            test whether it is 3 colorable
            (3)---(2)
            | / |
            | / |
            | / |
            (0)---(1)
            */
        boolean[][] graph = {
            { false, true, true, true },
            { true, false, true, false },
            { true, true, false, true },
            { true, false, true, false },
        };
        int m = 3; // Number of colors
 
        // Initialize all color values as 0.
        // This initialization is needed
        // correct functioning of isSafe()
        int[] color = new int[V];
        for (int i = 0; i < V; i++)
            color[i] = 0;
 
        // Function call
        if (!graphColoring(graph, m, 0, color))
            System.out.println("Solution does not exist");
    }
}
