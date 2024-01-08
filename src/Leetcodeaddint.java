import java.util.Scanner;

public class Leetcodeaddint {


        public static int addDigits(int num) {
            while (num >= 10)
            {
                int sum = 0;
                while (num != 0) {
                    int digits = num % 10;
                    sum += digits;
                    num /= 10;
                }
                num = sum;
            }

            return num;
        }

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(addDigits(num));
    }
    }



