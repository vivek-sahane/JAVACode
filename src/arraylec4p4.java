import java.util.*;

public class arraylec4p4 {   //Check if given number is repeated or not

   public static int[] makeFrequencyArray(int[]arr){
      int []freq = new int [100005];
      for(int i=0 ;i<arr.length ;i++){
          freq[arr[i]]++;
      }
      return freq ;
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
       int []freq =makeFrequencyArray(arr);
        System.out.println("Enter number of queries");
        int q =sc.nextInt();

        while(q>0){
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            q-- ;
        }
    }
}
