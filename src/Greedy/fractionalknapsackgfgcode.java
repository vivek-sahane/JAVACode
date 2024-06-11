package Greedy;
import java.util.*;
public class fractionalknapsackgfgcode {
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b) -> (a.value*b.weight) - (b.value*a.weight));

        double res = 0;

        for(int i = n-1;i>=0;i--)
        {
            if(arr[i].weight <= W)
            {
                res = res + arr[i].value;
                W = W - arr[i].weight;
            }
            else
            {
                res = res + arr[i].value *((double)W/(double)arr[i].weight);
                break;
            }
        }
        return res;

    }
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }

    public static void main(String[] args) {

    }
}
