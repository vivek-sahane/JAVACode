public class recursion4 {            // print the array element

    static void printArray(int[]arr,int idx){

        if(idx==arr.length-1)return;

        //Self Work
        System.out.println(arr[idx]);

        //Recursive Work
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int []arr = {5,6,7,8,9};
        printArray(arr,0);
    }
}
