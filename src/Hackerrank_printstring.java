import java.util.Scanner;

public class Hackerrank_printstring {

    /*
    Print string as it is
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int lineNumber = 0;
            while (scanner.hasNextLine()) {         //returns false, indicating the end of input.
                lineNumber++;
                String line = scanner.nextLine();
                System.out.println(lineNumber + " " + line);
            }

            scanner.close();
        }
    }



