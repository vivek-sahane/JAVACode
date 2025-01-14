package Array;
import java.util.*;

public class UserMainCode {
    public static int getSum_LS_Positive(int[] input1, int input2) {
        int maxLen = Integer.MIN_VALUE;
        int curr =0;
        for(int i=0;i<input2;i++){
            if(input1[i] >= 0){
                curr++;
                maxLen = Math.max(maxLen,curr);
            }
            else{
                curr = 0;
            }
        }

        int currSum =0;
        int currLen =0;
        int result = 0;
        for(int i = 0;i<input2;i++){
            if(input1[i] >=0){
                currSum = currSum + input1[i];
                currLen++;
                if(currLen == maxLen) {
                    result += currSum;
                }
            }
            else{
                currSum=0;
                currLen=0;
            }
        }

        if(result == 0){
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input2 = sc.nextInt();
        int[] input1 = new int[input2];

        for(int i=0; i<input2;i++){
            input1[i] = sc.nextInt();
        }
        System.out.println(getSum_LS_Positive(input1,input2));
    }
}
