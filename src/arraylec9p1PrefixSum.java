import java.util.Scanner;

public class arraylec9p1PrefixSum {

    static int findSum(int [][]matrix, int l1 , int r1, int l2, int r2){     //M1  calculate row-wise and colomn wise sum

        int sum =0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static int findSum2(int[][]matrix,int l1,int r1,int l2,int r2){    //M2 Traverse horizontLally to calculate row wise prefx sum

        int sum=0;
        for(int i=l1 ; i<=l2 ; i++){

            if(r1>=1){
                sum += matrix[i][r2]-matrix[i][r1-1];
            }else{
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    static void findprefixSummatrix(int[][]matrix){        //M2

        int r = matrix.length;
        int c = matrix[0].length;
        //traverse horizontally to calculate row wise prefix sum

        for(int i=0; i<r ; i++){
            for(int j=1 ; j< c ;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //traverse vertically to calculate column wise sum

        for(int j=0 ;j<c ;j++){    //fixing
            for(int i=1 ; i<r ; i++){   //colomn
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int findSum3(int[][]matrix , int l1,int r1,int l2,int r2){

        int ans=0, sum=0 , up=0, left=0, leftup=0 ;
        findprefixSummatrix(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1){
            left = matrix[l2][r1-1];
        }
        if(l1>=1){
            up = matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftup= matrix[l1-1][r1-1];
        }
        ans = sum-up-left+leftup;
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle sum"+findSum(matrix,l1,r1,l2,r2));
    }
}
