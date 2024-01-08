public class sortinglec4p2 {

    /*
    Given a fruit name sort them in alphabetic order using
    Selection Sort
     */
    static void sortFruits(String[]fruits){

        int n = fruits.length ;
        for(int i=0 ; i<n-1 ; i++ ){
            int min_index = i ;
            for(int j=i+1 ; j< n ; j++){
                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index = j ;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index]=temp ;
        }
    }

    public static void main(String[] args) {

        String []fruits = {"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for(String val : fruits){
            System.out.print(val +" ");
        }
    }
}
