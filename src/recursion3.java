import java.util.Scanner;

public class recursion3 {     //GCD

    static int GCD(int x,int y){           //Method 1

        while(x%y!=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int iGCD(int x,int y){        //Method 2

        if(y==0){
            return x;
        }
        return iGCD(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        System.out.println(iGCD(x,y));
    }
}
