public class binarysearchlec3p1search2Dmatrix {

   /*
   Search given number in 2D matrix           Time complexity=o(log(m*n))
    */
        public static boolean searchMatrix(int[][] a, int target) {      //M1 for type 1 of matrix where last element of 1st row is less than first element of 2nd row
            //n is number of row , m is number of colomn
            int n= a.length , m= a[0].length;
            int st=0,end=n*m-1;
            while(st<=end){

                int mid = st+(end-st)/2;
                int midEle= a[mid/m][mid%m];
                if(midEle == target) return true;
                if(midEle > target){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            return false;
        }

        public static boolean searchMatrix2(int[][] matrix, int target) {        //M2 for type 2 of matrix O(n+m)
            int row = 0;
            int col = matrix[0].length -1;
            while( row < matrix.length && col >= 0){
                if(matrix[row][col] == target){
                    return true;
                }
                else if(matrix[row][col] < target){
                    row++;
                }
                else{
                    col--;
                }
                if(col == -1 && row < matrix.length-1){
                    row++;
                    col = matrix[row].length-1;
                }
            }
            return false;
        }

    public static void main(String[] args) {

    }
    }


