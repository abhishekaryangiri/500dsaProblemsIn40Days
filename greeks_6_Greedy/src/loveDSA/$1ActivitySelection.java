/*
 * Activity Selection Problem | Greedy Algo-1
 
 Greedy is an algorithmic paradigm that builds up a solution piece by piece, always choosing the next piece that offers the most obvious and immediate benefit. Greedy algorithms are used for optimization problems. 

An optimization problem can be solved using Greedy if the problem has the following property: 

At every step, we can make a choice that looks best at the moment, and we get the optimal solution to the complete problem. 
If a Greedy Algorithm can solve a problem, then it generally becomes the best method to solve that problem as the Greedy algorithms are in general more efficient than other techniques like Dynamic Programming. But Greedy algorithms cannot always be applied. For example, the Fractional Knapsack problem can be solved using Greedy, but 0-1 Knapsack cannot be solved using Greedy.

Following are some standard algorithms that are Greedy algorithms:
1) Kruskal’s Minimum Spanning Tree (MST): 
In Kruskal’s algorithm, we create an MST by picking edges one by one. The Greedy Choice is to pick the smallest weight edge that doesn’t cause a cycle in the MST constructed so far

2) Prim’s Minimum Spanning Tree: 
In Prim’s algorithm also, we create a MST by picking edges one by one. We maintain two sets: a set of the vertices already included in MST and the set of the vertices not yet included. The Greedy Choice is to pick the smallest weight edge that connects the two sets


3) Dijkstra’s Shortest Path: 
Dijkstra’s algorithm is very similar to Prim’s algorithm. The shortest-path tree is built up, edge by edge. We maintain two sets: a set of the vertices already included in the tree and a set of the vertices not yet included. The Greedy Choice is to pick the edge that connects the two sets and is on the smallest weight path from the source to the set that contains not yet included vertices

4) Huffman Coding: 
Huffman Coding is a loss-less compression technique. It assigns variable-length bit codes to different characters. The Greedy Choice is to assign the least bit length code to the most frequent character.

The greedy algorithms are sometimes also used to get an approximation for Hard optimization problems. For example, Traveling Salesman Problem is an NP-Hard problem. A Greedy choice for this problem is to pick the nearest unvisited city from the current city at every step. These solutions don’t always produce the best optimal solution but can be used to get an approximately optimal solution.

Here let us see one such problem that can be solved useing Greedy algorithm

Problem:
You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. 

Examples:  

Input: start[]  =  {10, 12, 20}, finish[] =  {20, 25, 30}
Output: 0 2
Explanation: A person can perform at most two activities. The 
maximum set of activities that can be executed 
is {0, 2} [ These are indexes in start[] and finish[] ]

Input: start[]  =  {1, 3, 0, 5, 8, 5}, finish[] =  {2, 4, 6, 7, 9, 9};
Output: 0 1 3 4
Explanation: A person can perform at most four activities. The 
maximum set of activities that can be executed 
is {0, 1, 3, 4} [ These are indexes in start[] and finish[]

Follow the given steps to solve the problem:

Sort the activities according to their finishing time 
Select the first activity from the sorted array and print it 
Do the following for the remaining activities in the sorted array
If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it
Note: In the implementation, it is assumed that the activities are already sorted according to their finish time

 */
package loveDSA;

public class $1ActivitySelection {
	// Prints a maximum set of activities that can be done
    // by a single person, one at a time.
    public static void printMaxActivities(int s[], int f[],
                                          int n)
    {
        int i, j;
 
        System.out.println(
            "Following activities are selected");
 
        // The first activity always gets selected
        i = 0;
        System.out.print(i + " ");
 
        // Consider rest of the activities
        for (j = 1; j < n; j++) {
            // If this activity has start time greater than
            // or equal to the finish time of previously
            // selected activity, then select it
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;
 
        // Function call
        printMaxActivities(s, f, n);
    }
}
