import java.io.*;
import java.util.*;

public class Hackerrank_intlongbyte {

            /*
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
             */


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // number of test cases

            for (int i = 0; i < t; i++) {
                try {
                    long x = scanner.nextLong();
                    System.out.println(x + " can be fitted in:");

                    if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                } catch (Exception e) {
                    System.out.println(scanner.next() + " can't be fitted anywhere.");
                }
            }

            scanner.close();
        }
    }



