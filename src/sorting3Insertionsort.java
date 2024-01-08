public class sorting3Insertionsort {

    static void insertionSort( int[]a){

        int n = a.length ;
        for(int i=0 ; i<n ; i++){
            int j=i ;

            while(j>0 && a[j] < a[j-1]){

                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j-- ;
            }
        }
    }

    public static void main(String[] args) {
        int[]a = {8,3,6,5,4,2};
        insertionSort(a);
        for(int val:a){
            System.out.print(val +" ");
        }
    }
}
