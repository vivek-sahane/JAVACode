public class LeetcodemiddleIdx {

        public int findMiddleIndex(int[] nums) {
            int totalSum = totalSumOfArray(nums);
            int leftSum = 0;
            for(int i= 0; i < nums.length; i++) {
                int rightSum = totalSum - leftSum - nums[i];
                if(leftSum == rightSum) {
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }

        private int totalSumOfArray(int[] nums) {
            int sum = 0;
            for(int num : nums) {
                sum += num;
            }
            return sum;
        }

    public static void main(String[] args) {

    }
}
