package Array;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = 0;
            int correctAns = 0;

            // If n < m, it's impossible to determine the correct path
            if (n < m) {
                System.out.println(-1);
                continue; // Skip to next test case
            }

            // If n >= m, we need to determine the minimum number of people to ask
            while (m >= 0) {
                n--;  // Simulate asking one truth teller
                correctAns++;
                x++;

                if (correctAns > m) {
                    System.out.println(x);
                    break;
                }

                m--;  // Simulate asking one liar
                x++;

                // To handle the case where liars are exhausted
                if (m == 0 && correctAns <= m) {
                    System.out.println(x + n);
                    break;
                }
            }
        }
        sc.close();
    }
}
