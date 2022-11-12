/*
 * 
 * Assembly line scheduling
 * 
 * Case #2: Its previous station is S2, j-1 
The minimum time to leave station S1, j is given by: 
T1(j) = Minimum time taken to leave station S2, j-1 + Extra cost incurred to change the assembly line + Time spent in station S1, j 
T1(j) = T2(j-1) + t2, j + a1, j

The minimum time T1(j) is given by the minimum of the two obtained in cases #1 and #2. 
T1(j) = min((T1(j-1) + a1, j), (T2(j-1) + t2, j + a1, j)) 

Similarly, the minimum time to reach station S2, j is given by: 
T2(j) = min((T2(j-1) + a2, j), (T1(j-1) + t1, j + a2, j))

The total minimum time taken by the car chassis to come out of the factory is given by: 
Tmin = min(Time taken to leave station Si,n + Time taken to exit the car factory) 
Tmin = min(T1(n) + x1, T2(n) + x2)
 A car factory has two assembly lines, each with n stations. A station is denoted by Si,j where i is either 1 or 2 and indicates the assembly line the station is on, and j indicates the number of the station. The time taken per station is denoted by ai,j. Each station is dedicated to some sort of work like engine fitting, body fitting, painting, and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The parallel stations of the two assembly lines perform the same task. After it passes through station Si,j, it will continue to station Si,j+1 unless it decides to transfer to the other line. Continuing on the same line incurs no extra cost, but transferring from line i at station j – 1 to station j on the other line takes time ti,j. Each assembly line takes an entry time ei and exit time xi which may be different for the two lines. Give an algorithm for computing the minimum time it will take to build a car chassis.
 
 
 */

package loveDSA;

public class AssemblyLineSche9 {

    static int NUM_LINE = 2;
    static int NUM_STATION = 4;
     
    // Utility function to find minimum of two numbers
    static int min(int a, int b)
    {
        return a < b ? a : b;
         
    }
     
    static int carAssembly(int a[][], int t[][], int e[], int x[])
    {
        int T1[]= new int [NUM_STATION];
        int T2[] =new int[NUM_STATION] ;
        int i;
     
        // time taken to leave first station in line 1
        T1[0] = e[0] + a[0][0];
         
        // time taken to leave first station in line 2
        T2[0] = e[1] + a[1][0];
     
        // Fill tables T1[] and T2[] using
        // the above given recursive relations
        for (i = 1; i < NUM_STATION; ++i)
        {
            T1[i] = min(T1[i - 1] + a[0][i],
                    T2[i - 1] + t[1][i] + a[0][i]);
            T2[i] = min(T2[i - 1] + a[1][i],
                    T1[i - 1] + t[0][i] + a[1][i]);
        }
     
        // Consider exit times and return minimum
        return min(T1[NUM_STATION-1] + x[0],
                    T2[NUM_STATION-1] + x[1]);
    }
     
     
    // Driver code
    public static void main (String[] args)
    {
        int a[][] = {{4, 5, 3, 2},
                    {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5},
                    {0, 9, 2, 8}};
        int e[] = {10, 12}, x[] = {18, 7};
     
        System.out.println(carAssembly(a, t, e, x));   
     
    }
}
