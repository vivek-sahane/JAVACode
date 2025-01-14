import java.util.*;

public class Solution {
    public static void canChange(String start, String target) {
        Character[] arr = new Character[start.length()];
        int n = start.length();
        for(int i=0;i<start.length();i++){
            arr[i]=start.charAt(i);
        }

        for(int i=1;i<=start.length()-1;i++){
            int j=i;
            while(arr[j] =='L' && arr[j-1]=='_' && j>1) {
                arr[j-1] = 'L';
                arr[j]='_';
                j--;
            }
            if(arr[j] =='L' && arr[j-1]=='_'){
                arr[j-1] = 'L';
                arr[j]='_';
            }
        }
        for(int i=n-1;i>=0;i--){
            int j=i;
            while(arr[j] =='R' && arr[j+1]=='_' && j<n-2){
                arr[j+1] = 'R';
                arr[j]='_';
                j++;
            }
            if(arr[j] =='R' && arr[j+1]=='_'){
                arr[j+1] = 'R';
                arr[j]='_';
                j++;
            }
        }

        for(int i=0;i<start.length();i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        canChange("_R","R_");
    }
}
