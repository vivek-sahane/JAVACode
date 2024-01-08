import java.util.Scanner;

public class Hackerrank_isPalindrome {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the input string
            String s = scanner.next();

            // Check if the string is a palindrome
            if (isPalindrome(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            scanner.close();
        }

        private static boolean isPalindrome(String s) {
            // Convert the string to lowercase to make the comparison case-insensitive
            s = s.toLowerCase();

            // Compare the original string with its reverse
            return s.equals(new StringBuilder(s).reverse().toString());
        }
    }



