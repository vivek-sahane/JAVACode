public class sortinglec4p1 {

    /*
    Move all zeroes to the end of array without changing first elements order
    Input 0,5,0,3,4,2
    output 5,3,4,2,0,0
     */

    public static void main(String[] args) {
        int[]arr = {0,1,10,5,0,4};
        int n = arr.length ;

        for(int i=0 ; i<n ;i++){
            for(int j = 0 ; j<n-i-1 ; j++){

                if(arr[j]==0 && arr[j+1] != 0){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp ;
                }
            }
        }
        for(int val : arr){
            System.out.print(val +" ");
        }
    }

}
