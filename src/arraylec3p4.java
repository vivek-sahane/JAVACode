import java.util.*;

public class arraylec3p4 {  //find which number is first repeated

        public static int RepeatingNumber(int arr[]){

            int n= arr.length ;
            for(int i=0 ; i<n ; i++){
                for(int j=i+1 ; j<n ; j++){
                    if(arr[i]==arr[j]){
                        return arr[i];
                    }
                }
            }
            return -1 ;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements "+n);
        for(int i =0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(RepeatingNumber(arr));
    }
}
