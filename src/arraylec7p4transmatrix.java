import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylec7p4transmatrix {

    static void printMatrix(int[][]matrix){

        for(int i=0 ; i< matrix.length ;i++ ){
            for(int j=0 ; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findMatrix(int[][]matrix,int r , int c){   //M1   more time complexity 0ms

        int trans[][]= new int[c][r];
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){
                trans[i][j]= matrix[j][i];
            }
        }
        return trans;
    }
    static void findMatrix2(int[][]matrix,int r , int c){   //M2 by not using 2nd array

        for(int i=0;i<c ; i++){
            for(int j=0 ; j<r ; j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public List<List<Integer>> transpose(List<List<Integer>> matrix) {   // M3  less timecomplexity
        int n = matrix.size();
        int m = matrix.get(0).size();

        List<List<Integer>> ans = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(matrix.get(i).get(j));
            }
            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix using findMatrix:");
        int[][] transposedMatrix1 = findMatrix(matrix, r, c);
        printMatrix(transposedMatrix1);


    }
}
