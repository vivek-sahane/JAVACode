public class sortinglec7count2 {

    static int findMax(int[]arr){

        int mx=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx ;
    }

    static void displayArr(int []arr){

        for(int val :arr){
            System.out.print(val +" ");
        }
    }

    static void countSort(int[]arr){

        int n = arr.length ;
        int[]output = new int [n];
        int max = findMax(arr);
        int[]count = new int [max+1];

        for(int i=0 ; i<arr.length ; i++ ){    //make frequency array
            count[arr[i]]++ ;
        }
        //make prefix sum array of coun array
        for(int i=1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }
        /*
        Find the index of each element in the original array & put it in output array
         */
        for(int i=n-1 ; i>=0 ;i--){
            int idx = count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        //copy all elements of output to arr
        for(int i=0 ; i< n ; i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {

        int []arr = {1,4,5,2,2,5};
        countSort(arr);
        displayArr(arr);
    }
}
