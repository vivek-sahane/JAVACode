import java.util.Scanner;

public class recursion2 {          // Alternating Sum i.e 1+2-3+4-5=-3

    static int seriesSum(int n){

        if(n==0)return 0;

        if(n%2==0){
          return  seriesSum(n-1)-n;
        }
        else{
            return seriesSum(n-1)+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
