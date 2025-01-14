package TCSCODEVITA;

import java.util.*;
import static java.lang.Math.*;

public class FruitBowl {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] points = new int[N][2];
        for(int i=0; i<N; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Arrays.sort(points,(a,b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);
        List<int[]> lowerHull = new ArrayList<>();
        for(int [] point : points) {
            while(lowerHull.size() >= 2 && crossProduct(lowerHull.get(lowerHull.size()-2), lowerHull.get(lowerHull.size() -1), point)<= 0){
                lowerHull.remove(lowerHull.size() - 1);
            }
            lowerHull.add(point);
        }

        double perimeter = 0.0;
        for(int i=0; i< lowerHull.size()-1; i++) {
            perimeter += distance(lowerHull.get(i)[0], lowerHull.get(i)[1], lowerHull.get(i+1)[0],lowerHull.get(i+1)[1]);
        }

        System.out.print((int) Math.round(perimeter));
    }

    public static int crossProduct(int[] a, int[] b, int[] c ) {
        return (b[0] - a[0]) * (c[1] - a[1]) - (b[1] - a[1] )* (c[0] - a[0]);
    }
}
