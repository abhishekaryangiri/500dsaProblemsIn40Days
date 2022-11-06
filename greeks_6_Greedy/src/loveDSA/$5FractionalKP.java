/*
 Fractional Knapsack Problem
 
 Given the weights and values of N items, in the form of {value, weight} put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In Fractional Knapsack, we can break items for maximizing the total value of the knapsack

Note: In the 0-1 Knapsack problem, we are not allowed to break items. We either take the whole item or don’t take it. 

Input: arr[] = {{60, 10}, {100, 20}, {120, 30}}, W = 50
Output: 240 
Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. 
Hence total price will be 60+100+(2/3)(120) = 240

Input:  arr[] = {{500, 30}}, W = 10
Output: 166.667

Follow the given steps to solve the problem using the above approach:

Calculate the ratio(value/weight) for each item.
Sort all the items in decreasing order of the ratio.
Initialize res =0, curr_cap = given_cap.
Do the following for every item “i” in the sorted order:
If the weight of the current item is less than or equal to the remaining capacity then add the value of that item into the result
Else add the current item as much as we can and break out of the loop.
Return res.

 */
package loveDSA;

import java.util.Arrays;
import java.util.Comparator;

public class $5FractionalKP {
    
    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr,
                                      int capacity)
    {
        // Sorting items by value/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1,
                               ItemValue item2)
            {
                double cpr1
                    = new Double((double)item1.value
                                 / (double)item1.weight);
                double cpr2
                    = new Double((double)item2.value
                                 / (double)item2.weight);
 
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
 
        double totalValue = 0d;
 
        for (ItemValue i : arr) {
 
            int curWt = (int)i.weight;
            int curVal = (int)i.value;
 
            if (capacity - curWt >= 0) {
 
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {
 
                // Item cant be picked whole
                double fraction
                    = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
    }
 
    // Item value class
    static class ItemValue {
 
        int value, weight;
 
        // Item value function
        public ItemValue(int val, int wt)
        {
            this.weight = wt;
            this.value = val;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        ItemValue[] arr = { new ItemValue(60, 10),
                            new ItemValue(100, 20),
                            new ItemValue(120, 30) };
 
        int capacity = 50;
 
        double maxValue = getMaxValue(arr, capacity);
 
        // Function call
        System.out.println(maxValue);
    }
}
