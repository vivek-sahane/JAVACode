import java.util.*;           //find the output of no rase to power 5^4=625

public class recursionlec2p2 {

    static int pow1 (int p, int q){

        //base case
        if(q==0) return 1;
        //recursive work and self work
        return pow1(p,q-1)*p ;
    }
    //method 2
    static int pow2 (int p, int q){
        if (q==0)return 1;

            int smallPow = pow2(p,q/2);

        if(q%2==0){
            return smallPow * smallPow ;

        }
        return p* smallPow * smallPow ;
    }

    public static void main(String[] args) {
        System.out.println(pow1(5,4));
    }
}
