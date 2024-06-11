package Greedy;
import java.util.*;

public class fractionalKnapsackProblem {

    //function to get maximum value
    private static double getMaxValue(ItemValue[] arr,int capacity){
        //Sorting items by profit/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double cpr1 = (double)item1.profit / item1.weight;
                double cpr2 = (double)item2.profit / item2.weight;
                if(cpr1 < cpr2)
                    return 1;
                else if(cpr1 > cpr2)
                    return -1;
                else
                    return 0;
            }
        });
        double totalValue = 0;

        for(ItemValue i: arr){
            int curWt = i.weight;
            int curProfit = i.profit;

            if(capacity - curWt >= 0){
                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curProfit;
            }
            else{
                // Item can't be picked whole
                double fraction = (double) capacity / curWt;
                totalValue += (curProfit * fraction);
                capacity = 0; // Knapsack is full
                break;
            }
        }
        return totalValue;
    }

    static class ItemValue {
        int profit, weight;

        // Item value function
        public ItemValue(int profit, int wt){
            this.weight = wt;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        ItemValue[] arr = {
                new ItemValue(25,5),
                new ItemValue(75,10),
                new ItemValue(100,12),
                new ItemValue(50,4),
                new ItemValue(45,7),
                new ItemValue(90,9),
                new ItemValue(30,3),
        };

        int capacity = 37;
        // Function calling
        double maxValue = getMaxValue(arr, capacity);

        // Output the maximum profit
        System.out.println("Maximum Profit is: " + maxValue);
    }
}
