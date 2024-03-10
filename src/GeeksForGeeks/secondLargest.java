package GeeksForGeeks;
import java.util.*;
public class secondLargest {

        int print2largest(int arr[], int n) {
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secMax = max;
                    max = arr[i];
                } else if (arr[i] > secMax && arr[i] != max) {
                    secMax = arr[i];
                }
            }

            // If secMax remains as Integer.MIN_VALUE, there is no second-largest element.
            return secMax == Integer.MIN_VALUE ? -1 : secMax;
        }
    public static void main(String[] args) {

    }
}
