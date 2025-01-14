package BinarySearch;

public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check boundary conditions to avoid out-of-bounds access
            boolean leftValid = (mid == 0 || arr[mid] != arr[mid - 1]);
            boolean rightValid = (mid == n - 1 || arr[mid] != arr[mid + 1]);

            if (leftValid && rightValid) {
                return arr[mid];
            }

            // If mid is even and arr[mid] == arr[mid + 1], or mid is odd and arr[mid] == arr[mid - 1]
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
