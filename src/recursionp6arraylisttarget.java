import java.util.ArrayList;

public class recursionp6arraylisttarget {

    static ArrayList<Integer>allIndices(int[]a,int n,int target, int idx){
        //base case
        if(idx>=n){
            return new ArrayList<Integer>();
        }
        //self work
        ArrayList<Integer> ans = new ArrayList<>();
        if(a[idx]==target){
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallAns = allIndices(a,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {

    }
}
