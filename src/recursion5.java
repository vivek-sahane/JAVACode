
public class recursion5 {        // max in array

    static int maxInArray(int[]arr,int idx){

        if(idx ==arr.length-1)return arr[idx];

         int smallAns = maxInArray(arr,idx+1);

        return Math.max(arr[idx],smallAns);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(maxInArray(arr,0));
    }
}
