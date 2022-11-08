/*
 K Centers Problem | Set 1 (Greedy Approximate Algorithm)
 
 Given n cities and distances between every pair of cities, select k cities to place warehouses (or ATMs or Cloud Server) such that the maximum distance of a city to a warehouse (or ATM or Cloud Server) is minimized. 

For example consider the following four cities, 0, 1, 2, and 3, and the distances between them, how to place 2 ATMs among these 4 cities so that the maximum distance of a city to an ATM is minimized. 

The 2-Approximate Greedy Algorithm: 

Choose the first center arbitrarily. 
Choose remaining k-1 centers using the following criteria. 
Let c1, c2, c3, … ci be the already chosen centers. Choose 
(i+1)’th center by picking the city which is farthest from already 
selected centers, i.e, the point p which has following value as maximum 
Min[dist(p, c1), dist(p, c2), dist(p, c3), …. dist(p, ci)] 


 */

package loveDSA;

import java.util.ArrayList;

public class $21KCenterProg {

static int maxindex(int[] dist, int n)
{
    int mi = 0;
    for(int i = 0; i < n; i++)
    {
        if (dist[i] > dist[mi])
            mi = i;
    }
    return mi;
}
 
static void selectKcities(int n, int weights[][],
                          int k)
{
    int[] dist = new int[n];
    ArrayList<Integer> centers = new ArrayList<>();
    for(int i = 0; i < n; i++)
    {
        dist[i] = Integer.MAX_VALUE;
    }
 
    // Index of city having the
    // maximum distance to it's
    // closest center
    int max = 0;
    for(int i = 0; i < k; i++)
    {
        centers.add(max);
        for(int j = 0; j < n; j++)
        {
             
            // Updating the distance
            // of the cities to their
            // closest centers
            dist[j] = Math.min(dist[j],
                               weights[max][j]);
        }
 
        // Updating the index of the
        // city with the maximum
        // distance to it's closest center
        max = maxindex(dist, n);
    }
 
    // Printing the maximum distance
    // of a city to a center
    // that is our answer
    System.out.println(dist[max]);
 
    // Printing the cities that
    // were chosen to be made
    // centers
    for(int i = 0; i < centers.size(); i++)
    {
        System.out.print(centers.get(i) + " ");
    }
    System.out.print("\n");
}
 
// Driver Code
public static void main(String[] args)
{
    int n = 4;
    int[][] weights = new int[][]{ { 0, 4, 8, 5 },
                                   { 4, 0, 10, 7 },
                                   { 8, 10, 0, 9 },
                                   { 5, 7, 9, 0 } };
    int k = 2;
 
    // Function Call
    selectKcities(n, weights, k);
}
}
