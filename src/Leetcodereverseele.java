import java.util.Scanner;

public class Leetcodereverseele {

        public static int reverse(int x) {

            long finalNum = 0;
            while (x != 0) {
                int lastDig = x % 10;        //To print last digit ,  gives remainder
                finalNum += lastDig ;        //add it into finalNum
                finalNum = finalNum*10 ;     //create room for next digit in left side
                x = x / 10;                  //make x to prepare for next iteration dividing 10
            }

            finalNum = finalNum /10 ;      //remove the zero empty the space
            if(finalNum > Integer.MAX_VALUE ||finalNum < Integer.MIN_VALUE){
                return 0 ;
            }
            if (x<0){
                return (int)(-1*finalNum) ;
            }
            return (int) finalNum ;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        System.out.println(reverse(x));
    }
    }


