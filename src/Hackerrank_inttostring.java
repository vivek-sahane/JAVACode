import java.util.Scanner;

public class Hackerrank_inttostring {

            /*
            Convert the integer to a string
             */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            // Convert the integer to a string
            String s = Integer.toString(n);

            // Check if the conversion is correct
            if (s.equals(Integer.toString(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }
    }




