import java.util.*;               //print natural no from n to 1

public class recursionlec1p2 {

    static void printDecreasing (int n){

        //base case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //self work
        System.out.println(n);
        //sub problem
        printDecreasing (n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printDecreasing(n);
    }
}
