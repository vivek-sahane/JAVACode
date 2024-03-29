import java.util.Scanner;

public class arraylec7p5rotatematrix {     //baki ahe

    static void printMatrix(int[][]matrix){

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeMatrix(int[][]matrix ,int r ,int c){


        for(int i=0 ; i<c; i++){
            for(int j=i ; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[]arr){

        int i=0, j=arr.length-1  ;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]matrix , int n){
        //transpose
        transposeMatrix(matrix,n,n);

        //Reverse each row of transpose matrix
        for(int i=0; i<n ; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix, n);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}
