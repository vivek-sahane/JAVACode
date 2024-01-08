public class binarysearchlec1p1target {

    static boolean binarySearch(int[]a ,int target ){      // M1, Time Complexity = O(n)

        int st = 0, end = a.length;
        int ans = 0 ;
        while(st<=end){

            int mid = st+(end-st)/2 ;

            if( a[mid] ==target)return true ;
            else if (a[mid]>target) end = mid-1 ;
            else st=mid+1 ;
        }
        return false;
    }

    static boolean recBinarySearch(int[]a,int st , int end,int target){        //M2 , Time Complexity = O(logn)

        if(st>end)return false ;
        int mid = (st+end)/2;
        if(target==a[mid]){
            return true;
        }
        else if(target < a[mid]){
            return recBinarySearch(a,st ,mid-1,target);  //subproblem
        }
        else{
            return recBinarySearch(a,mid+1,end , target);  //subproblem
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int target =0 ;
        while(target<=10){
            System.out.printf( "%d exist in arr :%b\n",target ,recBinarySearch(a,0,a.length-1,target));
            target ++ ;
        }

    }
}
