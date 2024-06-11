package PriorityQueue;
import java.util.*;

public class kClosestPointToOrigin {
    public class Point implements Comparable<Point>{
        int x;
        int y;
        double distance;
        int i;

        // Constructor initialization
        public Point(int x, int y, double distance, int i) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.i = i;
        }

        @Override
        public int compareTo(Point p1) {
            // Sort the data on the basis of distance in ascending order
            return Double.compare(this.distance, p1.distance);
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        // 1. Creation of a min-heap - O(n)
        PriorityQueue<Point> minheap = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            // Euclidean distance formula
            // sqrt(x^2 + y^2)
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);

            minheap.add(new Point(points[i][0], points[i][1], distance, i));
        }
        // Deletion from the min-heap until k times - O(k.log n)
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            Point point = minheap.remove();
            result[i] = new int[]{points[point.i][0], points[point.i][1]};
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
