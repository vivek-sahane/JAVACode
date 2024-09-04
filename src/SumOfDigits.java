
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < t; i++) {
            // Read the two-digit number
            int n = scanner.nextInt();

            // Calculate the sum of the digits
            int sum = (n / 10) + (n % 10);

            // Print the result
            System.out.println(sum);
        }

        scanner.close();
    }
}

