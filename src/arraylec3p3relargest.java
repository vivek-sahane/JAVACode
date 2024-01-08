import java.util.*;

public class arraylec3p3relargest {  //largest number and second largest and third largest number

    static int findmax(int arr[]){
        int max = Integer.MIN_VALUE ; // initialise with minus infinity
        for (int i =0 ; i< arr.length ; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max ;
    }
    static int findSecondmax(int arr[]){
        int max = findmax(arr);            //calling function
        for(int i=0 ;i< arr.length  ; i++){
            if(arr[i]== max){
                arr[i]=Integer.MIN_VALUE ;
            }
        }
       int secondmax =findmax(arr);     //calling function for retraverssing array
        return secondmax ;
    }
    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            max1 = Math.max(max1, nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max1){
                max2 = Math.max(max2, nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max1 && nums[i] != max2){
                max3 = Math.max(max3, nums[i]);
            }
        }
        if(max3 != Long.MIN_VALUE){
            return (int)max3;
        }
        return (int)max1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Elements of array"+n);
        for(int i=0 ; i<arr.length ; i++){
            arr [i]= sc.nextInt();
        }
        System.out.println(findSecondmax(arr));
    }
}
