import java.util.*;
                                    //sum of array in reange l and r
public class arraylec6p2 {

    public static int[] makePrefixsumArray(int[]arr){
        for (int i=0;i< arr.length ;i++){
            arr[i] += arr[i-1] ;
        }
        return arr ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Elements of array"+n);
        for(int i=0 ; i<arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefsum = makePrefixsumArray(arr);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while(q-- >0){
            System.out.println("Enter reange ");
            int l=sc.nextInt();
            int r =sc.nextInt();
            int ans = prefsum[r]-prefsum[l-1];
            System.out.println("sum"+ans);
        }
    }
}
