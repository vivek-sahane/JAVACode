package GeeksForGeeks;

public class reachAGivenScoreDP {

    public long count(int n) {

        int[]scores = {3,5,10};
        int[]arr = new int[n+1];
        arr[0]=1;
        for(int s:scores){
            for(int i=s;i<=n;i++){
                arr[i] +=arr[i-s];
            }
        }
        return arr[n];
    }

    public static void main(String[] args) {

    }
}
