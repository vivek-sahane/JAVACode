package SegmentTree;
import java.util.*;

public class SegmentTree {

    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];  // Allocate sufficient space for segment tree
    }

    public static int buildST(int[] arr, int i, int start, int end) {
        if(start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        buildST(arr, 2 * i + 1, start, mid);
        buildST(arr, 2 * i + 2, mid + 1, end);
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if(qj < si || qi > sj) {  // Non-overlapping
            return 0;
        }
        if(si >= qi && sj <= qj) {  // Complete overlap
            return tree[i];
        }

        int mid = (si + sj) / 2;
        int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
        int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
        return left + right;
    }

    public static int getSum(int[] arr, int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);  // Fixed the range
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(idx < si || idx > sj) {  // Non-overlapping condition corrected
            return;
        }

        tree[i] += diff;

        if(si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }
    }

    public static void update(int[] arr, int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;
        updateUtil(0, 0, n - 1, idx, diff);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        System.out.println("Segment Tree:");
        for(int i = 0; i < 4 * n; i++) {
            if(tree[i] != 0)  // Print non-zero nodes
                System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of range (2, 5): " + getSum(arr, 2, 5));

        update(arr, 3, 10);  // Update index 3 to 10
        System.out.println("After update, sum of range (2, 5): " + getSum(arr, 2, 5));
    }
}
