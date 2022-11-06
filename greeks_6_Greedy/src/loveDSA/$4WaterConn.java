/*
 Water Connection Problem
 
 Every house in the colony has at most one pipe going into it and at most one pipe going out of it. Tanks and taps are to be installed in a manner such that every house with one outgoing pipe but no incoming pipe gets a tank installed on its roof and every house with only an incoming pipe and no outgoing pipe gets a tap.

Given two integers n and p denoting the number of houses and the number of pipes. The connections of pipe among the houses contain three input values: a_i, b_i, d_i denoting the pipe of diameter d_i from house a_i to house b_i, find out the efficient solution for the network. 

The output will contain the number of pairs of tanks and taps t installed in first line and the next t lines contain three integers: house number of tank, house number of tap and the minimum diameter of pipe between them.

Examples: 


Input:  4 2
        1 2 60
        3 4 50
Output: 2
        1 2 60
        3 4 50
Explanation:
Connected components are: 1->2 and 3->4
Therefore, our answer is 2 followed by 1 2 60 and 3 4 50.

Input: 9 6
       7 4 98
       5 9 72
       4 6 10
       2 8 22
       9 7 17
       3 1 66
Output: 3
        2 8 22
        3 1 66
        5 6 10
Explanation:
Connected components are 3->1, 5->9->7->4->6 and 2->8. 
Therefore, our answer is 3 followed by 2 8 22, 3 1 66, 5 6 10

Approach: 

Perform DFS from appropriate houses to find all different connected components. The number of different connected components is our answer t. 
The next t lines of the output are the beginning of the connected component, end of the connected component and the minimum diameter from the start to the end of the connected component in each line. 
Since, tanks can be installed only on the houses having outgoing pipe and no incoming pipe, therefore these are appropriate houses to start DFS from i.e. perform DFS from such unvisited houses.

 */
package loveDSA;

import java.util.ArrayList;
import java.util.List;

public class $4WaterConn {
	 // number of houses and number
    // of pipes
    static int number_of_houses, number_of_pipes;
 
    // Array rd stores the
    // ending vertex of pipe
    static int ending_vertex_of_pipes[] = new int[1100];
 
    // Array wd stores the value
    // of diameters between two pipes
    static int diameter_of_pipes[] = new int[1100];
 
    // Array cd stores the
    // starting end of pipe
    static int starting_vertex_of_pipes[] = new int[1100];
 
    // arraylist a, b, c are used
    // to store the final output
    static List<Integer> a = new ArrayList<Integer>();
 
    static List<Integer> b = new ArrayList<Integer>();
 
    static List<Integer> c = new ArrayList<Integer>();
 
    static int ans;
 
    static int dfs(int w)
    {
        if (starting_vertex_of_pipes[w] == 0)
            return w;
        if (diameter_of_pipes[w] < ans)
            ans = diameter_of_pipes[w];
 
        return dfs(starting_vertex_of_pipes[w]);
    }
 
    // Function to perform calculations.
    static void solve(int arr[][])
    {
        int i = 0;
 
        while (i < number_of_pipes) {
 
            int q = arr[i][0];
            int h = arr[i][1];
            int t = arr[i][2];
 
            starting_vertex_of_pipes[q] = h;
            diameter_of_pipes[q] = t;
            ending_vertex_of_pipes[h] = q;
            i++;
        }
 
        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
        c = new ArrayList<Integer>();
 
        for (int j = 1; j <= number_of_houses; ++j)
 
            /*If a pipe has no ending vertex
            but has starting vertex i.e is
            an outgoing pipe then we need
            to start DFS with this vertex.*/
            if (ending_vertex_of_pipes[j] == 0
                && starting_vertex_of_pipes[j] > 0) {
                ans = 1000000000;
                int w = dfs(j);
 
                // We put the details of
                // component in final output
                // array
                a.add(j);
                b.add(w);
                c.add(ans);
            }
 
        System.out.println(a.size());
 
        for (int j = 0; j < a.size(); ++j)
            System.out.println(a.get(j) + " " + b.get(j)
                               + " " + c.get(j));
    }
 
    // main function
    public static void main(String args[])
    {
        number_of_houses = 9;
        number_of_pipes = 6;
 
        // set the value of the array
        // to zero
        for (int i = 0; i < 1100; i++)
            ending_vertex_of_pipes[i]
                = starting_vertex_of_pipes[i]
                = diameter_of_pipes[i] = 0;
 
        int arr[][]
            = { { 7, 4, 98 }, { 5, 9, 72 }, { 4, 6, 10 },
                { 2, 8, 22 }, { 9, 7, 17 }, { 3, 1, 66 } };
        solve(arr);
    }
}
