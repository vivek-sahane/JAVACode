import java.util.Arrays;

public class Leetcodeplusone {


        public static int[] plusOne(int[] digits) {
            int n = digits.length;
            int[] result = new int[n + 1];

            int carry = 1;

            for (int i = n - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                result[i + 1] = sum % 10;
                carry = sum / 10;
            }

            // If there is still a carry after the loop, set the first element in the result array
            if (carry > 0) {
                result[0] = carry;
                return result;
            } else {
                // If no carry, return the array without the extra leading element
                return Arrays.copyOfRange(result, 1, n + 1);
            }
        }

    public static void main(String[] args) {
        int []digits ={1,2,3,4};
        for(int val :plusOne(digits)){
            System.out.println(val + " ");
        }
    }
}



