package BinarySearch;

public class FindMinInRotatedSortedArray {
    public int findMin(int[]a, int n) {
        int low =0;
        int high =n-1;
        int ans =Integer.MAX_VALUE;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(a[low] < a[mid]) {
                ans = Math.min(ans,a[low]);
                low = mid +1;
            }
            else {
                ans = Math.min(ans,a[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
