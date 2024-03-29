import java.util.Scanner;

public class arraylec7p3mulmatrix {

    static void printMatrix(int[][]matrix){

        for(int i=0 ; i< matrix.length ;i++ ){
            for(int j=0 ; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void mul(int [][]a , int r1 ,int c1 , int[][]b , int r2 , int c2){

        if(r2 != c1){
            System.out.println("Mul not possible , wrong input");
            return ;
        }
        int mul[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices:");
        printMatrix(mul);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colomns of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r1; i++) {    //row
            for (int j = 0; j < c1; j++) {   //colomns
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and colomns of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r2; i++) {    //row
            for (int j = 0; j < c2; j++) {   //colomns
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        mul(a ,r1 ,c1,b,r2 , c2);
    }
}

