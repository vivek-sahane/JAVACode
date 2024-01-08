import java.util.Scanner;

public class Main {

    static int[][]pasclesTri(int n) {

       int [][]ans=new int[n][];
       for(int i=0;i<n;i++){
           ans[i]=new int[i+1];
           ans[i][0]=ans[i][i]=1;
           for(int j=1 ; j<i ; j++){
               ans[i][j]= ans[i-1][j]+ans[i-1][j-1];
           }
       }
       return ans;
    }
}
