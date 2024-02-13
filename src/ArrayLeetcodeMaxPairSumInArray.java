public class ArrayLeetcodeMaxPairSumInArray {

       /*
Example 1:

Input: nums = [51,71,17,24,42]
Output: 88
Explanation:
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88.
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: No pair exists in nums with equal maximum digits.

        */
        public int maxSum(int[] nums) {
            int maxSum = -1;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int maxDigitI = getMaxDigit(nums[i]);
                    int maxDigitJ = getMaxDigit(nums[j]);

                    if (maxDigitI == maxDigitJ) {
                        int pairSum = nums[i] + nums[j];
                        maxSum = Math.max(maxSum, pairSum);
                    }
                }
            }

            return maxSum;
        }

        private int getMaxDigit(int num) {
            int maxDigit = 0;
            while (num > 0) {
                int digit = num % 10;
                maxDigit = Math.max(maxDigit, digit);
                num /= 10;
            }
            return maxDigit;
        }

    public static void main(String[] args) {

    }
}


