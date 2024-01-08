public class sorting1Bubblesort {

    static void bubbleSort(int []a){

       int n = a.length ;
       // n_1 iterations , passes

       for(int i=0 ; i<n ; i++) {
           for (int j = 0; j < n - i - 1; j++) {

               /*
               Last i element are already at correct sorted positions , so no need to check them
                */

               if (a[j] > a[j + 1]) {
                   //swap - a[j] , a[j+1]
                   int temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
               }
           }
       }
    }
    public static void main(String[] args) {
        int []a ={7,6,5,4,3};
        bubbleSort(a);
        for(int val: a){
            System.out.print(val +" ");
        }
    }
}
