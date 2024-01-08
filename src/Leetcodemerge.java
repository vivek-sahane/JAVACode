public class Leetcodemerge {

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;          //intialise the k value from end

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 4, 0, 0, 0, 0, 0}; // Increase the size to accommodate merged elements
        int nums2[] = {5, 6, 7, 8, 9};
        merge(nums1, 4, nums2, 5);

        // Print the merged array
        for (int val : nums1) {
            System.out.println(val);
        }
    }
}
