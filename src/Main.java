import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 1, 5, 4};

        int n = nums.length;

        // Array to store the next smaller element to the left
        int[] lefts = new int[n];
        Arrays.fill(lefts, -1); // Initialize with -1

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) { // Traverse to the left
                if (nums[j] < nums[i]) {
                    lefts[i] = j;
                    break;
                }
            }
        }

        // Array to store the next smaller element to the right
        int[] rights = new int[n];
        Arrays.fill(rights, -1); // Initialize with -1

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) { // Traverse to the right
                if (nums[j] < nums[i]) {
                    rights[i] = j;
                    break;
                }
            }
        }

        // Print results
        System.out.print("Lefts: ");
        for (int i = 0; i < lefts.length; i++) {
            System.out.print(lefts[i] + " ");
        }
        System.out.println();

        System.out.print("Rights: ");
        for (int i = 0; i < rights.length; i++) {
            System.out.print(rights[i] + " ");
        }
    }
}
