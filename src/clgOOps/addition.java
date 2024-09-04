
package clgOOps;

import java.util.Scanner;
import java.util.Arrays;

        public class addition {

            public static int[] nthFibonacci(int a) {
                int[] dp = new int[a + 1];
                if (a >= 1) {
                    dp[0] = 0;
                    dp[1] = 1;
                    for (int i = 2; i <= a; i++) {
                        dp[i] = dp[i - 1] + dp[i - 2];
                    }
                } else {
                    dp[0] = 0;
                }
                return dp;
            }

            private static int[] nthfibb(int a) {
                int[] ans = new int[a + 1];
                if (a >= 1) {
                    ans[0] = 0;
                    ans[1] = 1;
                    int fir = 0;
                    int sec = 1;
                    for (int i = 2; i <= a; i++) {
                        ans[i] = fir + sec;
                        fir = sec;
                        sec = ans[i];
                    }
                } else {
                    ans[0] = 0;
                }
                return ans;
            }

            private static int factorial(int a) {
                int ans = 1;
                for (int i = 1; i <= a; i++) {
                    ans = ans * i;
                }
                return ans;
            }

            private static boolean isPrime(int a) {
                if (a <= 1) return false;
                if (a <= 3) return true;
                if (a % 2 == 0 || a % 3 == 0) return false;
                for (int i = 5; i * i <= a; i += 6) {
                    if (a % i == 0 || a % (i + 2) == 0) {
                        return false;
                    }
                }
                return true;
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int a = sc.nextInt();

                System.out.println("Fibonacci sequence up to " + a + ": " + Arrays.toString(nthFibonacci(a)));
                System.out.println("Factorial of " + a + ": " + factorial(a));
                System.out.println("Is " + a + " a prime number? " + isPrime(a));

                System.out.print("Enter size of Array: ");
                int n = sc.nextInt();

                int[] nums = new int[n];
                System.out.println("Enter the numbers of Array:");
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }

                int prefSum = 0;
                for (int i = 0; i < n; i++) {
                    prefSum += nums[i];
                }

                if (prefSum > 100) {
                    System.out.println("Jay Shree Ram");
                } else {
                    System.out.println("Jay Bajrangbali");
                }
            }
        }


