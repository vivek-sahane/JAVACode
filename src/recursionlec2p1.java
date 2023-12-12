import java.util.*;                // to print sum of given number

public class recursionlec2p1 {

    static int sod(int n){

        //base case
        if(n>=0 && n<=9){
            return n ;
        }
        //recursive work = small ans   n/10 for print other no except last digit
        int smallAns = sod(n/10);
        //self work        n%10 to print last digit
        return smallAns + n%10 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sod(543));
    }
}
