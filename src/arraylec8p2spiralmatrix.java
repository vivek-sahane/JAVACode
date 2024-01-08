import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class arraylec8p2spiralmatrix {

    static void printMatrix(int[][]matrix){

        for(int i=0 ; i< matrix.length ;i++ ){
            for(int j=0 ; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralOrder(int[][]matrix, int r, int c){                 //Method -> 1

        int topRow =0 , bottomRow =r-1, leftCol=0, rightCol=c-1;
        int totalElements =0;

        while(totalElements < r*c){

            //topRow-> leftcol to rightcol
            for(int j=leftCol; j<= rightCol && totalElements < r*c ; j++){
                System.out.println(matrix[topRow][j]+" ");
                totalElements++ ;
            }
            topRow++;
            //rightcol-> topRow to bottomRow
            for(int i=topRow;i<bottomRow && totalElements < r*c;i++){
                System.out.println(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //bottomrow -> rightcol to leftcol
            for(int j=rightCol; j>=leftCol && totalElements < r*c ; j--){
                System.out.println(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftcol -> bottomRow to toprow
            for(int i=bottomRow;i>=topRow && totalElements < r*c ;i--){
                System.out.println(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
    }
    public static  List<Integer> spiralOrder2(int[][] matrix) {          //   Method -> 2
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int topRow = 0, bottomRow = matrix.length - 1, leftCol = 0, rightCol = matrix[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int j = leftCol; j <= rightCol; j++) {
                result.add(matrix[topRow][j]);
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                result.add(matrix[i][rightCol]);
            }
            rightCol--;

            // Traverse bottom row (if applicable)
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    result.add(matrix[bottomRow][j]);
                }
                bottomRow--;
            }

            // Traverse left column (if applicable)
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r*c ;
        System.out.println("Enter "+ total + " matrix values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix using findMatrix:");
        spiralOrder(matrix, r, c);

    }
}
