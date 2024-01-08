public class sortinglec8p3sort012 {

    static void displayArr(int []a){

        for(int val :a){
            System.out.print(val +" ");
        }
    }
    static void swap(int[]a,int x, int y){
        int temp =a[x];
        a[x]=a[y];
        a[y]=temp ;
    }
    static void sort012(int[]a){

        int lo=0 , mid=0 , hi=a.length-1;
        //explore the unknown region
        while(mid <= hi){
            if(a[mid]==0){
                swap(a,mid,lo);
                mid++ ;
                lo++ ;
            }
            else if(a[mid]==1){
                mid++ ;
            }
            else{
                swap(a,mid,hi);
                hi-- ;
            }
        }
    }

    public static void main(String[] args) {

        int[]a = {2,2,0,0,1,1,2,0,1,0};
        sort012(a);
        displayArr(a);
    }
}
