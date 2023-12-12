import java.util.*;             //sum of all natural numbers

public class recursionlec2p3 {

    static int sumnatural(int n){

        //base case
        if(n==0) return 0;

        return sumnatural( n-1)+n ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumnatural( n));
    }

}
