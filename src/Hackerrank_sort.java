import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Hackerrank_sort {

  /*
  Sort the given numbers
   */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            // Read the array of BigDecimal strings
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }

            // Sort the array using a custom comparator
            Arrays.sort(arr, new BigDecimalComparator());

            // Print the sorted array
            for (String s : arr) {
                System.out.println(s);
            }

            scanner.close();
        }
    }

    class BigDecimalComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Convert strings to BigDecimal for numerical comparison
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);

            // Compare in descending order
            return bd2.compareTo(bd1);
        }
    }



