package SegmentTree;
import java.util.*;


public class ReangeMaxQueries {
    private int[] segTree;

    //construct segment tree accoding to maximum index at top
    private void buildSegmentTree(int[] heights, int start, int end , int stIdx) {

        // Base case if 0,0 or 1,1 or 2,2 like that condition
        if(start == end) {
            segTree[stIdx] = start;
            return;
        }

        int mid = start + (end - start) / 2;
        buildSegmentTree(heights, start,mid,2*stIdx);
        buildSegmentTree(heights, mid + 1, end,2*stIdx+1);

        // if leftside is greater then parent equal to leftmax else rightmax
        segTree[stIdx] = heights[segTree[2* stIdx]] >= heights[segTree[2*stIdx+1]]
                ? segTree[2*stIdx] : segTree[2*stIdx+1];

    }

    private int rangeMaxQuery(int[] heights, int qs, int qe, int start, int end, int stIdx) {
        if(start >= qs && end <= qe) {  // Totaloverlap
            return segTree[stIdx];
        }
        if(start > qe || end <qs) { // No overlap
            return Integer.MIN_VALUE;
        }

        //partial Overlap
        int mid = start + (end - start) /2;
        int leftMax = rangeMaxQuery(heights, qs, qe, start, mid, 2*stIdx);
        int rightMax = rangeMaxQuery(heights, qs, qe, mid+1, end, 2*stIdx+1);

        if(leftMax == Integer.MIN_VALUE) return rightMax;
        if(rightMax == Integer.MIN_VALUE) return leftMax;

        return heights[leftMax] >= heights[rightMax] ? leftMax : rightMax;
    }

    public int[] leftMostBuildingQueries (int[] heights, int[][] queries) {
        int n = heights.length;
        segTree = new int[4*n+1];
        int stIdx = 1;

        buildSegmentTree(heights,0,n-1,stIdx);

        int[] res = new int[queries.length];
        for(int i=0;i<queries.length; i++) {
            int[] query = queries[i];
            int alice = Math.min(query[0],query[1]);
            int bob = Math.max(query[0],query[1]);

            if(alice == bob || heights[bob] > heights[alice]) {
                res[i] = bob;
                continue;
            }

            int low = bob, high = n-1, ans = Integer.MAX_VALUE;
            while (low <= high) {
                int mid = low + (high-low) /2;
                int rmq = rangeMaxQuery(heights, low, mid, 0, n-1,stIdx);

                if (heights[rmq] > heights[alice]) {
                    high = mid -1;
                    ans = Math.min(ans, rmq);
                }
                else {
                    low = mid +1;
                }
            }
            res[i] = ans == Integer.MAX_VALUE ? -1 : ans;
        }
        return res;
    }
}
