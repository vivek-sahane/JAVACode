import java.util.Scanner;

public class arraylec3p1 { //number of pairs whose sum is equal to target value

    public static int pairsum(int arr[],int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { //for first number
            for (int j = i + 1; j < n; j++) {//for second number
                if (arr[i] + arr[j]== target) {
                    ans++;
                }
            }
        }
        return ans ;
    }
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array");
            int n = sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter elements "+n);
            for(int i=0 ; i<arr.length ; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter target sum");
            int target = sc.nextInt();
                System.out.println(pairsum(arr,target));
            }

        }


