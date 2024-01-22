import java.util.Scanner;

public class recursion1 {           // k multiples of n

    static void printMultiples(int n,int k){

        if(k==1){
            System.out.println(n);
            return ;
        }
         printMultiples(n,k-1);

        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        printMultiples(n,k);
    }
}
