package Recursion;
import java.util.*;

public class noOfStairCase {
    public static int noOfWays(int n){
        int result=0;
        if(n<=1)return n;
        else result =noOfWays(n-1)+noOfWays(n-2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n= sc.nextInt();
        int result= noOfWays(n+1);
        System.out.println("Possible no of ways is :"+ result);
    }
}
