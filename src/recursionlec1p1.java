import java.util.*;               //print natural no. from 1 to n

public class recursionlec1p1 {

    static void printIncreasing(int n){

        //base case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //sub problem
        printIncreasing(n-1);
        //main problem , self work
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printIncreasing(n);
    }
}

