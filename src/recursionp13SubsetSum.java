public class recursionp13SubsetSum {

    static void subsetSum(int[]a, int n,int idx , int sum){

        //base case
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        //include
        subsetSum(a,n,idx+1,sum+a[idx]);
        //excluded
        subsetSum(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
     int[]a={2,4,5};
     subsetSum(a,a.length,0,0);
    }
}
