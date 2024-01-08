import java.util.Arrays;

public class LeetcodefindMisiinfnumber {


        public int missingNumber(int[] nums) {         //M1 linear search time complexity = o(logn)
            int n = nums.length;
            Arrays.sort(nums);
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=i;
            }
            for(int i=0;i<n;i++){
                if(a[i]==nums[i]) continue;
                else return a[i];
            }
            return n;
        }

        public int missingNumber2(int[] nums) {          //M2 time complexity O(n)
            int n=nums.length;
            int totalsum=n*(n+1)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];

            }
            return totalsum-sum;
        }


    public static void main(String[] args) {

    }
}


