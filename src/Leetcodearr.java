public class Leetcodearr {
                                    //print the first and last index of target number in array


        public static int[] searchRange(int[] nums, int target) {
            int first = -1, last = -1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == target){
                    if(first == -1){
                        first = i;
                    }
                    last = i;
                }
            }
            return new int[]{first, last};
        }

    public static void main(String[] args) {

            int[] nums = {1, 2, 3, 4, 5, 5};
            int[] result = searchRange(nums, 5);

            System.out.println("First occurrence index: " + result[0]);
            System.out.println("Last occurrence index: " + result[1]);


    }
}
