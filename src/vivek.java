import java.util.Scanner;
import  java.util.*;
public class vivek {   //print sum of matrix from r1 row to r2 row and l1 colomn to l2 colomn

    static int findsum( int matrix[][],int l1 ,int r1 ,int l2 , int r2 ){

        int sum =0 ;
        for(int i= l1 ; i<=l2 ;i++){
            for (int j= r1 ; j <= r2 ; j++ ){
                sum+= matrix [i][j];
            }
        }
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows and colomns of matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the values of l1 , r1 , l2 , r2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int s3 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle sum" + findsum (matrix, l1, r1, s3, r2));
    }
}
