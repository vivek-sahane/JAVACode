package BinarySearch;

public class SearchInRotatedSortedArray {

    public int search(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] == target) {
                return mid;
            }

            // Left sorted portion
            if (a[st] <= a[mid]) {
                if (a[st] <= target && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right sorted portion
            else {
                if (a[mid] < target && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
